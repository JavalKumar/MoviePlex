package com.example.movieplexproject.tables;

import com.example.movieplexproject.Database.Database;
import com.example.movieplexproject.dao.MovieDAO;
import com.example.movieplexproject.pojo.Movie;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import static com.example.movieplexproject.Database.DBConst.*;

public class MovieTable implements MovieDAO {
    private static MovieTable instance;

    Database db = Database.getInstance();
    ArrayList<Movie> movies;

    @Override
    public ArrayList<Movie> getAllMovies(){
        String query = "SELECT * FROM " + MOVIE_TABLE;

        movies = new ArrayList<>();

        try{
            Statement getMovies = db.getConnection().createStatement();
            ResultSet resultSet = getMovies.executeQuery(query);

            while (resultSet.next()){
                movies.add(new Movie(
                        resultSet.getInt(MOVIE_COLUMN_ID),
                        resultSet.getString(MOVIE_COLUMN_NAME)
                ));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return movies;
    }

    @Override
    public Movie getMovie(int id){
        String query = "SELECT * FROM " + MOVIE_TABLE +
                " WHERE " + MOVIE_COLUMN_ID + " = " + id;
        try {
            Statement getMovie = db.getConnection().createStatement();
            ResultSet data = getMovie.executeQuery(query);
            if (data.next()){
                Movie movie = new Movie(
                        data.getInt(MOVIE_COLUMN_ID),
                        data.getString(MOVIE_COLUMN_NAME)
                );
                return movie;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static MovieTable getInstance(){
        if (instance == null){
            instance = new MovieTable();
        }
        return instance;
    }


}
