package com.example.movieplexproject;

//import com.example.movieplexproject.Scenes.LandingScene;
import com.example.movieplexproject.Database.Database;
import com.example.movieplexproject.Tabs.AddTab;
import com.example.movieplexproject.Tabs.RemoveTab;
import com.example.movieplexproject.Tabs.StatisticTab;
import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
//    public static Stage mainStage;
    @Override
    public void start(Stage stage) throws IOException {
        BorderPane pane = new BorderPane();

        MenuBar menu = new MenuBar();

        Menu movieMenu = new Menu("Movie");
        Menu employeeMenu = new Menu("Employee");
        MenuItem exit = new Menu("Exit");
        exit.setOnAction(e->System.exit(0));

        movieMenu.getItems().add(exit);
        menu.getMenus().addAll(movieMenu,employeeMenu);


        TabPane tabPane = new TabPane();

        AddTab addItemTab = new AddTab();
        RemoveTab removeItemTab = new RemoveTab();
        StatisticTab statisticTab = new StatisticTab();

        tabPane.getTabs().addAll(addItemTab,removeItemTab,statisticTab);
        tabPane.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);

        pane.setTop(menu);
        pane.setCenter(tabPane);

        Database db = Database.getInstance();
        Scene scene = new Scene(pane,400,320);
        stage.setTitle("MoviePlex");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}