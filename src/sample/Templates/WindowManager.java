package sample.Templates;

import functions.ArrayTabulatedFunction;
import functions.LinkedListTabulatedFunction;
import functions.TabulatedFunction;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import sample.ControllersWindow.*;

import java.io.IOException;


public class WindowManager {
    public static Stage messageBox = new Stage();

    public static Stage mainWindow = new Stage();

    public static Stage dialogWindow = new Stage();

    public static double leftBoard;

    public static double rightBoard;

    public static int count;

    public static boolean changeParametrs = false;

    public TabulatedFunction function;

    public static void startMainWindow() throws IOException {
        Parent root = FXMLLoader.load(WindowManager.class.getResource("MainWindowTemplate.fxml"));
        mainWindow.setTitle("Tabulated Functions");
        mainWindow.setScene(new Scene(root, 330, 475));
        mainWindow.show();
    }

    public static void startDialogWindow() throws IOException {

        Parent root = FXMLLoader.load(WindowManager.class.getResource("DialogWindowTemplate.fxml"));
        dialogWindow.setTitle("Tabulated Functions");
        dialogWindow.setScene(new Scene(root, 330, 200));
        dialogWindow.initOwner(mainWindow);
        dialogWindow.setResizable(false);
        dialogWindow.initModality(Modality.WINDOW_MODAL);
        dialogWindow.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                dialogWindow.hide();
                event.consume();
            }
        });
        dialogWindow.show();
    }

    private void createTabulatedFunction(){
        if (changeParametrs){
            function = new LinkedListTabulatedFunction(leftBoard, rightBoard, count);
            changeParametrs = false;
        }
    }


}
