package sample.ControllersWindow;

import functions.TabulatedFunction;
import javafx.fxml.FXML;

import javafx.scene.control.*;

import javafx.event.*;

public class MainWindowController {
    @FXML
    private Button add;

    @FXML
    private Button delete;

    @FXML
    private TextField xField;

    @FXML
    private TextField yField;

    @FXML
    private TableView<TabulatedFunction> points;

    @FXML
    private void clickAddButton(ActionEvent event){}

    @FXML
    private void clickDeleteButton(ActionEvent event){}
}
