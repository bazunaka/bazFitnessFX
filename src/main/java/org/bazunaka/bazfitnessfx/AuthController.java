package org.bazunaka.bazfitnessfx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

import org.bazunaka.bazfitnessfx.Database;
import org.bazunaka.bazfitnessfx.Accounts;

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

    Accounts accounts = new Accounts();
    @FXML
    String checkAuth() throws IOException, ClassNotFoundException, SQLException {
        accounts.AccountName = login.getText();
        accounts.AccountPswd = password.getText();
        accounts.AccountQuery = "SELECT COUNT(*) FROM Accounts WHERE AccountName = '" + accounts.AccountName
                + "' And AccountPswd = '" + accounts.AccountPswd + "';";

        if (accounts.CheckAccount(accounts.AccountQuery, 1, Database.Connect())) {
            Stage stage = (Stage) authButton.getScene().getWindow();
            stage.hide();

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Main.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setScene(scene);
            stage.show();
            //func.showForm("/Views/Main.fxml", "bazFitness - Фитнес приложение 0.1", false);
        }
        ;

        return accounts.AccountName;
    }

    @FXML
    void changeColor() {
        authButton.setStyle("-fx-background-color: #393e46;");
    }

    @FXML
    void changeDefaultColor() {
        authButton.setStyle("-fx-background-color: #00adb5;");
    }
}