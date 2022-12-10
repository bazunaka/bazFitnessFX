package org.bazunaka.bazfitnessfx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

import org.bazunaka.bazfitnessfx.Database;

public class AuthController {

    @FXML
    private Button authButton;

    @FXML
    private TextField login;

    @FXML
    private PasswordField password;

    public void initialize() throws SQLException, ClassNotFoundException {
        Database.Connect();
    }
    /*@FXML
    String checkAuth() throws IOException, ClassNotFoundException, SQLException {
        accounts.AccountName = login.getText();
        accounts.AccountPswd = password.getText();
        accounts.AccountQuery = "SELECT COUNT(*) FROM Accounts WHERE AccountName = '" + accounts.AccountName
                + "' And AccountPswd = '" + accounts.AccountPswd + "';";

        if (accounts.CheckAccount(accounts.AccountQuery, 1, Models.Database.Connect())) {
            Stage stage = (Stage) authButton.getScene().getWindow();
            stage.hide();

            func.showForm("/Views/Main.fxml", "bazFitness - Фитнес приложение 0.1", false);
        }
        ;

        return accounts.AccountName;
    }*/

    @FXML
    void changeColor() {
        authButton.setStyle("-fx-background-color: #393e46;");
    }

    @FXML
    void changeDefaultColor() {
        authButton.setStyle("-fx-background-color: #00adb5;");
    }
}