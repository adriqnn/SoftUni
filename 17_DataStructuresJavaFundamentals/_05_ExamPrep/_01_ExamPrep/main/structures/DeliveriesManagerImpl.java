package structures;

import entities.Deliverer;
import entities.Package;

import java.util.*;
import java.util.stream.Collectors;

public class DeliveriesManagerImpl implements DeliveriesManager {
    private Set<Deliverer> deliverers;
    private Set<Package> packages;
    private Map<String, Deliverer> deliverersList;
    private Map<String, List<Package>> packageManager;
    private Set<Package> unassignedPackages;

    public DeliveriesManagerImpl() {
        this.deliverers = new LinkedHashSet<>();
        this.packages = new LinkedHashSet<>();
        this.packageManager = new LinkedHashMap<>();
        this.unassignedPackages = new LinkedHashSet<>();
        this.deliverersList = new LinkedHashMap<>();
    }

    @Override
    public void addDeliverer(Deliverer deliverer) {
        this.deliverersList.putIfAbsent(deliverer.getId(), deliverer);
        this.deliverers.add(deliverer);
        this.packageManager.putIfAbsent(deliverer.getId(), new ArrayList<>());
    }

    @Override
    public void addPackage(Package _package) {
        this.packages.add(_package);
        this.unassignedPackages.add(_package);
    }

    @Override
    public boolean contains(Deliverer deliverer) {
        return this.deliverers.contains(deliverer);
    }

    @Override
    public boolean contains(Package _package) {
        return this.packages.contains(_package);
    }

    @Override
    public Iterable<Deliverer> getDeliverers() {
        return this.deliverers;
    }

    @Override
    public Iterable<Package> getPackages() {
        return this.packages;
    }

    @Override
    public void assignPackage(Deliverer deliverer, Package _package) throws IllegalArgumentException {
        if(!contains(deliverer) || !contains(_package)){
            throw new IllegalArgumentException();
        }

        this.unassignedPackages.remove(_package);
        this.packageManager.get(deliverer.getId()).add(_package);

    }

    @Override
    public Iterable<Package> getUnassignedPackages() {
        return this.unassignedPackages;
    }

    @Override
    public Iterable<Package> getPackagesOrderedByWeightThenByReceiver() {
        return this.packages.stream().sorted(Comparator.comparing(Package::getWeight).reversed().thenComparing(Package::getReceiver)).collect(Collectors.toList());
    }

    @Override
    public Iterable<Deliverer> getDeliverersOrderedByCountOfPackagesThenByName() {
        return this.packageManager.entrySet().stream().sorted((d1, d2) -> {
            int result = Integer.compare(d2.getValue().size(), d1.getValue().size());

            if(result == 0){
                result = this.deliverersList.get(d1.getKey()).getName().compareTo(this.deliverersList.get(d2.getKey()).getName());
            }

            return result;
        }).map(e -> this.deliverersList.get(e.getKey())).collect(Collectors.toList());
    }
}
