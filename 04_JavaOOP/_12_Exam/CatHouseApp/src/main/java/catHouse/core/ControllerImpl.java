package catHouse.core;

import catHouse.common.ConstantMessages;
import catHouse.common.ExceptionMessages;
import catHouse.entities.cat.Cat;
import catHouse.entities.cat.LonghairCat;
import catHouse.entities.cat.ShorthairCat;
import catHouse.entities.houses.House;
import catHouse.entities.houses.LongHouse;
import catHouse.entities.houses.ShortHouse;
import catHouse.entities.toys.Ball;
import catHouse.entities.toys.Mouse;
import catHouse.entities.toys.Toy;
import catHouse.repositories.ToyRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

public class ControllerImpl implements Controller{
    private ToyRepository toyRepository;
    private Collection<House> houses;

    public ControllerImpl() {
        this.toyRepository = new ToyRepository();
        this.houses = new ArrayList<>();
    }

    @Override
    public String addHouse(String type, String name) {
        if(type.equals("ShortHouse")){
            House house = new ShortHouse(name);
            houses.add(house);
            return String.format(ConstantMessages.SUCCESSFULLY_ADDED_HOUSE_TYPE,type);
        }else if(type.equals("LongHouse")){
            House house = new LongHouse(name);
            houses.add(house);
            return String.format(ConstantMessages.SUCCESSFULLY_ADDED_HOUSE_TYPE,type);
        }else{
            throw new NullPointerException(ExceptionMessages.INVALID_HOUSE_TYPE);
        }
    }

    @Override
    public String buyToy(String type) {
        if(type.equals("Ball")){
            Toy toy = new Ball();
            toyRepository.buyToy(toy);
            return String.format(ConstantMessages.SUCCESSFULLY_ADDED_TOY_TYPE,type);
        }else if(type.equals("Mouse")){
            Toy toy = new Mouse();
            toyRepository.buyToy(toy);
            return String.format(ConstantMessages.SUCCESSFULLY_ADDED_TOY_TYPE,type);
        }else{
            throw new IllegalArgumentException(ExceptionMessages.INVALID_TOY_TYPE);
        }
    }

    @Override
    public String toyForHouse(String houseName, String toyType) {
        Toy toy = this.toyRepository.findFirst(toyType);
        if(toy != null){
            House house = houses.stream().filter(h -> h.getName().equals(houseName)).findFirst().orElse(null);
            house.buyToy(toy);
            toyRepository.removeToy(toy);
            return String.format(ConstantMessages.SUCCESSFULLY_ADDED_TOY_IN_HOUSE,toyType,houseName);
        }
        throw new IllegalArgumentException(String.format(ExceptionMessages.NO_TOY_FOUND,toyType));
    }

    @Override
    public String addCat(String houseName, String catType, String catName, String catBreed, double price) {
        Cat cat = null;
        String houseType;
        if(catType.equals("ShorthairCat")){
            cat = new ShorthairCat(catName,catBreed,price);
            houseType = "ShortHouse";
        }else if(catType.equals("LonghairCat")){
            cat = new LonghairCat(catName,catBreed,price);
            houseType = "LongHouse";
        }else{
            throw new IllegalArgumentException(ExceptionMessages.INVALID_CAT_TYPE);
        }
        House house = houses.stream().filter(h -> h.getName().equals(houseName)).findFirst().orElse(null);
        if(house.getClass().getSimpleName().equals(houseType)){
            try{
                house.addCat(cat);
                return String.format(ConstantMessages.SUCCESSFULLY_ADDED_CAT_IN_HOUSE,catType,houseName);
            }catch (Exception e){
                return ConstantMessages.UNSUITABLE_HOUSE;
            }
        }
        return ConstantMessages.UNSUITABLE_HOUSE;
    }

    @Override
    public String feedingCat(String houseName) {
        House house = houses.stream().filter(h -> h.getName().equals(houseName)).findFirst().orElse(null);
        house.feeding();
        return String.format(ConstantMessages.FEEDING_CAT,house.getCats().size());
    }

    @Override
    public String sumOfAll(String houseName) {
        House house = houses.stream().filter(h -> h.getName().equals(houseName)).findFirst().orElse(null);
        double valueOfCats = house.getCats().stream().mapToDouble(Cat::getPrice).sum();
        double valueOfToys = house.getToys().stream().mapToDouble(Toy::getPrice).sum();
        double sumOfValues = valueOfCats + valueOfToys;
        return String.format(ConstantMessages.VALUE_HOUSE,houseName,sumOfValues);
    }

    @Override
    public String getStatistics() {
        return houses.stream().map(House::getStatistics).collect(Collectors.joining(System.lineSeparator()));
    }
}
