module uz.bakhromjon.javafxcss {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens uz.bakhromjon.javafxcss to javafx.fxml;
    exports uz.bakhromjon.javafxcss;
}