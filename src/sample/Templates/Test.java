package sample.Templates;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Test {

    public static void showDialogWindow() throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(Test.class.getResource("DialogWindowTemplate.fxml"));
        stage.setScene(new Scene(root, 475, 330));
        stage.show();
    }
    public static void showMainWindow() throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(Test.class.getResource("MainWindowTemplate.fxml"));
        stage.setScene(new Scene(root, 330, 475));
        stage.show();
    }
}
