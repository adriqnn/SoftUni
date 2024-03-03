package vaccopsjava;

import java.util.*;
import java.util.stream.Collectors;

public class VaccOps implements IVaccOps {
    private Map<String, Doctor> doctors;
    private Map<String, Patient> patients;

    public VaccOps() {
        this.doctors = new LinkedHashMap<>();
        this.patients = new LinkedHashMap<>();
    }

    public void addDoctor(Doctor d) {
        if(exist(d)){
            throw new IllegalArgumentException();
        }

        this.doctors.putIfAbsent(d.name, d);
    }

    public void addPatient(Doctor d, Patient p) {
        if(!exist(d) || exist(p)){
            throw new IllegalArgumentException();
        }

        p.setDoctor(d);
        this.patients.putIfAbsent(p.name, p);
        this.doctors.get(d.name).patients.add(p);
    }

    public Collection<Doctor> getDoctors() {
        return this.doctors.values();
    }

    public Collection<Patient> getPatients() {
        return this.patients.values();
    }

    public boolean exist(Doctor d) {
        return this.doctors.containsKey(d.name);
    }

    public boolean exist(Patient p) {
        return this.patients.containsKey(p.name);
    }


    public Doctor removeDoctor(String name) {
        if(!this.doctors.containsKey(name)){
            throw new IllegalArgumentException();
        }

        this.doctors.get(name).getPatients().forEach(e -> this.patients.remove(e.name));
        return this.doctors.remove(name);
    }

    public void changeDoctor(Doctor from, Doctor to, Patient p) {
        if(!exist(from) || !exist(to) || !exist(p)){
            throw new IllegalArgumentException();
        }

        this.patients.get(p.name).setDoctor(to);
        this.doctors.get(from.name).getPatients().remove(p);
        this.doctors.get(to.name).getPatients().add(p);
    }

    public Collection<Doctor> getDoctorsByPopularity(int populariry) {
        return this.doctors.values().stream().filter(e -> e.getPopularity() == populariry).collect(Collectors.toList());
    }

    public Collection<Patient> getPatientsByTown(String town) {
        return this.patients.values().stream().filter(e -> e.getTown().equals(town)).collect(Collectors.toList());
    }

    public Collection<Patient> getPatientsInAgeRange(int lo, int hi) {
        return this.patients.values().stream().filter(e -> e.getAge() >= lo && e.getAge() <= hi).collect(Collectors.toList());
    }

    public Collection<Doctor> getDoctorsSortedByPatientsCountDescAndNameAsc() {
        return this.doctors.values().stream().sorted((d1, d2) -> {
            int result = Integer.compare(d2.getPatients().size(), d1.getPatients().size());

            if(result == 0){
                result = d1.getName().compareTo(d2.getName());
            }

            return result;
        }).collect(Collectors.toList());
    }

    public Collection<Patient> getPatientsSortedByDoctorsPopularityAscThenByHeightDescThenByAge() {
        return this.patients.values().stream().sorted((p1, p2) -> {
            int result = Integer.compare(p1.getDoctor().getPopularity(), p2.getDoctor().getPopularity());

            if (result == 0) {
                result = Integer.compare(p2.getHeight(), p1.getHeight());

                if(result == 0){
                    result = Integer.compare(p1.getAge(), p2.getAge());
                }
            }

            return result;
        }).collect(Collectors.toList());
    }
}
