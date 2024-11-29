package com.example.movieplexproject.dao;

import com.example.movieplexproject.pojo.Movie;

import java.util.ArrayList;

public interface movieDAO {
    public ArrayList<Movie> getAllMovies();
    public Movie getMovie(int id);
    public void updateMovie(int id);
    public  void addMovie(Movie movie);
    public void  removeMovie(int id);
}
