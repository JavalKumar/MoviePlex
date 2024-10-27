package com.example.movieplexproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class LandingPage extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        BorderPane pane = new BorderPane();

        VBox titleBox = new VBox();
        Text title = new Text("MOVIEPLEX");
        titleBox.getChildren().add(title);
        titleBox.setAlignment(Pos.TOP_CENTER);

        VBox buttonBox = new VBox();
        Button movies = new Button("Movies");
        Button primeUsers = new Button("Prime Users");
        Button employee = new Button("Employee");
        buttonBox.getChildren().addAll(movies,primeUsers,employee);
        buttonBox.setAlignment(Pos.CENTER);

        pane.setTop(titleBox);
        pane.setCenter(buttonBox);

        Scene scene = new Scene(pane, 1024, 768);
        stage.setTitle("MoviePlex");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
}
}