package com.bvan.javaoop.lessons9_10.movie;

import com.bvan.javaoop.lessons9_10.movie.Movie;

import java.util.ArrayList;
import java.util.List;

import static com.bvan.javaoop.lessons9_10.movie.Genre.*;
import static java.util.Arrays.asList;

/**
 * @author bvanchuhov
 */
public class MovieFactory {

    public static List<Movie> createMovies() {
        List<Movie> films = new ArrayList<>();
        films.add(new Movie("Her", 2013, asList(ROMANCE, DRAMA, SCI_FI)));
        films.add(new Movie("Captain Fantastic", 2016, asList(DRAMA, ROMANCE, COMEDY)));
        films.add(new Movie("Pulp Fiction", 1994, asList(THRILLER, COMEDY, CRIME)));
        return films;
    }
}
