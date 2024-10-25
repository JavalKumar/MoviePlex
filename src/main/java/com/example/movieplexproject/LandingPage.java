package com.example.movieplexproject;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LandingPage extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //This is the title of the welcome page.
        Text title = new Text("Welcome to MoviePlex!!");
        title.setStyle("-fx-font-size: 40px; -fx-fill: gold; -fx-text-alignment: center;");


        // these are the buttons for the first welcome page.
        Button movieButton = new Button("Movie");
        Button primeUserButton = new Button("Prime User");
        Button employeeButton = new Button("Employee");


        //An exit button to exit from the page
        Button exitButton = new Button("Exit");

        //Set on Action for the exit tab defines the action for the "Exit" button
        exitButton.setOnAction(e -> {
            Stage LandingPage = (Stage) exitButton.getScene().getWindow();
            primaryStage.close();
        });


        // This is the VBox to hold the buttons
        // 10 pixels spacing
        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(movieButton, primeUserButton, employeeButton);
        vbox.getChildren().add(exitButton);
        exitButton.setStyle("-fx-alignment: top-left; -fx-padding: 10;");

        // Center alignment
        vbox.setStyle("-fx-alignment: center;");

        // LandingPageLayout // 20 pixels spacing
        VBox LandingPageLayout = new VBox(20);
        LandingPageLayout.getChildren().addAll(title, vbox, exitButton);
        LandingPageLayout.setStyle("-fx-alignment: center; -fx-padding: 20;");

        // Scene
        Scene scene = new Scene(LandingPageLayout, 1600, 900);
        primaryStage.setTitle("MoviePlex!!");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
    public static void main(String[] args) {
        launch(args);
    }

}
