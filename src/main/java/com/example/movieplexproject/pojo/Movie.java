package com.example.movieplexproject.pojo;

public class Movie {
    private int movie_id;
    private  String name;
    private double rating;
    private String genre;
    private  String screen;
    private int length;

    public Movie(int movie_id, String name, double rating, String genre, String screen, int length) {
        this.movie_id = movie_id;
        this.name = name;
        this.rating = rating;
        this.genre = genre;
        this.screen = screen;
        this.length = length;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                '}';
    }
    // public static final String MOVIE_COLUMN_ID = "movie_id";
   // public static final String MOVIE_COLUMN_NAME = "name";
    //public static final String MOVIE_COLUMN_RATING = "rating";
   // public static final String MOVIE_COLUMN_GENRE = "genre";
   // public static final String MOVIE_COLUMN_SCREEN = "screen";
   // public static final String MOVIE_COLUMN_LENGTH = "length";
}
