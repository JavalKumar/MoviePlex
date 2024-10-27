package com.example.movieplexproject.Scenes;

import com.example.movieplexproject.FixSize;
import com.example.movieplexproject.Panes.LandingPane;
import javafx.scene.Scene;

public class LandingScene extends Scene {
    public LandingScene(){
        super(new LandingPane(), FixSize.SCREEN_HEIGHT,FixSize.SCREEN_WIDTH);
    }
}
