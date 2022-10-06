package exam.service.impl;

import com.google.gson.Gson;
import exam.model.dto.jsonDTOs.LaptopSeedDTO;
import exam.model.entity.Customer;
import exam.model.entity.Laptop;
import exam.repository.LaptopRepository;
import exam.service.LaptopService;
import exam.service.ShopService;
import exam.util.ValidationUtil;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class LaptopServiceImpl implements LaptopService {
    private static final String LAPTOPS_FILE_PATH = "src/main/resources/files/json/laptops.json";

    private final LaptopRepository laptopRepository;
    private final ShopService shopService;

    private final ModelMapper modelMapper;
    private final ValidationUtil validationUtil;
    private final Gson gson;

    @Autowired
    public LaptopServiceImpl(LaptopRepository laptopRepository, ShopService shopService, ModelMapper modelMapper, ValidationUtil validationUtil, Gson gson) {
        this.laptopRepository = laptopRepository;
        this.shopService = shopService;
        this.modelMapper = modelMapper;
        this.validationUtil = validationUtil;
        this.gson = gson;
    }

    @Override
    public boolean areImported() {
        return this.laptopRepository.count() > 0;
    }

    @Override
    public String readLaptopsFileContent() throws IOException {
        return Files.readString(Path.of(LAPTOPS_FILE_PATH));
    }

    @Override
    public String importLaptops() throws IOException {
        LaptopSeedDTO[] laptopSeedDTOs = gson.fromJson(readLaptopsFileContent(),LaptopSeedDTO[].class);
        System.out.println();
        return Arrays.stream(laptopSeedDTOs).map(this::importLaptop).collect(Collectors.joining(System.lineSeparator()));
    }

    private String importLaptop(LaptopSeedDTO laptopSeedDTO) {
        boolean isValid = validationUtil.isValid(laptopSeedDTO);
        Optional<Laptop> optLaptop = this.laptopRepository.findByMacAddress(laptopSeedDTO.getMacAddress());

        if(!isValid || optLaptop.isPresent()){
            return "Invalid laptop";
        }
        Laptop laptop = this.modelMapper.map(laptopSeedDTO, Laptop.class);
        laptop.setShop(this.shopService.findByName(laptop.getShop().getName()));

        this.laptopRepository.save(laptop);
        return String.format("Successfully imported Laptop %s - %.2f - %d - %d",laptop.getMacAddress(),laptop.getCpuSpeed(),laptop.getRam(),laptop.getStorage());
    }

    @Override
    public String exportBestLaptops() {
        List<Laptop> laptops = this.laptopRepository.findAllLaptopsByOrderByCpuSpeedDescRamDescStorageDescMacAddressAsc();
        return laptops.stream().map(Laptop::toString).collect(Collectors.joining(System.lineSeparator()));
    }
}
















