package solar.core;

import solar.models.Inverter;
import solar.models.PVModule;

import java.util.*;

public class SolarServiceImplold implements SolarService {
    private Map<String, Inverter> inverters;
    private Map<String, Set<String>> arrays;
    private Map<PVModule, String> moduleToInverterMapping;

    public SolarServiceImplold() {
        this.inverters = new HashMap<>();
        this.arrays = new HashMap<>();
        this.moduleToInverterMapping = new HashMap<>();
    }

    @Override
    public void addInverter(Inverter inverter) {
        if (containsInverter(inverter.id)) {
            throw new IllegalArgumentException("Inverter with ID " + inverter.id + " already exists.");
        }
        
        this.inverters.put(inverter.id, inverter);
    }

    @Override
    public void addArray(Inverter inverter, String arrayId) {
        if (!this.inverters.containsKey(inverter.id) || this.arrays.containsKey(arrayId) ||
                !inverter.id.equals(this.arrays.get(arrayId))) {
            throw new IllegalArgumentException("Invalid Inverter or arrayId.");
        }
        
        Set<String> inverterArrays = this.arrays.computeIfAbsent(inverter.id, k -> new HashSet<>());
        inverterArrays.add(arrayId);
    }

    @Override
    public void addPanel(Inverter inverter, String arrayId, PVModule pvModule) {
        if (!this.inverters.containsKey(inverter.id) || !this.arrays.containsKey(arrayId) ||
                this.moduleToInverterMapping.containsKey(pvModule)) {
            throw new IllegalArgumentException("Invalid Inverter, arrayId, or PVModule.");
        }

        if (!this.arrays.get(inverter.id).contains(arrayId)) {
            throw new IllegalArgumentException("The arrayId is not associated with this Inverter.");
        }

        this.moduleToInverterMapping.put(pvModule, inverter.id);
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
        if (!this.moduleToInverterMapping.containsKey(oldModule) || this.moduleToInverterMapping.containsKey(newModule)) {
            throw new IllegalArgumentException("Invalid PVModule replacement.");
        }
        
        String inverterId = this.moduleToInverterMapping.get(oldModule);
        this.moduleToInverterMapping.remove(oldModule);
        this.moduleToInverterMapping.put(newModule, inverterId);
    }

    @Override
    public Collection<Inverter> getByProductionCapacity() {
        List<Inverter> sortedInverters = new ArrayList<>(this.inverters.values());
        
        sortedInverters.sort(Comparator.comparingInt(inverter -> {
            Set<String> inverterArrays = this.arrays.get(inverter.id);
            if (inverterArrays == null) {
                return 0;
            }
            
            return inverterArrays.stream()
                    .map(arrayId -> this.inverters.get(arrayId).maxPvArraysConnected)
                    .mapToInt(Integer::intValue)
                    .sum();
        }));
        
        return null;
    }

    @Override
    public Collection<Inverter> getByNumberOfPVModulesConnected() {
        List<Inverter> sortedInverters = new ArrayList<>(this.inverters.values());
        
        sortedInverters.sort(Comparator.comparingInt(inverter -> {
            Set<String> inverterArrays = this.arrays.get(inverter.id);
            if (inverterArrays == null) {
                return 0;
            }
            
            return inverterArrays.size();
        }));
        
        return null;
    }

    @Override
    public Collection<PVModule> getByWattProduction() {
        List<PVModule> sortedModules = new ArrayList<>(this.moduleToInverterMapping.keySet());
        sortedModules.sort(Comparator.comparingInt(module -> module.maxWattProduction));
        
        return null;
    }
}
