module com.example.guitutorial {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.guitutorial to javafx.fxml;
    exports com.example.guitutorial;
}