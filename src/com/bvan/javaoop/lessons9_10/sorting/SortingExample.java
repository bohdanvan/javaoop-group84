package com.bvan.javaoop.lessons9_10.sorting;

import com.bvan.javaoop.lessons9_10.movie.Movie;
import com.bvan.javaoop.lessons9_10.movie.MovieFactory;

import java.util.Comparator;
import java.util.List;

import static com.bvan.javaoop.lessons9_10.sorting.MovieComparators.byTitleLength;
import static com.bvan.javaoop.lessons9_10.sorting.MovieComparators.byYear;

/**
 * @author bvanchuhov
 */
public class SortingExample {

    public static void main(String[] args) {
        List<Movie> movies = MovieFactory.createMovies();
        printMovies(movies);
        System.out.println();

        Comparator<Movie> comparator = byYear().thenComparing(byTitleLength().reversed());

        movies.sort(comparator);
        printMovies(movies);
    }

    private static void printMovies(List<Movie> movies) {
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}

