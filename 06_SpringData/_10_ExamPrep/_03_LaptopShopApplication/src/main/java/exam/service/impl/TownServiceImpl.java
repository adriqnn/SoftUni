package exam.service.impl;

import exam.model.dto.xmlDTOs.TownRootSeedDTO;
import exam.model.entity.Town;
import exam.repository.TownRepository;
import exam.service.TownService;
import exam.util.ValidationUtil;
import exam.util.XMLParser;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class TownServiceImpl implements TownService {
    private static final String TOWNS_FILE_PATH = "src/main/resources/files/xml/towns.xml";

    private final TownRepository townRepository;

    private final XMLParser xmlParser;
    private final ModelMapper modelMapper;
    private final ValidationUtil validationUtil;

    @Autowired
    public TownServiceImpl(TownRepository townRepository, XMLParser xmlParser, ModelMapper modelMapper, ValidationUtil validationUtil) {
        this.townRepository = townRepository;
        this.xmlParser = xmlParser;
        this.modelMapper = modelMapper;
        this.validationUtil = validationUtil;
    }

    @Override
    public boolean areImported() {
        return this.townRepository.count() > 0;
    }

    @Override
    public String readTownsFileContent() throws IOException {
        return Files.readString(Path.of(TOWNS_FILE_PATH));
    }

    @Override
    public String importTowns() throws JAXBException, FileNotFoundException {
        StringBuilder resultFromSeed = new StringBuilder();

        xmlParser.fromFile(TOWNS_FILE_PATH, TownRootSeedDTO.class).getTowns().stream().filter(townSeedDTO -> {
            boolean isValid = validationUtil.isValid(townSeedDTO);
            resultFromSeed.append(isValid ? String.format("Successfully imported Town %s",townSeedDTO.getName()) : "Invalid town")
                    .append(System.lineSeparator());
            return isValid;
        }).map(townSeedDTO -> modelMapper.map(townSeedDTO, Town.class)).forEach(townRepository::save);

        return resultFromSeed.toString();
    }

    @Override
    public Town findByName(String name) {
        return this.townRepository.findByName(name).orElse(null);
    }
}
