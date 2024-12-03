package com.example.movieplexproject.Tabs;

import com.example.movieplexproject.pojo.Movie;
import com.example.movieplexproject.tables.MovieTable;
import javafx.collections.FXCollections;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Tab;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class AddTab extends Tab {
    public AddTab(){
        this.setText("Add Item");
        GridPane root = new GridPane();
        root.setVgap(10);
        root.setHgap(10);
        MovieTable movieTable = MovieTable.getInstance();

        Text name = new Text("Name");
        ComboBox<Movie> comboName = new ComboBox<>();
        comboName.setItems(FXCollections.observableArrayList(movieTable.getAllMovies()));
        comboName.getSelectionModel().select(0);


    }
}
