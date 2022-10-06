package com.example.jsonprocessing;

import com.example.jsonprocessing.entities.categories.CategoryStatsDTO;
import com.example.jsonprocessing.services.ProductService;
import com.example.jsonprocessing.services.SeedService;
import com.example.jsonprocessing.services.UserService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductsShopRunner implements CommandLineRunner {
    private final SeedService seedService;
    private final ProductService productService;
    private final UserService userService;

    private final Gson gson;

    @Autowired
    public ProductsShopRunner(SeedService seedService, ProductService productService,UserService userService) {
        this.seedService = seedService;
        this.productService = productService;
        this.userService = userService;

        this.gson = new GsonBuilder().setPrettyPrinting().create();
    }

    private void getCategoryStats(){
        List<CategoryStatsDTO> result = this.productService.getCategoryStatistics();
        String json = this.gson.toJson(result);
        System.out.println(json);
    }

    @Override
    public void run(String... args) throws Exception {

        /*List<CategoryStatsDTO> categoryStatistics = this.productService.getCategoryStatistics();
        String json = this.gson.toJson(categoryStatistics);
        System.out.println(json);
        */

        /* 2. Seed database
        this.seedService.seedAll();
        */

        /* 3. query nr.1
        List<ProductWithoutBuyerDTO> productsForSale = this.productService.getProductsInPriceRangeForSell(500, 1000);
        String json = this.gson.toJson(productsForSale);
        System.out.println(json);
        */

        /* 3. query nr.2
        List<UserWithSoldProductsDTO> usersWithSoldProducts = this.userService.getUsersWithSoldProducts();
        String json = this.gson.toJson(usersWithSoldProducts);
        System.out.println(json);
        */

        /* 3. query nr 3.
        List<CategoryStats> categoryStatistics = this.productService.getCategoryStatistics();
        String json = this.gson.toJson(categoryStatistics);
        System.out.println(json);
        */

        /* 3. query nr4.
        UserSalesStatsFinalJSON userSalesStatsFinalJSON = this.userService.getUsersWithSoldProductsOrderByCountQ4();
        String json = gson.toJson(userSalesStatsFinalJSON);
        System.out.println(json);
        */












        /* 3. query n4. OLD
        UserSalesStats usersSalesStats = this.userService.getUsersWithSoldProductsOrderByCount();
        String json = this.gson.toJson(usersSalesStats);
        System.out.println(json);
        */

    }
}
