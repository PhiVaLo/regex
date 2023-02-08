package bfst2023.handins.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import bfst2023.handins.model.Address;
import bfst2023.handins.model.LoadAddress;

import org.controlsfx.control.textfield.TextFields;

public class MainController {
    @FXML private TextField myTextField;
    @FXML private Label street, house, floor_side, postcode, city;

    private LoadAddress addressCollection;

    @FXML public void initialize() {
        
        addressCollection = new LoadAddress();
        addressCollection.setAddress();  //! temporary hard-coded addresses
        TextFields.bindAutoCompletion(myTextField, addressCollection.getAddress());

        //! testing whether the parsing name is null for now
        // TODO - change to whether it contains within the data-set names later...
        myTextField.setOnAction(e -> {
            Address address = Address.parse(myTextField.getText());
            street.setText(address.street != null ? address.street : "N/A");
            house.setText(address.house != null ? address.house : "N/A");
            floor_side.setText(address.floor != null ? address.floor + " " + address.side : "N/A");
            postcode.setText(address.postcode != null ? address.postcode : "N/A");
            city.setText(address.city != null ? address.city : "N/A");
        });
    }
}
