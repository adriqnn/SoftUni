package structures;

import entities.Actor;
import entities.Movie;

public interface MovieDatabase {
    void addActor(Actor actor);
    void addMovie(Actor actor, Movie movie) throws IllegalArgumentException;
    boolean contains(Actor actor);
    boolean contains(Movie movie);
    Iterable<Movie> getAllMovies();
    Iterable<Actor> getNewbieActors();
    Iterable<Movie> getMoviesOrderedByBudgetThenByRating();
    Iterable<Actor> getActorsOrderedByMaxMovieBudgetThenByMoviesCount();
    Iterable<Movie> getMoviesInRangeOfBudget(double lower, double upper);
}
