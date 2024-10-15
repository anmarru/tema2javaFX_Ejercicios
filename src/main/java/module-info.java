module andrea {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;

    opens andrea to javafx.fxml;
    exports andrea;
}
