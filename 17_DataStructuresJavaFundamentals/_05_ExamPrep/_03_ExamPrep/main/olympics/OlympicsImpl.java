package src;

import java.util.*;
import java.util.stream.Collectors;

public class OlympicsImpl implements Olympics {
    private Map<Integer, Competitor> competitors;
    private Map<Integer, Competition> competitions;

    public OlympicsImpl() {
        this.competitors = new TreeMap<>();
        this.competitions = new TreeMap<>();
    }


    @Override
    public void addCompetitor(int id, String name) {
        if(this.competitors.containsKey(id)){
            throw new IllegalArgumentException();
        }

        Competitor competitor = new Competitor(id, name);
        this.competitors.putIfAbsent(id, competitor);
    }

    @Override
    public void addCompetition(int id, String name, int score) {
        if(this.competitions.containsKey(id)){
            throw new IllegalArgumentException();
        }

        Competition competition = new Competition(name, id, score);
        this.competitions.put(id, competition);
    }

    @Override
    public void compete(int competitorId, int competitionId) {
        if(!this.competitions.containsKey(competitionId) || !this.competitors.containsKey(competitorId)){
            throw new IllegalArgumentException();
        }

        Competitor competitor = this.competitors.get(competitorId);
        Competition competition = this.competitions.get(competitionId);

        competitor.setCompetition(competition);
        competition.getCompetitors().add(competitor);
        int competitionScore = competition.getScore();
        long competitorTotalScore = competitor.getTotalScore();

        competitor.setTotalScore(competitionScore + competitorTotalScore);
    }

    @Override
    public void disqualify(int competitionId, int competitorId) {
        if(!this.competitions.containsKey(competitionId) || !this.competitors.containsKey(competitorId)){
            throw new IllegalArgumentException();
        }

        Competitor competitor = this.competitors.get(competitorId);
        Competition competition = this.competitions.get(competitionId);

        if(!this.contains(competitionId, competitor)){
            throw new IllegalArgumentException();
        }

        competition.getCompetitors().remove(competitor);
        competitor.setCompetition(null);
        int competitionScore = competition.getScore();
        long competitorTotalScore = competitor.getTotalScore();

        competitor.setTotalScore(competitorTotalScore - competitionScore);
    }

    @Override
    public Iterable<Competitor> findCompetitorsInRange(long min, long max) {
        return this.competitors.values().stream().filter(e -> e.getTotalScore() > min && e.getTotalScore() <= max).collect(Collectors.toList());
    }

    @Override
    public Iterable<Competitor> getByName(String name) {
        List<Competitor> collect = this.competitors.values().stream().filter(e -> e.getName().equals(name)).collect(Collectors.toList());

        if(collect.size() == 0){
            throw new IllegalArgumentException();
        }

        return collect;
    }

    @Override
    public Iterable<Competitor> searchWithNameLength(int minLength, int maxLength) {
        return this.competitors.values().stream().filter(e -> e.getName().length() >= minLength && e.getName().length() <= maxLength).collect(Collectors.toList());
    }

    @Override
    public Boolean contains(int competitionId, Competitor comp) {
        if(!this.competitions.containsKey(competitionId)){
            throw new IllegalArgumentException();
        }

        return this.competitions.get(competitionId).getCompetitors().contains(comp);
    }

    @Override
    public int competitionsCount() {
        return this.competitions.size();
    }

    @Override
    public int competitorsCount() {
        return this.competitors.size();
    }

    @Override
    public Competition getCompetition(int id) {
        if(!this.competitions.containsKey(id)){
            throw new IllegalArgumentException();
        }

        return this.competitions.get(id);
    }

    public Competitor getCompetitor(int id) {
        if(!this.competitors.containsKey(id)){
            throw new IllegalArgumentException();
        }

        return this.competitors.get(id);
    }
}
