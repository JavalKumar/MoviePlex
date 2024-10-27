package com.example.movieplexproject.Panes;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class LandingPane extends BorderPane {

    public LandingPane(){
        BorderPane pane = new BorderPane();

        VBox titleBox = new VBox();
        Text title = new Text("MoviePlex");
        titleBox.getChildren().add(title);
        titleBox.setAlignment(Pos.TOP_CENTER);

        VBox buttonBox = new VBox();
        Button movies = new Button("Movies");
        Button primeUsers = new Button("Prime Users");
        Button employee = new Button("Employee");
        Button exit = new Button("Exit");
        buttonBox.getChildren().addAll(movies,primeUsers,employee,exit);
        buttonBox.setAlignment(Pos.CENTER);

        pane.setTop(titleBox);
        pane.setCenter(buttonBox);
    }

}
