package sample.ControllersWindow;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.*;

public class DialogWidowController {
    @FXML
    private Button cancelButton;

    @FXML
    private Button okButton;

    @FXML
    private Spinner<Integer> spinner;

    @FXML
    private void clickOkButton(ActionEvent event){
        int k = spinner.getValue();
        cancelButton.setText(Integer.toString(k));
    }

    @FXML
    private void clickCancelButton(ActionEvent event){}
}
