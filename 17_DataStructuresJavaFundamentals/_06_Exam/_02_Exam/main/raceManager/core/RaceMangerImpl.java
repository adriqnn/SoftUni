package raceManager.core;

import raceManager.models.Athlete;

import java.util.*;
import java.util.stream.Collectors;

public class RaceMangerImpl implements RaceManger {
    Map<String, Athlete> enrolledAthletes;
    Deque<Athlete> currentParticipants;
    Map<String, Athlete> racingAthletes;
    Deque<Athlete> finishedAthletesStack;
    List<Athlete> retired;

    public RaceMangerImpl() {
        this.enrolledAthletes = new LinkedHashMap<>();
        this.currentParticipants = new ArrayDeque<>();
        this.racingAthletes = new LinkedHashMap<>();
        this.finishedAthletesStack = new ArrayDeque<>();
        this.retired = new ArrayList<>();
    }

    @Override
    public void enroll(Athlete athlete) {
        if(isEnrolled(athlete)){
            throw new IllegalArgumentException();
        }

        this.enrolledAthletes.put(athlete.name, athlete);
        this.currentParticipants.offer(athlete);
    }

    @Override
    public boolean isEnrolled(Athlete athlete) {
        return this.enrolledAthletes.containsKey(athlete.name);
    }

    @Override
    public void start() {
        if(this.currentParticipants.isEmpty()){
            throw new IllegalArgumentException();
        }

        Athlete currentRacer = this.currentParticipants.poll();
        this.racingAthletes.put(currentRacer.name, currentRacer);
    }

    @Override
    public void retire(Athlete athlete) {
        if(!this.racingAthletes.containsKey(athlete.name)){
            throw new IllegalArgumentException();
        }

        this.racingAthletes.remove(athlete.name);
        this.retired.add(athlete);
    }

    @Override
    public void finish(Athlete athlete) {
        if(!this.racingAthletes.containsKey(athlete.name)){
            throw new IllegalArgumentException();
        }

        this.finishedAthletesStack.push(athlete);
        this.racingAthletes.remove(athlete.name);
    }

    @Override
    public Athlete getLastFinishedAthlete() {
        if(this.finishedAthletesStack.isEmpty()){
            throw new IllegalArgumentException();
        }

        return this.finishedAthletesStack.peek();
    }

    @Override
    public int currentRacingCount() {
        return this.racingAthletes.size();
    }

    @Override
    public Collection<Athlete> getAllAthletesByAge() {
        return this.enrolledAthletes.values().stream().sorted(Comparator.comparing(Athlete::getAge)).collect(Collectors.toList());
    }

    @Override
    public Collection<Athlete> getAllNotFinishedAthletes() {
        List<Athlete> notFullyRaced = new ArrayList<>(this.currentParticipants);
        notFullyRaced.addAll(this.retired);

        return notFullyRaced.stream().sorted(Comparator.comparing(Athlete::getName)).collect(Collectors.toList());
    }

    @Override
    public Iterator<Athlete> getScoreBoard() {
        return this.finishedAthletesStack.iterator();
    }
}
