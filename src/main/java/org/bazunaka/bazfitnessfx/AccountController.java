package org.bazunaka.bazfitnessfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AccountController {

    @FXML
    private TextField ageEdit;

    @FXML
    private TextField bicepsEdit;

    @FXML
    private TextField buttocksEdit;

    @FXML
    private TextField chestEdit;

    @FXML
    private TextField fatEdit;

    @FXML
    private TextField heightEdit;

    @FXML
    private TextField imtEdit;

    @FXML
    private TextField nameEdit;

    @FXML
    private TextField pressEdit;

    @FXML
    private Button saveChanges;

    @FXML
    private TextField secondnameEdit;

    @FXML
    private TextField weightEdit;

    @FXML
    void initialize() {

    }

    @FXML
    void saveChanges(ActionEvent event) {
        //Save changes in table. Input String array from Edits.
    }

}

