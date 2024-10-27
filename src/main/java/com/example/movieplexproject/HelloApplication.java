package com.example.movieplexproject;

import com.example.movieplexproject.Scenes.LandingScene;
import javafx.application.Application;

import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static Stage mainStage;
    @Override
    public void start(Stage stage) throws IOException {
//        BorderPane pane = new BorderPane();
//
//        VBox titleBox = new VBox();
//        Text title = new Text("MOVIEPLEX");
//        titleBox.getChildren().add(title);
//        titleBox.setAlignment(Pos.TOP_CENTER);
//
//        VBox buttonBox = new VBox();
//        Button movies = new Button("Movies");
//        Button primeUsers = new Button("Prime Users");
//        Button employee = new Button("Employee");
//        Button exit = new Button("Exit");
//        buttonBox.getChildren().addAll(movies,primeUsers,employee,exit);
//        buttonBox.setAlignment(Pos.CENTER);
//
//        pane.setTop(titleBox);
//        pane.setCenter(buttonBox);

        mainStage = stage;
        mainStage.setTitle("MoviePlex");
        mainStage.setScene(new LandingScene());
        mainStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}