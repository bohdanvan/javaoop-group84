package com.bvan.javaoop.lessons9_10.movie;

import java.util.*;

/**
 * @author bvanchuhov
 */
public class Movie {

    private final String title;
    private final int releaseYear;
    private final Set<Genre> genres;

    public Movie(String title, int releaseYear, Collection<Genre> genres) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.genres = new TreeSet<>(byGenreName());
        this.genres.addAll(genres);
    }

    private Comparator<Genre> byGenreName() {
        return new Comparator<Genre>() {
            @Override
            public int compare(Genre g1, Genre g2) {
                return g1.name().compareTo(g2.name());
            }
        };
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public Set<Genre> getGenres() {
        return genres;
    }

    public void addGenre(Genre genre) {
        genres.add(genre);
    }

    public boolean hasGenre(Genre genre) {
        return genres.contains(genre);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", genres=" + genres +
                '}';
    }
}
