package softuni.exam.service.impl;

import com.google.gson.Gson;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import softuni.exam.models.dto.json.AgentSeedDTO;
import softuni.exam.models.entity.Agent;
import softuni.exam.models.entity.Town;
import softuni.exam.repository.AgentRepository;
import softuni.exam.service.AgentService;
import softuni.exam.service.TownService;
import softuni.exam.util.ValidationUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AgentServiceImpl implements AgentService {
    private static final String AGENTS_FILE_PATH = "src/main/resources/files/json/agents.json";

    private final AgentRepository agentRepository;
    private final TownService townService;

    private final ModelMapper modelMapper;
    private final ValidationUtil validationUtil;
    private final Gson gson;

    @Autowired
    public AgentServiceImpl(AgentRepository agentRepository, TownService townService, ModelMapper modelMapper, ValidationUtil validationUtil, Gson gson) {
        this.agentRepository = agentRepository;
        this.townService = townService;
        this.modelMapper = modelMapper;
        this.validationUtil = validationUtil;
        this.gson = gson;
    }

    @Override
    public boolean areImported() {
        return this.agentRepository.count() > 0;
    }

    @Override
    public String readAgentsFromFile() throws IOException {
        return Files.readString(Path.of(AGENTS_FILE_PATH));
    }

    @Override
    public String importAgents() throws IOException {
        AgentSeedDTO[] agentSeedDTOs = this.gson.fromJson(readAgentsFromFile(),AgentSeedDTO[].class);
        String resultFromImportAgents = Arrays.stream(agentSeedDTOs).map(this::importAgent).collect(Collectors.joining(System.lineSeparator()));
        return resultFromImportAgents;
    }

    @Override
    public Optional<Agent> findByFirstName(String firstName) {
        return this.agentRepository.findByFirstName(firstName);
    }

    @Override
    public Agent findByFirstNameAgent(String firstName) {
        return this.findByFirstName(firstName).orElse(null);
    }

    private String importAgent(AgentSeedDTO agentSeedDTO) {
        boolean isValid = validationUtil.isValid(agentSeedDTO);
        Optional<Agent> optAgentByName = this.agentRepository.findByFirstName(agentSeedDTO.getFirstName());
        Optional<Agent> optAgentByEmail = this.agentRepository.findByEmail(agentSeedDTO.getEmail());

        if(!isValid || optAgentByName.isPresent() || optAgentByEmail.isPresent()){
            return "Invalid agent";
        }

        Agent agent = this.modelMapper.map(agentSeedDTO,Agent.class);
        agent.setTown(this.townService.findByName(agentSeedDTO.getTown()));


        this.agentRepository.save(agent);
        return String.format("Successfully imported agent - %s %s",agent.getFirstName(),agent.getLastName());
    }
}
