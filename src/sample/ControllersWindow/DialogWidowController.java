package sample.ControllersWindow;

import com.sun.javafx.scene.layout.region.Margins;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.*;
import sample.Templates.WindowManager;

public class DialogWidowController {

    /*public static double leftBoard;

    public static double rightBoard;

    public static int count;*/

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
    private void clickOkButton(ActionEvent event){
        WindowManager.count = spinner.getValue();
        String left = leftBorderX.getText();
        String right = rightBorderX.getText();
        WindowManager.leftBoard = Double.parseDouble(left);
        WindowManager.rightBoard = Double.parseDouble(right);
        WindowManager.changeParametrs = true;
        WindowManager.dialogWindow.hide();
    }

    @FXML
    private void clickCancelButton(ActionEvent event){
        WindowManager.dialogWindow.hide();
    }

}
