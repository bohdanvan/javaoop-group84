package com.bvan.javaoop.lessons9_10.java8;

import com.bvan.javaoop.lessons9_10.movie.Movie;
import com.bvan.javaoop.lessons9_10.movie.MovieFactory;

import java.util.List;

/**
 * @author bvanchuhov
 */
public class StreamExample {

    public static void main(String[] args) {
        List<Movie> movies = MovieFactory.createMovies();

        // imperative
        for (Movie movie : movies) {
            if (movie.getReleaseYear() > 2000) {
                System.out.println(movie.getTitle());
            }
        }
        System.out.println();

        // functional
        movies.stream()
                .filter(movie -> movie.getReleaseYear() > 2000)
                .map(movie -> movie.getTitle())
                .filter(title -> title.length() < 5)
                .forEach(r -> System.out.println(r));
    }
}
