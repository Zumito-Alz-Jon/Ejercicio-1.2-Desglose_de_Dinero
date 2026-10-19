module zumito_alz.ejercicio.desglose_de_dinero {
    requires javafx.controls;
    requires javafx.fxml;

    opens zumito_alz.ejercicio.desglose_de_dinero to javafx.fxml;
    exports zumito_alz.ejercicio.desglose_de_dinero;
}
