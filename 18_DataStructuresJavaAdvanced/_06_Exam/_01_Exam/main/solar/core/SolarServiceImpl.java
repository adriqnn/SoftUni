package solar.core;

import solar.models.Inverter;
import solar.models.PVModule;

import java.util.*;
import java.util.stream.Collectors;

public class SolarServiceImpl implements SolarService {
    private Map<String, Inverter> inverters;
    private Map<String, Set<String>> arrays;
    private Map<PVModule, String> moduleToInverterMapping;
    private Map<String, Set<PVModule>> arrayModules;
    private Map<Inverter, Set<PVModule>> invertersAndModules;

    public SolarServiceImpl() {
        this.inverters = new HashMap<>();
        this.arrays = new HashMap<>();
        this.moduleToInverterMapping = new LinkedHashMap<>();
        this.arrayModules =  new HashMap<>();
        this.invertersAndModules = new HashMap<>();
    }

    @Override
    public void addInverter(Inverter inverter) {
        if (containsInverter(inverter.id)) {
            throw new IllegalArgumentException();
        }

        this.inverters.put(inverter.id, inverter);
        this.arrays.put(inverter.id, new HashSet<>());
        this.invertersAndModules.put(inverter, new HashSet<>());
    }

    @Override
    public void addArray(Inverter inverter, String arrayId) {
        Inverter checkInverter = this.inverters.get(inverter.id);

        if (checkInverter == null) {
            throw new IllegalArgumentException();
        }

        if(this.arrays.get(inverter.id).contains(arrayId)
                ||  (inverter.maxPvArraysConnected <= this.arrays.get(inverter.id).size())){
            throw new IllegalArgumentException();
        }

        this.arrays.get(inverter.id).add(arrayId);
//        this.arrayModules.put(arrayId, new HashSet<>());
    }

    @Override
    public void addPanel(Inverter inverter, String arrayId, PVModule pvModule) {
        if(!this.inverters.containsKey(inverter.id)){
            throw new IllegalArgumentException();
        }

        if(!this.arrays.get(inverter.id).contains(arrayId)){
            throw new IllegalArgumentException();
        }

        if(this.moduleToInverterMapping.containsKey(pvModule)){
            throw new IllegalArgumentException();
        }

        this.moduleToInverterMapping.put(pvModule, inverter.id);
        this.invertersAndModules.get(inverter).add(pvModule);
//        this.arrayModules.get(arrayId).add(pvModule);

    }

    @Override
    public boolean containsInverter(String id) {
        return this.inverters.containsKey(id);
    }

    @Override
    public boolean isPanelConnected(PVModule pvModule) {
        return this.moduleToInverterMapping.containsKey(pvModule);
    }

    @Override
    public Inverter getInverterByPanel(PVModule pvModule) {
        return this.inverters.get(this.moduleToInverterMapping.get(pvModule));
    }

    @Override
    public void replaceModule(PVModule oldModule, PVModule newModule) {
        if(!this.moduleToInverterMapping.containsKey(oldModule)){
            throw new IllegalArgumentException();
        }

        if(this.moduleToInverterMapping.containsKey(newModule)){
            throw new IllegalArgumentException();
        }

        String remove = this.moduleToInverterMapping.remove(oldModule);
        this.moduleToInverterMapping.put(newModule, remove);
        this.invertersAndModules.get(this.inverters.get(remove)).remove(oldModule);
        this.invertersAndModules.get(this.inverters.get(remove)).remove(newModule);
    }

    @Override
    public Collection<Inverter> getByProductionCapacity() {
        Map<Inverter, Integer> values = new HashMap<>();

        this.invertersAndModules.forEach((key, value) -> {
            int sum = 0;

            for (PVModule pvModule : value) {
                sum += pvModule.maxWattProduction;
            }

            values.put(key, sum);
        });

        return values.entrySet().stream().sorted(Comparator.comparingInt(Map.Entry::getValue)).map(Map.Entry::getKey).collect(Collectors.toList());
    }

    @Override
    public Collection<Inverter> getByNumberOfPVModulesConnected() {
        return this.invertersAndModules.entrySet().stream().sorted((e1, e2) -> {
            int cmp = Integer.compare(e1.getValue().size(), e2.getValue().size());

            if(cmp == 0){
                cmp = Integer.compare(this.arrays.get(e1.getKey().id).size(), this.arrays.get(e2.getKey().id).size());
            }

            return cmp;
        }).map(e -> e.getKey()).collect(Collectors.toList());
    }

    @Override
    public Collection<PVModule> getByWattProduction() {
        return this.moduleToInverterMapping.keySet().stream().sorted((e1, e2) -> {
            int cmp = Integer.compare(e1.maxWattProduction, e2.maxWattProduction);
            return cmp;
        }).collect(Collectors.toList());
    }
}
