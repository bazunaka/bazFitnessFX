package org.bazunaka.bazfitnessfx;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import org.bazunaka.bazfitnessfx.Database;

public class MainController {

    @FXML
    private Label account;

    @FXML
    private ImageView accountImage;

    @FXML
    private Label analyze;

    @FXML
    private ImageView analyzeImage;

    @FXML
    private Button authButton;

    @FXML
    private Label identy;

    @FXML
    private Label nutrition;

    @FXML
    private ImageView nutritionImage;

    @FXML
    private Label references;

    @FXML
    private ImageView referencesImage;

    @FXML
    private Label settings;

    @FXML
    private ImageView settingsImage;

    @FXML
    private Label training;

    @FXML
    private ImageView trainingImage;

    @FXML
    protected void initialize() throws ClassNotFoundException, IOException, SQLException {
        List<String> menus = Database.SelectDB("SELECT MenuName FROM Menus;", 1);
        references.setText((String) menus.get(0));
        account.setText((String) menus.get(1));
        training.setText((String) menus.get(2));
        analyze.setText((String) menus.get(3));
        nutrition.setText((String) menus.get(4));
        settings.setText((String) menus.get(5));

        referencesImage.getStyleClass().add("referencesImage");
    }

    public MainController() {
        this.func = new Functions();
    }

    private Functions func;

    @FXML
    void showAuthForm() throws IOException {

    }

    @FXML
    void showChildForm() throws IOException {

        if (referencesImage.isPressed()) {
            func.showForm("/Views/FormReferences.fxml", references.getText(), false);
        } else if (accountImage.isPressed()) {
            
            func.showForm("/Views/FormAccount.fxml", account.getText(), false);
        } else if (trainingImage.isPressed()) {
            
            func.showForm("/Views/FormTraining.fxml", training.getText(), false);
        } else if (analyzeImage.isPressed()) {
            
            func.showForm("/Views/FormAnalyze.fxml", analyze.getText(), false);
        } else if (nutritionImage.isPressed()) {
            
            func.showForm("/Views/FormNutrition.fxml", nutrition.getText(), false);
        } else {
            
            func.showForm("/Views/FormSettings.fxml", settings.getText(), false);
        }
    }

}
