package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import sample.Templates.*;




public class Main extends Application {

    @FXML
    public static Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception{
            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            primaryStage.setTitle("Hello World");
            primaryStage.setScene(new Scene(root, 300, 275));WindowManager.showMassageBox("check");
            WindowManager.startMainWindow();
            //WindowManager.startDialogWindow();

            //primaryStage.show();
            //Test.showMainWindow();
            //Test.showDialogWindow();
            /*WindowManager manager = new WindowManager();
            manager.startMainWindow();
            manager.startDialogWindow();
            /*stage = new Stage();
            stage.setTitle("новое окно");
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initOwner(primaryStage);
            stage.setResizable(false);
            Parent stageParent = FXMLLoader.load(getClass().getResource("newTemplate.fxml"));
            stage.setScene(new Scene( stageParent, 300, 275));
            stage.show();
            stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
                @Override
                public void handle(WindowEvent event) {
                    stage.hide();
                    event.consume();
                }
            });*/

    }


    public static void main(String[] args) {
            launch(args);
    }
}


