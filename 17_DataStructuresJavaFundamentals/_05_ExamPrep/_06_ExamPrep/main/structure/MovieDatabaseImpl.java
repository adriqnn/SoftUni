package structures;

import entities.Actor;
import entities.Movie;

import java.util.*;
import java.util.stream.Collectors;

public class MovieDatabaseImpl implements MovieDatabase {
    private Set<Movie> moviesSet;
    private Set<Actor> actorsSet;
    private Map<String, Actor> actors;
    private Map<String, Movie> movies;
    private Map<String, Set<Movie>> listOfActorsAndMovies;
    private Set<Actor> newbies;

    public MovieDatabaseImpl() {
        this.actorsSet = new LinkedHashSet<>();
        this.moviesSet = new LinkedHashSet<>();
        this.actors = new LinkedHashMap<>();
        this.movies = new LinkedHashMap<>();
        this.listOfActorsAndMovies = new LinkedHashMap<>();
        this.newbies = new LinkedHashSet();
    }

    @Override
    public void addActor(Actor actor) {
        this.actors.putIfAbsent(actor.getId(), actor);
        this.listOfActorsAndMovies.putIfAbsent(actor.getId(), new LinkedHashSet<>());
        this.actorsSet.add(actor);
        this.newbies.add(actor);
    }

    @Override
    public void addMovie(Actor actor, Movie movie) throws IllegalArgumentException {
        if(!this.actors.containsKey(actor.getId())){
            throw new IllegalArgumentException();
        }

        if(movie.getBudget() > actor.getMaxMovieBudget()){
            actor.setMaxMovieBudget(movie.getBudget());
        }

        this.moviesSet.add(movie);
        this.movies.putIfAbsent(movie.getId(), movie);
        this.listOfActorsAndMovies.get(actor.getId()).add(movie);
        this.newbies.remove(actor);
    }

    @Override
    public boolean contains(Actor actor) {
        return this.actors.containsKey(actor.getId());
    }

    @Override
    public boolean contains(Movie movie) {
        return this.movies.containsKey(movie.getId());
    }

    @Override
    public Iterable<Movie> getAllMovies() {
        return this.movies.values();
    }

    @Override
    public Iterable<Actor> getNewbieActors() {
        return this.newbies;
    }

    @Override
    public Iterable<Movie> getMoviesOrderedByBudgetThenByRating() {
        return this.moviesSet.stream().sorted((m1, m2) -> {
            int result = Double.compare(m2.getBudget(), m1.getBudget());

            if(result == 0){
                result = Double.compare(m2.getRating(), m1.getRating());
            }

            return result;
        }).collect(Collectors.toList());
//        return this.movies.values().stream().sorted(Comparator.comparing(Movie::getBudget).reversed().thenComparing(Movie::getRating).reversed()).collect(Collectors.toList());
    }

    @Override
    public Iterable<Actor> getActorsOrderedByMaxMovieBudgetThenByMoviesCount() {
        return this.listOfActorsAndMovies.entrySet().stream().sorted((a1, a2) -> {
//            List<Movie> firstMovieListA1 = a1.getValue().stream().sorted(Comparator.comparing(Movie::getBudget).reversed()).collect(Collectors.toList());
//            List<Movie> secondMovieListA2 = a2.getValue().stream().sorted(Comparator.comparing(Movie::getBudget).reversed()).collect(Collectors.toList());

//            double firstMovieSum = a1.getValue().stream().map(Movie::getBudget).mapToDouble(Double::doubleValue).sum();
//            double secondMovieSum = a2.getValue().stream().map(Movie::getBudget).mapToDouble(Double::doubleValue).sum();
//
//            double result =  Double.compare(secondMovieSum, firstMovieSum);

            double result =  Double.compare(this.actors.get(a2.getKey()).getMaxMovieBudget(), this.actors.get(a1.getKey()).getMaxMovieBudget());

            if(result == 0){
                result = Integer.compare(a2.getValue().size(), a1.getValue().size());
            }

            return (int) result;
        }).map(e -> this.actors.get(e.getKey())).collect(Collectors.toList());
    }

    @Override
    public Iterable<Movie> getMoviesInRangeOfBudget(double lower, double upper) {
        return this.movies.values().stream().filter(e -> e.getBudget() >= lower && e.getBudget() <= upper).sorted(Comparator.comparing(Movie::getRating).reversed()).collect(Collectors.toList());
    }
}
