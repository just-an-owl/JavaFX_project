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

    public static String message;

    public static Stage mainWindow = new Stage();

    public static Stage dialogWindow = new Stage();

    public static double leftBoard;

    public static double rightBoard;

    public static int count;

    public static boolean changeParametrs = false;

    public static TabulatedFunction function = new LinkedListTabulatedFunction(0, 15, 5);

    public static void startMainWindow() throws IOException {
        Parent root = FXMLLoader.load(WindowManager.class.getResource("MainWindowTemplate.fxml"));
        mainWindow.setTitle("Tabulated Functions");
        mainWindow.setScene(new Scene(root, 330, 475));
        mainWindow.show();
    }

    public static void startDialogWindow() throws IOException {

        Parent root = FXMLLoader.load(WindowManager.class.getResource("DialogWindowTemplate.fxml"));
        dialogWindow.setTitle("Function Parametrs");
        dialogWindow.setScene(new Scene(root, 330, 200));
        //dialogWindow.initOwner(mainWindow);
        dialogWindow.setResizable(false);
        dialogWindow.initModality(Modality.WINDOW_MODAL);
        dialogWindow.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                if (changeParametrs){
                    function = new LinkedListTabulatedFunction(leftBoard, rightBoard, count);
                    changeParametrs = false;
                }
                dialogWindow.hide();
                event.consume();
            }
        });
        dialogWindow.show();
    }

    public static void showMassageBox(String newMessage)
            throws IOException {
        message=newMessage;
        Parent root = FXMLLoader.load(WindowManager.class.getResource("MessageBoxWindowTemplate.fxml"));
        messageBox.setScene(new Scene(root, 233, 90));
        messageBox.show();
    }
}
