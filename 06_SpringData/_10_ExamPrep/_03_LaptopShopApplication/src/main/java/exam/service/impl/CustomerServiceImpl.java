package exam.service.impl;

import com.google.gson.Gson;
import exam.model.dto.jsonDTOs.CustomerSeedDTO;
import exam.model.entity.Customer;
import exam.repository.CustomerRepository;
import exam.service.CustomerService;
import exam.service.TownService;
import exam.util.ValidationUtil;
import exam.util.XMLParser;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {
    private static final String CUSTOMERS_FILE_PATH = "src/main/resources/files/json/customers.json";

    private final CustomerRepository customerRepository;
    private final TownService townService;

    private final ModelMapper modelMapper;
    private final ValidationUtil validationUtil;
    private final Gson gson;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository, TownService townService, ModelMapper modelMapper, ValidationUtil validationUtil, Gson gson) {
        this.customerRepository = customerRepository;
        this.townService = townService;
        this.modelMapper = modelMapper;
        this.validationUtil = validationUtil;
        this.gson = gson;
    }

    @Override
    public boolean areImported() {
        return this.customerRepository.count() > 0;
    }

    @Override
    public String readCustomersFileContent() throws IOException {
        return Files.readString(Path.of(CUSTOMERS_FILE_PATH));
    }

    @Override
    public String importCustomers() throws IOException {
        CustomerSeedDTO[] customerSeedDTOs = gson.fromJson(readCustomersFileContent(),CustomerSeedDTO[].class);
        return Arrays.stream(customerSeedDTOs).map(this::importCustomer).collect(Collectors.joining(System.lineSeparator()));
    }

    private String importCustomer(CustomerSeedDTO customerSeedDTO) {
        boolean isValid = validationUtil.isValid(customerSeedDTO);
        Optional<Customer> optCustomer = this.customerRepository.findByEmail(customerSeedDTO.getEmail());

        if(!isValid || optCustomer.isPresent()){
            return "Invalid customer";
        }
        Customer customer = this.modelMapper.map(customerSeedDTO, Customer.class);
        customer.setTown(this.townService.findByName(customer.getTown().getName()));

        this.customerRepository.save(customer);
        return String.format("Successfully imported Customer %s %s - %s",customer.getFirstName(),customer.getLastName(),customer.getEmail());
    }
}
