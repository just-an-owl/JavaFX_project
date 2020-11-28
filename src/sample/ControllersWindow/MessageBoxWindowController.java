package sample.ControllersWindow;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.stage.Stage;

import sample.Templates.*;
import java.io.IOException;

public class MessageBoxWindowController {


    @FXML
    private static Stage messageBoxStage;

    @FXML
    private static TextField textField;

    @FXML
    public static void show(String message) throws IOException {
        Parent root = FXMLLoader.load(MessageBoxWindowController.class.getResource("Templates//MessageBoxWindowTemplate.fxml"));
        messageBoxStage.setScene(new Scene(root, 330, 475));
        messageBoxStage.show();
        textField.setText(message);
    }

    @FXML
    private void clickOk(ActionEvent event){

    }

}
