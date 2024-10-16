module com.example.movieplexproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.movieplexproject to javafx.fxml;
    exports com.example.movieplexproject;
}