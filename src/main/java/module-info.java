module org.example.bankingsuite {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens org.example.bankingsuite to javafx.fxml;
    exports org.example.bankingsuite;
}