package sample.ControllersWindow;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.beans.property.*;
import javafx.scene.control.*;

import javafx.event.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.WindowEvent;
import sample.TableViewFunctionPoint;
import sample.Templates.WindowManager;

import java.io.IOException;

public class MainWindowController {
    private Double[] x;
    private double[] y;
    private TableViewFunctionPoint[] tableViewFunctionPointspoints;

    @FXML
    private Button add;

    @FXML
    private Button delete;

    @FXML
    private TextField xField;

    @FXML
    private TextField yField;

    @FXML
    private TableColumn<TableViewFunctionPoint, Double> xColumn;
    @FXML
    private TableColumn<TableViewFunctionPoint, Double> yColumn;

    @FXML
    private TableView<TableViewFunctionPoint> points;

    private ObservableList<TableViewFunctionPoint> observePoints = null;

{
        WindowManager.mainWindow.setOnShowing(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent windowEvent) {
                tableViewFunctionPointspoints = new TableViewFunctionPoint[WindowManager.function.getPointCount()];
                for (int i=0;i<WindowManager.function.getPointCount();++i){
                    tableViewFunctionPointspoints[i] = new TableViewFunctionPoint();
                    tableViewFunctionPointspoints[i].x.set(WindowManager.function.getPointX(i));
                    tableViewFunctionPointspoints[i].y.set(WindowManager.function.getPointY(i));
                }
                observePoints = FXCollections.observableArrayList(tableViewFunctionPointspoints);

                points.setItems(observePoints);
                //xColumn = new TableColumn<TableViewFunctionPoint, Double>("X");
                //xColumn.se
                xColumn.setCellValueFactory(new PropertyValueFactory("x"));
                //yColumn = new TableColumn<TableViewFunctionPoint, Double>("Y");
                yColumn.setCellValueFactory(new PropertyValueFactory("y"));

            }
        });
    }
    @FXML
    private MenuItem createNewFunctionMenuButton;

    @FXML
    private void clickCreateNewFunctionMenuButton(ActionEvent event) throws IOException {
        WindowManager.startDialogWindow();
    }

    private void updateWindow(){
        observePoints.removeAll();
        tableViewFunctionPointspoints = new TableViewFunctionPoint[WindowManager.function.getPointCount()];
        for (int i=0;i<WindowManager.function.getPointCount();++i){
            tableViewFunctionPointspoints[i] = new TableViewFunctionPoint();
            tableViewFunctionPointspoints[i].x.set(WindowManager.function.getPointX(i));
            tableViewFunctionPointspoints[i].y.set(WindowManager.function.getPointY(i));
        }
        observePoints = FXCollections.observableArrayList(tableViewFunctionPointspoints);
    }

    @FXML
    private void clickAddButton(ActionEvent event){}

    @FXML
    private void clickDeleteButton(ActionEvent event){}
}