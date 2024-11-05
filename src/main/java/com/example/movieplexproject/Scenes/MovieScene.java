package com.example.movieplexproject.Scenes;

import com.example.movieplexproject.FixSize;
import com.example.movieplexproject.Panes.MoviePane;
import javafx.scene.Scene;

public class MovieScene extends Scene {
    public MovieScene(){
        super(new MoviePane(), FixSize.SCREEN_HEIGHT,FixSize.SCREEN_WIDTH);
    }
}
