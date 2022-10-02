package aquarium.core;

import aquarium.common.ConstantMessages;
import aquarium.common.ExceptionMessages;
import aquarium.entities.aquariums.Aquarium;
import aquarium.entities.aquariums.FreshwaterAquarium;
import aquarium.entities.aquariums.SaltwaterAquarium;
import aquarium.entities.decorations.Decoration;
import aquarium.entities.decorations.Ornament;
import aquarium.entities.decorations.Plant;
import aquarium.entities.fish.Fish;
import aquarium.entities.fish.FreshwaterFish;
import aquarium.entities.fish.SaltwaterFish;
import aquarium.repositories.DecorationRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class ControllerImpl implements Controller{
    private DecorationRepository decorationRepository;
    private Collection<Aquarium> aquariums;

    public ControllerImpl() {
        this.decorationRepository = new DecorationRepository();
        this.aquariums = new ArrayList<>();
    }

    @Override
    public String addAquarium(String aquariumType, String aquariumName) {
        if(aquariumType.equals("FreshwaterAquarium")){
            Aquarium aquarium = new FreshwaterAquarium(aquariumName);
            aquariums.add(aquarium);
            return String.format(ConstantMessages.SUCCESSFULLY_ADDED_AQUARIUM_TYPE,aquariumType);
        }else if(aquariumType.equals("SaltwaterAquarium")){
            Aquarium aquarium = new SaltwaterAquarium(aquariumName);
            aquariums.add(aquarium);
            return String.format(ConstantMessages.SUCCESSFULLY_ADDED_AQUARIUM_TYPE,aquariumType);
        }else{
            throw new NullPointerException(ExceptionMessages.INVALID_AQUARIUM_TYPE);
        }
    }

    @Override
    public String addDecoration(String type) {
        if(type.equals("Ornament")){
            Decoration decoration = new Ornament();
            decorationRepository.add(decoration);
            return String.format(ConstantMessages.SUCCESSFULLY_ADDED_DECORATION_TYPE,type);
        }else if(type.equals("Plant")){
            Decoration decoration = new Plant();
            decorationRepository.add(decoration);
            return String.format(ConstantMessages.SUCCESSFULLY_ADDED_DECORATION_TYPE,type);
        }else{
            throw new IllegalArgumentException(ExceptionMessages.INVALID_DECORATION_TYPE);
        }
    }

    @Override
    public String insertDecoration(String aquariumName, String decorationType) {
        Decoration decoration = decorationRepository.findByType(decorationType);
        if(decoration != null){
            Aquarium aquarium = aquariums.stream().filter(a -> a.getName().equals(aquariumName)).findFirst().orElse(null);
            aquarium.addDecoration(decoration);
            decorationRepository.remove(decoration);
            return String.format(ConstantMessages.SUCCESSFULLY_ADDED_DECORATION_IN_AQUARIUM,decorationType,aquariumName);
        }
        throw new IllegalArgumentException(String.format(ExceptionMessages.NO_DECORATION_FOUND,decorationType));
    }

    @Override
    public String addFish(String aquariumName, String fishType, String fishName, String fishSpecies, double price) {
        Fish fish = null;
        String aquariumType;
        if(fishType.equals("FreshwaterFish")){
            fish = new FreshwaterFish(fishName,fishSpecies,price);
            aquariumType = "FreshwaterAquarium";
        }else if(fishType.equals("SaltwaterFish")){
            fish = new SaltwaterFish(fishName,fishSpecies,price);
            aquariumType = "SaltwaterAquarium";
        }else{
            throw new IllegalArgumentException(ExceptionMessages.INVALID_FISH_TYPE);
        }
        Aquarium aquarium = aquariums.stream().filter(a -> a.getName().equals(aquariumName)).findFirst().orElse(null);
        if(aquarium.getClass().getSimpleName().equals(aquariumType)){
            try{
                aquarium.addFish(fish);
                return String.format(ConstantMessages.SUCCESSFULLY_ADDED_FISH_IN_AQUARIUM,fishType,aquarium.getName());
            }catch (Exception e){
                return ConstantMessages.NOT_ENOUGH_CAPACITY;
            }
        }else{
            return ConstantMessages.WATER_NOT_SUITABLE;
        }
    }

    @Override
    public String feedFish(String aquariumName) {
        Aquarium aquarium = aquariums.stream().filter(a -> a.getName().equals(aquariumName)).findFirst().orElse(null);
        aquarium.feed();
        return String.format(ConstantMessages.FISH_FED,aquarium.getFish().size());
    }

    @Override
    public String calculateValue(String aquariumName) {
        Aquarium aquarium = aquariums.stream().filter(a -> a.getName().equals(aquariumName)).findFirst().orElse(null);
        double valueOfFish = aquarium.getFish().stream().mapToDouble(Fish::getPrice).sum();
        double valueOfDecoration = aquarium.getDecorations().stream().mapToDouble(Decoration::getPrice).sum();
        double sumOfValues = valueOfFish + valueOfDecoration;
        return String.format(ConstantMessages.VALUE_AQUARIUM,aquariumName,sumOfValues);
    }

    @Override
    public String report() {
        return aquariums.stream().map(Aquarium::getInfo).collect(Collectors.joining(System.lineSeparator()));
    }
}





























