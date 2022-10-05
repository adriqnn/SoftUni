package com.example.springdataadvancedquerying;

import com.example.springdataadvancedquerying.repositories.ShampooRepository;
import com.example.springdataadvancedquerying.services.IngredientService;
import com.example.springdataadvancedquerying.services.ShampooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

@Component
public class Runner implements CommandLineRunner {

    private final ShampooRepository shampooRepository;
    private final ShampooService shampooService;
    private final IngredientService ingredientService;

    @Autowired
    public Runner(ShampooRepository shampooRepository, ShampooService shampooService, IngredientService ingredientService){
        this.shampooRepository = shampooRepository;
        this.shampooService = shampooService;
        this.ingredientService = ingredientService;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        Scanner scan = new Scanner(System.in);

        //10.this.ingredientService.increasePriceByPercentage(0.1);

        //9.this.ingredientService.deleteByName("Nettle");

        //8.this.shampooService.selectByIngredientsCount(2).forEach(System.out::println);

        //7.already done

        //6.int count = this.shampooService.countPriceLowerThan(BigDecimal.valueOf(8.50));System.out.println(count);

        //5.this.ingredientService.selectInNames(List.of("lavender","Herbs","Apple")).forEach(System.out::println);

        //4.this.ingredientService.selectNameStartsWith("M").forEach(System.out::println);

        //3.this.shampooService.selectMoreExpensiveThan(BigDecimal.valueOf(5)).forEach(System.out::println);

        //2.this.shampooService.selectBySizeOrLabel(Size.MEDIUM,10).forEach(System.out::println);

        //1.this.shampooService.selectBySize(Size.MEDIUM).forEach(System.out::println);


    }

    public void demo(){
        //1. this.shampooRepository.findByBrand("Cotton Fresh").forEach(s -> System.out.println(s.getId()));
        //2. this.shampooRepository.findAllByBrandAndSize("Cotton Fresh", Size.SMALL).forEach(s -> System.out.println(s.getId()));

        /*3.Scanner scan = new Scanner(System.in);
        String sizeName = scan.nextLine();
        Size size = Size.valueOf(sizeName);
        this.shampooRepository.findBySizeOrderById(size).forEach(System.out::println);*/

        /*4String ingredientsFirst = scan.nextLine();
        String ingredientSecond = scan.nextLine();
        Set<String> names = Set.of(ingredientsFirst, ingredientSecond);
        this.shampooRepository.findByIngredientsNames(names).forEach(System.out::println);*/
    }
}