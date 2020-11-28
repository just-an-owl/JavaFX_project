package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
    @FXML
    private Button btm;

    @FXML
    private Button button;

    @FXML
    private TextArea textFild;

    @FXML
    private TextField text;

    @FXML
    private void click(ActionEvent event) {
        Main.stage.show();
    }

    @FXML
    private void click2(ActionEvent event) {
        String str;
        str = textFild.getText();
        button.setText(str);
    }

    @FXML
    private void actionFild(ActionEvent event){ text.setText("action");}
}
