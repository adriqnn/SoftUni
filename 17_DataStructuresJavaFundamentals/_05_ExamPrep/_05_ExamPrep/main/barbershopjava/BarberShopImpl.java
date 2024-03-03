package barbershopjava;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BarberShopImpl implements BarberShop {
    private Map<String, Barber> barbersByName;
    private Map<String, List<Client>> barbersClients;
    private Map<String, Client> clientsByName;

    public BarberShopImpl(){
        this.barbersByName = new HashMap<>();
        this.barbersClients = new HashMap<>();
        this.clientsByName = new HashMap<>();
    }

    @Override
    public void addBarber(Barber b) {
        if(this.barbersByName.containsKey(b.name)){
            throw new IllegalArgumentException("Barber already exists!");
        }else{
            this.barbersByName.put(b.name, b);
            this.barbersClients.put(b.name, new ArrayList<>());
        }
    }

    @Override
    public void addClient(Client c) {
        if(this.clientsByName.containsKey(c.name)){
            throw new IllegalArgumentException("Barber already exists!");
        }else{
            this.clientsByName.put(c.name, c);
        }
    }

    @Override
    public boolean exist(Barber b) {
        return this.barbersByName.containsKey(b.name);
    }

    @Override
    public boolean exist(Client c) {
        return this.clientsByName.containsKey(c.name);
    }

    @Override
    public Collection<Barber> getBarbers() {
        return this.barbersByName.values();
    }

    @Override
    public Collection<Client> getClients() {
        return this.clientsByName.values();
    }

    @Override
    public void assignClient(Barber b, Client c) {
        if(!exist(b) || !exist(c)){
            throw new IllegalArgumentException();
        }

        c.barber = b;
        this.barbersClients.get(b.name).add(c);
    }

    @Override
    public void deleteAllClientsFrom(Barber b) {
        if(!exist(b)){
            throw new IllegalArgumentException();
        }

        this.barbersClients.get(b.name).clear();
    }

    @Override
    public Collection<Client> getClientsWithNoBarber() {
        return getClients().stream().filter(e -> e.barber == null).collect(Collectors.toList());
    }

    @Override
    public Collection<Barber> getAllBarbersSortedWithClientsCountDesc() {
//        return getBarbers().stream().sorted((b1, b2) -> {
//            int firstClients = barbersClients.get(b1.name).size();
//            int secondClients = barbersClients.get(b2.name).size();
//
//            return Integer.compare(secondClients, firstClients);
//        }).collect(Collectors.toList());


//        return this.barbersClients.entrySet().stream().sorted((f, s) -> Integer.compare(s.getValue().size(), f.getValue().size())).map(e -> barbersByName.get(e.getKey())).collect(Collectors.toList());
        return this.barbersClients.entrySet().stream().sorted(Comparator.comparing(e -> e.getValue().size(), Comparator.reverseOrder())).map(e -> barbersByName.get(e.getKey())).collect(Collectors.toList());
    }

    @Override
    public Collection<Barber> getAllBarbersSortedWithStarsDescendingAndHaircutPriceAsc() {
        return getBarbers().stream().sorted((b1, b2) -> {
            int result = Integer.compare(b2.stars, b1.stars);

            if(result == 0){
                result = Integer.compare(b1.haircutPrice, b2.haircutPrice);
            }

            return result;
        }).collect(Collectors.toList());
    }

    @Override
    public Collection<Client> getClientsSortedByAgeDescAndBarbersStarsDesc() {

        return this.barbersClients.values().stream().flatMap(List::stream).sorted((c1, c2) -> {
                int result = Integer.compare(c2.age, c1.age);

                if(result == 0){
                    result = Integer.compare(c2.barber.stars, c1.barber.stars);
                }

                return result;
        }).collect(Collectors.toList());
    }
}
