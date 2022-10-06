package com.example.xmlprocessing;

import com.example.xmlprocessing.model.dto.binding.jsonBindingModel.CategoryBindingModel;
import com.example.xmlprocessing.model.dto.binding.jsonBindingModel.ProductCreateBindingModel;
import com.example.xmlprocessing.model.dto.binding.jsonBindingModel.UsersBindingModel;
import com.example.xmlprocessing.model.dto.binding.xmlBindingModel.seedCategoriesBindingModels.CategorySeedDataWrapper;
import com.example.xmlprocessing.model.dto.binding.xmlBindingModel.seedProductsBindingModels.ProductSeedDataDTO;
import com.example.xmlprocessing.model.dto.binding.xmlBindingModel.seedProductsBindingModels.ProductSeedDataWrapper;
import com.example.xmlprocessing.model.dto.binding.xmlBindingModel.seedUsersBindingModels.UserSeedDataWrapper;
import com.example.xmlprocessing.model.dto.view.jsonViewModels.CategoryByProductsCountViewModel;
import com.example.xmlprocessing.model.dto.view.jsonViewModels.ProductInRangeViewModel;
import com.example.xmlprocessing.model.dto.view.jsonViewModels.UserWithSoldItemViewModel;
import com.example.xmlprocessing.model.dto.view.usersAndProducts.UsersViewModelWrapper;
import com.example.xmlprocessing.model.dto.view.xmlViewModels.categoryByProducts.CategoriesByProductCountWrapper;
import com.example.xmlprocessing.model.dto.view.xmlViewModels.productsInrangeModel.ProductInRangeWrapper;
import com.example.xmlprocessing.model.dto.view.xmlViewModels.successfullySoldProductsModel.UserWithSoldItemWrapper;
import com.example.xmlprocessing.service.CategoryService;
import com.example.xmlprocessing.service.ProductService;
import com.example.xmlprocessing.service.UserService;
import com.example.xmlprocessing.util.io.FileIO;
import com.example.xmlprocessing.util.serialize.Serializer;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.*;

@SuppressWarnings("ALL")
@Component
@Transactional
public class CommandRunner implements CommandLineRunner {

    private static final String USERS_INPUT_JSON = "/files/input/json/users.json";
    private static final String PRODUCTS_INPUT_JSON = "/files/input/json/products.json";
    private static final String CATEGORIES_INPUT_JSON = "/files/input/json/categories.json";
    private static final String OUTPUT_JSON_DIRECTORY_PATH = "src/main/resources/files/output/json/";

    private static final String USERS_INPUT_XML = "/files/input/xml/users.xml";
    private static final String PRODUCTS_INPUT_XML = "/files/input/xml/products.xml";
    private static final String CATEGORIES_INPUT_XML = "/files/input/xml/categories.xml";
    private static final String OUTPUT_XML_DIRECTORY_PATH = "src/main/resources/files/output/xml/";

    private final Serializer serializerJson;
    private final Serializer serializerXml;
    private final UserService userService;
    private final ProductService productService;
    private final CategoryService categoryService;
    private final FileIO fileIO;
    private final Gson gson;

    @Autowired
    public CommandRunner(@Qualifier(value = "JsonSerializer") Serializer serializerJson,
                     @Qualifier(value = "XmlSerializer") Serializer serializerXml,
                     UserService userService,
                     ProductService productService,
                     CategoryService categoryService,
                     FileIO fileIO,
                     Gson gson) {
        this.serializerJson = serializerJson;
        this.serializerXml = serializerXml;
        this.userService = userService;
        this.productService = productService;
        this.categoryService = categoryService;
        this.fileIO = fileIO;
        this.gson = gson;
    }

    @Override
    public void run(String... args) throws Exception {
//        seedDataIntoDbFromJson();
//        queryAndExportDataJson();

//        seedDataIntoDbFromXml();
        queryAndExportDataXml();
    }

    private void queryAndExportDataXml() {
//        productsInRangeQueryXML();
//        successfullySoldProductsQueryXML();
//        categoriesByProductsCountQueryXML();
        usersAndProductsQueryXML();
    }

    private void usersAndProductsQueryXML() {
    }

    private void categoriesByProductsCountQueryXML() {
        List<CategoryByProductsCountViewModel> categories = this.categoryService.categoriesByProductCount();
        CategoriesByProductCountWrapper viewModelWrapper = new CategoriesByProductCountWrapper();
        viewModelWrapper.setViewModels(categories);
        this.serializerXml.serialize(viewModelWrapper, OUTPUT_XML_DIRECTORY_PATH + "categories-by-products.xml");
    }

    private void successfullySoldProductsQueryXML() {
        List<UserWithSoldItemViewModel> viewModels = this.productService.getAllUsersQuery2();
        UserWithSoldItemWrapper userWrapper = new UserWithSoldItemWrapper();
        userWrapper.setViewModelWrapper(viewModels);
        this.serializerXml.serialize(userWrapper, OUTPUT_XML_DIRECTORY_PATH + "users-sold-products.xml");
    }

