package softuni.exam.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import softuni.exam.models.dto.xml.ApartmentSeedDTO;
import softuni.exam.models.dto.xml.ApartmentSeedRootDTO;
import softuni.exam.models.entity.Apartment;
import softuni.exam.models.entity.Town;
import softuni.exam.repository.ApartmentRepository;
import softuni.exam.service.ApartmentService;
import softuni.exam.service.TownService;
import softuni.exam.util.ValidationUtil;
import softuni.exam.util.XMLParser;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ApartmentServiceImpl implements ApartmentService {
    private static final String APARTMENTS_FILE_PATH = "src/main/resources/files/xml/apartments.xml";

    private final ApartmentRepository apartmentRepository;
    private final TownService townService;

    private final XMLParser xmlParser;
    private final ModelMapper modelMapper;
    private final ValidationUtil validationUtil;

    @Autowired
    public ApartmentServiceImpl(ApartmentRepository apartmentRepository, TownService townService, XMLParser xmlParser, ModelMapper modelMapper, ValidationUtil validationUtil) {
        this.apartmentRepository = apartmentRepository;
        this.townService = townService;
        this.xmlParser = xmlParser;
        this.modelMapper = modelMapper;
        this.validationUtil = validationUtil;
    }

    @Override
    public boolean areImported() {
        return this.apartmentRepository.count() > 0;
    }

    @Override
    public String readApartmentsFromFile() throws IOException {
        return Files.readString(Path.of(APARTMENTS_FILE_PATH));
    }

    @Override
    public String importApartments() throws IOException, JAXBException {
        ApartmentSeedRootDTO apartmentDTOs = xmlParser.fromFile(APARTMENTS_FILE_PATH,ApartmentSeedRootDTO.class);
        String resultFromImportApartments = apartmentDTOs.getApartments().stream().map(this::importApartment).collect(Collectors.joining(System.lineSeparator()));
        return resultFromImportApartments;
    }

    @Override
    public Apartment getById(long id) {
        return this.apartmentRepository.findById(id).orElse(null);
    }

    private String importApartment(ApartmentSeedDTO apartmentSeedDTO) {
        boolean isValid = validationUtil.isValid(apartmentSeedDTO);
        Optional<Town> optTown = this.townService.findByTownName(apartmentSeedDTO.getTownName());
        Optional<Apartment> optApartment = this.apartmentRepository.findByArea(apartmentSeedDTO.getArea());

        if(!isValid || (optTown.isPresent() && optApartment.isPresent() && (optApartment.get().getTown().getTownName().equals(optTown.get().getTownName())))){
            return "Invalid apartment";
        }
        Apartment apartment = modelMapper.map(apartmentSeedDTO, Apartment.class);
        apartment.setTown(this.townService.findByName(apartmentSeedDTO.getTownName()));
        this.apartmentRepository.save(apartment);
        return String.format("Successfully imported apartment %s - %.2f",apartment.getApartmentType().toString(),apartment.getArea());
    }
}
