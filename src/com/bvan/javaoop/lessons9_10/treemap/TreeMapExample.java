package com.bvan.javaoop.lessons9_10.treemap;

import com.bvan.javaoop.lessons9_10.movie.Movie;

import java.util.*;

import static com.bvan.javaoop.lessons9_10.movie.Genre.*;
import static java.util.Arrays.asList;

/**
 * @author bvanchuhov
 */
public class TreeMapExample {

    public static void main(String[] args) {
        SortedMap<Integer, List<Movie>> yearToMovies = new TreeMap<>();

        yearToMovies.put(2013, asList(
                new Movie("Her", 2013, asList(ROMANCE, DRAMA, SCI_FI))
        ));
        yearToMovies.put(1994, asList(
                new Movie("Captain Fantastic", 1994, asList(DRAMA, ROMANCE, COMEDY)),
                new Movie("Pulp Fiction", 1994, asList(THRILLER, COMEDY, CRIME))
        ));
        yearToMovies.put(2000, asList(
                new Movie("A", 2000, asList(DRAMA, ROMANCE, COMEDY)),
                new Movie("B", 2000, asList(THRILLER, COMEDY, CRIME))
        ));

        SortedMap<Integer, List<Movie>> integerListSortedMap =
                yearToMovies.subMap(2000, 2015);

    }
}
