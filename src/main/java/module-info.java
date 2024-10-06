module org.example.csc325module5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.csc325module5 to javafx.fxml;
    exports org.example.csc325module5;
}