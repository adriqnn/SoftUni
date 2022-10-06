package exam.service.impl;

import exam.model.dto.xmlDTOs.ShopRootSeedDTO;
import exam.model.dto.xmlDTOs.ShopSeedDTO;
import exam.model.dto.xmlDTOs.TownRootSeedDTO;
import exam.model.entity.Shop;
import exam.model.entity.Town;
import exam.repository.ShopRepository;
import exam.service.ShopService;
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
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ShopServiceImpl implements ShopService {
    private static final String SHOPS_FILE_PATH = "src/main/resources/files/xml/shops.xml";

    private final ShopRepository shopRepository;
    private final TownService townService;

    private final XMLParser xmlParser;
    private final ModelMapper modelMapper;
    private final ValidationUtil validationUtil;

    @Autowired
    public ShopServiceImpl(ShopRepository shopRepository, TownService townService, XMLParser xmlParser, ModelMapper modelMapper, ValidationUtil validationUtil) {
        this.shopRepository = shopRepository;
        this.townService = townService;
        this.xmlParser = xmlParser;
        this.modelMapper = modelMapper;
        this.validationUtil = validationUtil;
    }

    @Override
    public boolean areImported() {
        return this.shopRepository.count() > 0;
    }

    @Override
    public String readShopsFileContent() throws IOException {
        return Files.readString(Path.of(SHOPS_FILE_PATH));
    }

    @Override
    public String importShops() throws JAXBException, FileNotFoundException {
        ShopRootSeedDTO shopDTOs = xmlParser.fromFile(SHOPS_FILE_PATH,ShopRootSeedDTO.class);


        /*StringBuilder resultFromSeed = new StringBuilder();
        xmlParser.fromFile(SHOPS_FILE_PATH, ShopRootSeedDTO.class).getShops().stream().filter(shopSeedDTO -> {
            boolean isValid = validationUtil.isValid(shopSeedDTO);
            resultFromSeed.append(isValid ? String.format("Successfully imported Shop %s - %.0f",shopSeedDTO.getName(),shopSeedDTO.getIncome()) : "Invalid shop")
                    .append(System.lineSeparator());
            return isValid;
        }).map(shopSeedDTO ->{
            Shop shop = modelMapper.map(shopSeedDTO, Shop.class);
            shop.setTown(townService.findByName(shopSeedDTO.getTown().getName()));
            return shop;
        }).forEach(shopRepository::save);*/

        return shopDTOs.getShops().stream().map(this::importShop).collect(Collectors.joining(System.lineSeparator()));
    }

    @Override
    public Shop findByName(String name) {
        return this.shopRepository.findByName(name).orElse(null);
    }

    private String importShop(ShopSeedDTO shopSeedDTO) {
        boolean isValid = validationUtil.isValid(shopSeedDTO);
        Optional<Shop> optShop = this.shopRepository.findByName(shopSeedDTO.getName());

        if(!isValid || optShop.isPresent()){
            return "Invalid shop";
        }
        Shop shop = modelMapper.map(shopSeedDTO, Shop.class);
        shop.setTown(townService.findByName(shopSeedDTO.getTown().getName()));
        this.shopRepository.save(shop);
        return String.format("Successfully imported Shop %s - %.0f",shopSeedDTO.getName(),shopSeedDTO.getIncome());
    }
}
