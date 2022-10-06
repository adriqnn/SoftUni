package softuni.exam.service.impl;

import com.google.gson.Gson;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import softuni.exam.models.dto.json.TownSeedDTO;
import softuni.exam.models.entity.Town;
import softuni.exam.repository.TownRepository;
import softuni.exam.service.TownService;
import softuni.exam.util.ValidationUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TownServiceImpl implements TownService {
    private static final String TOWNS_FILE_PATH = "src/main/resources/files/json/towns.json";

    private final TownRepository townRepository;

    private final ModelMapper modelMapper;
    private final ValidationUtil validationUtil;
    private final Gson gson;

    @Autowired
    public TownServiceImpl(TownRepository townRepository, ModelMapper modelMapper, ValidationUtil validationUtil, Gson gson) {
        this.townRepository = townRepository;
        this.modelMapper = modelMapper;
        this.validationUtil = validationUtil;
        this.gson = gson;
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
    public String importTowns() throws IOException {
        TownSeedDTO[] townSeedDTOs = gson.fromJson(readTownsFileContent(),TownSeedDTO[].class);
        String resultFromImportTowns = Arrays.stream(townSeedDTOs).map(this::importTown).collect(Collectors.joining(System.lineSeparator()));
        return resultFromImportTowns;
    }

    @Override
    public Town findByName(String townName) {
        return townRepository.findByTownName(townName).orElse(null);
    }

    @Override
    public Optional<Town> findByTownName(String townName) {
        return townRepository.findByTownName(townName);
    }

    private String importTown(TownSeedDTO townSeedDTO) {
        boolean isValid = validationUtil.isValid(townSeedDTO);
        Optional<Town> optTown = this.townRepository.findByTownName(townSeedDTO.getTownName());

        if(!isValid || optTown.isPresent()){
            return "Invalid town";
        }
        Town town = this.modelMapper.map(townSeedDTO,Town.class);
        this.townRepository.save(town);
        return String.format("Successfully imported town %s - %d",town.getTownName(),town.getPopulation());
    }
}











