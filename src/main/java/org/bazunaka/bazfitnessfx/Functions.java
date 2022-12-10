package org.bazunaka.bazfitnessfx;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Functions {

    public void showForm(String pathFile, String titleName, Boolean resize) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(pathFile));

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle(titleName);
        stage.setResizable(resize);
        stage.initModality(Modality.APPLICATION_MODAL); // подумать!!!
        stage.show();
    }
}
