package org.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PrimaryController {
    @FXML
    Label testLabel;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void test(){
        System.out.println("Hello world!!!");
        testLabel.setText("Hello world!!!");
    }
}
