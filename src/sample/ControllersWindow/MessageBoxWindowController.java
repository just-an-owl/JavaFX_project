package sample.ControllersWindow;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.stage.Stage;

import javafx.stage.WindowEvent;
import sample.Templates.*;
import java.io.IOException;

public class MessageBoxWindowController {


    @FXML
    public  TextField textField;

    {
        WindowManager.messageBox.setOnShowing(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent windowEvent) {
                textField.setText(WindowManager.message);
            }
        });
    }
}