    private void productsInRangeQueryXML() {
        List<ProductInRangeViewModel> viewModels = this.productService.getAllByRangeWithoutBuyer(500, 1000);
        ProductInRangeWrapper viewModelWrapper = new ProductInRangeWrapper();
        viewModelWrapper.setViewModels(viewModels);
        this.serializerXml.serialize(viewModelWrapper, OUTPUT_XML_DIRECTORY_PATH + "products-in-range.xml");
    }

    private void seedDataIntoDbFromXml() {
        seedUsersXml();
        seedCategoriesXml();
        seedProductsXml();
    }

    private void seedCategoriesXml() {
        CategorySeedDataWrapper categoryWrapper =
                serializerXml.deserialize(CategorySeedDataWrapper.class, CATEGORIES_INPUT_XML);
        this.categoryService.persisAllCategories(categoryWrapper);
    }

    private void seedProductsXml() {
        ProductSeedDataWrapper productWrapper =
                serializerXml.deserialize(ProductSeedDataWrapper.class, PRODUCTS_INPUT_XML);
        productWrapper.getProductDTOs().forEach(this::randomizeDataXml);
        this.productService.persistAllProducts(productWrapper);
    }

    private void randomizeDataXml(ProductSeedDataDTO model) {
        Random random = new Random();
        int buyer = 0;
        do {
            buyer = random.nextInt(69);
            if (buyer <= 56 && buyer != 0) model.setBuyer(buyer);
        } while (buyer == 0);

        int seller = 0;
        do {
            seller = random.nextInt(56);
            if (seller != buyer && seller != 0) {
                model.setSeller(seller);
            }
        } while (seller == buyer || seller == 0);
    }

    private void seedUsersXml() {
        UserSeedDataWrapper userWrapper = serializerXml.deserialize(UserSeedDataWrapper.class, USERS_INPUT_XML);
        this.userService.persistAllUsers(userWrapper);
    }

    private void queryAndExportDataJson() throws IOException {
        queryProductsInRange();
        querySuccessfullySoldProducts();
        queryCategoriesByProductsCount();
        usersAndProducts();
    }

    private void usersAndProducts() {
        UsersViewModelWrapper modelWrappers = this.userService.getAllUsersWithSoldProduct();
        serializerJson.serialize(modelWrappers, OUTPUT_JSON_DIRECTORY_PATH + "users-and-products.json");
    }

    private void queryCategoriesByProductsCount() {
        List<CategoryByProductsCountViewModel> categories = this.categoryService.categoriesByProductCount();
        serializerJson.serialize(categories, OUTPUT_JSON_DIRECTORY_PATH + "categories-by-products.json");
    }

    private void querySuccessfullySoldProducts() {
        List<UserWithSoldItemViewModel> viewModels = this.productService.getAllUsersQuery2();
        serializerJson.serialize(viewModels, OUTPUT_JSON_DIRECTORY_PATH + "users-sold-products.json");
    }

    private void queryProductsInRange() {
        List<ProductInRangeViewModel> viewModels = this.productService.getAllByRangeWithoutBuyer(500, 1000);
        serializerJson.serialize(viewModels, OUTPUT_JSON_DIRECTORY_PATH + "products-in-range.json");
    }

    private void seedDataIntoDbFromJson() throws IOException {
        seedUsers();
        seedCategories();
        seedProducts();
    }

    private void seedProducts() throws IOException {
        String content = fileIO.read(PRODUCTS_INPUT_JSON);
        Type listType = new TypeToken<List<ProductCreateBindingModel>>() {
        }.getType();
        List<ProductCreateBindingModel> products = this.gson.fromJson(content, listType);
        products.forEach(this::randomizeData);
        this.productService.persist(products);
    }

    private void randomizeData(ProductCreateBindingModel model) {
        Random random = new Random();
        int buyer = 0;
        do {
            buyer = random.nextInt(69);
            if (buyer <= 56 && buyer != 0) model.setBuyer(buyer);
        } while (buyer == 0);

        int seller = 0;
        do {
            seller = random.nextInt(56);
            if (seller != buyer && seller != 0) {
                model.setSeller(seller);
            }
        } while (seller == buyer || seller == 0);
    }

    private void seedCategories() throws IOException {
        String content = fileIO.read(CATEGORIES_INPUT_JSON);
        CategoryBindingModel[] categories = gson.fromJson(content, CategoryBindingModel[].class);

        Arrays.stream(categories).forEach(this.categoryService::persist);
    }

    private void seedUsers() throws IOException {
//      UsersBindingModel[] usersDtos = serializerJson.deserialize(UsersBindingModel[].class, USERS_INPUT_JSON);
//      String debug = "";
        String content = fileIO.read(USERS_INPUT_JSON);
        UsersBindingModel[] users = gson.fromJson(content, UsersBindingModel[].class);

        Arrays.stream(users).forEach(this.userService::persist);
    }
}
