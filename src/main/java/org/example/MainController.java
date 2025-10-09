package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.example.model.Model;

public class MainController {

    private Model model;

    public void setModel(Model model) {
        this.model = model;
    }

    @FXML
    private Label seasonsLabel;

    @FXML
    private Label creditsLabel;

    @FXML
    private Label dateOfBirthLabel;

    @FXML
    private Label nameLabel;

    @FXML
    void handleLoadButtonClicked() {
    //    nameLabel.setText(model.getStudent().getName());
        nameLabel.textProperty().bind(model.getStudent().nameProperty());
        creditsLabel.setText("" + model.getStudent().getCredits());
        dateOfBirthLabel.setText(model.getStudent().getDateOfBirth().toString());
        System.out.println("Firework!!!");
    }

    @FXML
    void handleChangeButtonClicked() {
        model.getStudent().setName("Tom Smith");
     //   nameLabel.setText(model.getStudent().getName());
    }

    @FXML
    void handleClick() {
        System.out.println("Hello world!!!");
        if (seasonsLabel.getText().equals("Summer"))
            seasonsLabel.setText("Autumn");
        else
            seasonsLabel.setText("Summer");
    }

    @FXML
    private void initialize() {

    }
}
