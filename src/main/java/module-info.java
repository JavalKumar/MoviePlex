module com.example.movieplexproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.movieplexproject to javafx.fxml;
    exports com.example.movieplexproject;
}