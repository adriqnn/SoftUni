package softuni.exam.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import softuni.exam.models.dto.xml.ApartmentSeedDTO;
import softuni.exam.models.dto.xml.ApartmentSeedRootDTO;
import softuni.exam.models.dto.xml.OfferSeedDTO;
import softuni.exam.models.dto.xml.OfferSeedRootDTO;
import softuni.exam.models.entity.Agent;
import softuni.exam.models.entity.Apartment;
import softuni.exam.models.entity.Offer;
import softuni.exam.models.entity.Town;
import softuni.exam.models.entity.enums.ApartmentType;
import softuni.exam.repository.OfferRepository;
import softuni.exam.service.AgentService;
import softuni.exam.service.ApartmentService;
import softuni.exam.service.OfferService;
import softuni.exam.util.ValidationUtil;
import softuni.exam.util.XMLParser;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OfferServiceImpl implements OfferService {
    private static int yep;
    private static final String OFFERS_FILE_PATH = "src/main/resources/files/xml/offers.xml";

    private final OfferRepository offerRepository;
    private final AgentService agentService;
    private final ApartmentService apartmentService;

    private final XMLParser xmlParser;
    private final ModelMapper modelMapper;
    private final ValidationUtil validationUtil;

    @Autowired
    public OfferServiceImpl(OfferRepository offerRepository, AgentService agentService, ApartmentService apartmentService, XMLParser xmlParser, ModelMapper modelMapper, ValidationUtil validationUtil) {
        this.offerRepository = offerRepository;
        this.agentService = agentService;
        this.apartmentService = apartmentService;
        this.xmlParser = xmlParser;
        this.modelMapper = modelMapper;
        this.validationUtil = validationUtil;
    }

    @Override
    public boolean areImported() {
        return this.offerRepository.count() > 0;
    }

    @Override
    public String readOffersFileContent() throws IOException {
        return Files.readString(Path.of(OFFERS_FILE_PATH));
    }

    @Override
    public String importOffers() throws IOException, JAXBException {
        OfferSeedRootDTO offerSeedRootDTOs = xmlParser.fromFile("src/main/resources/files/xml/offers.xml",OfferSeedRootDTO.class);
        String resultFromImportOffers = offerSeedRootDTOs.getOffers().stream().map(this::importOffer).collect(Collectors.joining(System.lineSeparator()));
        return resultFromImportOffers;
    }

    @Override
    public String exportOffers() {
        ApartmentType apartmentType = ApartmentType.three_rooms;
        List<Offer> offers = this.offerRepository.findAllByApartmentType(apartmentType);
        return offers.stream().map(Offer::toString).collect(Collectors.joining(System.lineSeparator()));
    }

    private String importOffer(OfferSeedDTO offerSeedDTO) {
        boolean isValid = validationUtil.isValid(offerSeedDTO);
        Optional<Agent> optAgent = this.agentService.findByFirstName(offerSeedDTO.getAgent().getFirstName());

        if(!isValid || optAgent.isEmpty()) {
            return "Invalid offer";
        }

        Offer offer = modelMapper.map(offerSeedDTO, Offer.class);
        offer.setAgent(this.agentService.findByFirstNameAgent(offerSeedDTO.getAgent().getFirstName()));
        offer.setApartment(this.apartmentService.getById(offerSeedDTO.getApartment().getId()));
        this.offerRepository.save(offer);
        System.out.println(yep++);
        System.out.printf("added to database offer %d - %f - %s - %d - %d",offer.getId(),offer.getPrice(),offer.getPublishedOn().toString(),offer.getAgent().getId(),offer.getApartment().getId());
        return String.format("Successfully imported offer %.2f",offer.getPrice());

    }

}
