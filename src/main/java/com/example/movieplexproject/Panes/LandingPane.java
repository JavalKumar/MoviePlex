package com.example.movieplexproject.Panes;

import com.example.movieplexproject.HelloApplication;
import javafx.geometry.Pos;
import javafx.scene.Scene;
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
        movies.setOnMouseClicked(e -> HelloApplication.mainStage.setScene(new Scene(new MoviePane(),1024,768)));


        Button employee = new Button("Employee");
        employee.setOnMouseClicked(e -> HelloApplication.mainStage.setScene(new Scene(new EmployeePane(),1024,768)));


        Button primeUsers = new Button("Prime Users");
        primeUsers.setOnMouseClicked(e -> HelloApplication.mainStage.setScene(new Scene(new UserPane(),1024,768)));

        Button exit = new Button("Exit");
        exit.setOnMouseClicked(e -> System.exit(0));

        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.getChildren().addAll(movies,employee,primeUsers,exit);

        this.setTop(titleBox);
        this.setCenter(buttonBox);
    }

}
