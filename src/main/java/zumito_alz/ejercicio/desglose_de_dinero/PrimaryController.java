package zumito_alz.ejercicio.desglose_de_dinero;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML TextField txtDinero;
    @FXML TextArea txtA_billetes;
    @FXML TextArea txtA_cantidad;

    @FXML
    private void btn_limpiar_click() throws IOException {
        txtDinero.setText("");
    }
    
    @FXML
    private void btn_Desglosar_click() throws IOException {
        int b500, b200, b100, b50, b20;
        int mon10, mon5, mon2, mon1;
        
        int dinero = Integer.parseInt(txtDinero.getText());
        
        b500 = dinero/500;
        dinero = dinero % 500;
        
        b200 = dinero/200;
        dinero = dinero % 200;
        
        b100 = dinero/100;
        dinero = dinero % 100;
        
        b50 = dinero/50;
        dinero = dinero % 50;
        
        b20 = dinero/20;
        dinero = dinero % 20;
        
        mon10 = dinero/10;
        dinero = dinero % 10;
        
        mon5 = dinero/5;
        dinero = dinero % 5;
        
        mon2 = dinero/2;
        dinero = dinero % 2;
        
        mon1 = dinero/1;
    
        String cantidad = b500 + "\n" +
                          b200 + "\n" +
                          b100 + "\n" + 
                          b50 + "\n" +
                          b20 + "\n" +
                          mon10 + "\n" +
                          mon5 + "\n" +
                          mon2 + "\n" +
                          mon1 + "\n";
        
        txtA_cantidad.setText(cantidad);
        
    }
    
}
