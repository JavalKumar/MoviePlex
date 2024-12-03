package com.example.movieplexproject;

import com.example.movieplexproject.Database.Database;
import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import static com.example.movieplexproject.Database.Const.*;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        BorderPane pane = new BorderPane();

        VBox vBox = new VBox();
        TextField user = new TextField();
        PasswordField pass = new PasswordField();
        TextField name = new TextField();
        Button login = new Button("login");

        login.setOnAction(e->{
            DB_USER = user.getText();
            DB_PASS = pass.getText();
            DB_NAME = name.getText();
            Database db = Database.getInstance();
            new menuPage(stage);
        });

        vBox.getChildren().addAll(user,pass,name,login);
        pane.setCenter(vBox);

        Scene scene = new Scene(pane,400,320);
        stage.setScene(scene);
        stage.setTitle("login");
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}