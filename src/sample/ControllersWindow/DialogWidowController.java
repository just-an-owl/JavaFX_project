package sample.ControllersWindow;

import com.sun.glass.ui.Window;
import com.sun.javafx.scene.layout.region.Margins;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.*;
import sample.Templates.WindowManager;

import java.io.IOException;

public class DialogWidowController {



    @FXML
    public Button cancelButton;

    @FXML
    public  Button okButton;

    @FXML
    public TextField leftBorderX;

    @FXML
    public TextField rightBorderX;

    @FXML
    public Spinner<Integer> spinner;

    @FXML
    private void clickOkButton(ActionEvent event) throws IOException {
        WindowManager.count = spinner.getValue();
        String left = leftBorderX.getText();
        String right = rightBorderX.getText();
        try
        {
            WindowManager.leftBoard = Double.parseDouble(left);
            WindowManager.rightBoard = Double.parseDouble(right);
        }
        catch (NumberFormatException exception){
            WindowManager.showMassageBox("invalid value in left or right board");
        }
        WindowManager.changeParametrs = true;
        WindowManager.dialogWindow.hide();
    }

    @FXML
    private void clickCancelButton(ActionEvent event){
        WindowManager.dialogWindow.hide();
    }

}
