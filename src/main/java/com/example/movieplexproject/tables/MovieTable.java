package com.example.movieplexproject.tables;

import com.example.movieplexproject.Database.Database;
import com.example.movieplexproject.dao.movieDAO;
import com.example.movieplexproject.pojo.Movie;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import static com.example.movieplexproject.Database.DBConst.*;

public class MovieTable implements movieDAO {
    private  static MovieTable instance;
    Database db = Database.getInstance();
    ArrayList<Movie> movies;
    private MovieTable() {
        db = Database.getInstance();
    }
    @Override
    public ArrayList<Movie> getAllMovies() {
        String query = "SELECT * FROM" + MOVIE_TABLE;
        movies = new ArrayList<>();
        try {
            Statement statement = db.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                resultSet.getInt(MOVIE_COLUMN_ID);
                resultSet.getString(MOVIE_COLUMN_NAME);
                resultSet.getDouble(MOVIE_COLUMN_RATING);
                resultSet.getString(MOVIE_COLUMN_GENRE);
                resultSet.getString(MOVIE_COLUMN_SCREEN);
                resultSet.getInt(MOVIE_COLUMN_LENGTH);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Movie getMovie(int id) {
        return null;
    }

    @Override
    public void updateMovie(int id) {

    }

    @Override
    public void addMovie(Movie movie) {

    }

    @Override
    public void removeMovie(int id) {

    }
}
