package com.example.movieplexproject.Panes;

import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;

public class UserPane extends BorderPane {
    public UserPane(){
        BorderPane pane = new BorderPane();
        Text test = new Text("Hey this is User Pane");

        this.setCenter(test);
    }
}
