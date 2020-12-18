package sample;


import javafx.beans.property.SimpleDoubleProperty;

public class TableViewFunctionPoint{
    public TableViewFunctionPoint(){
        x=new SimpleDoubleProperty();
        y=new SimpleDoubleProperty();
    }
    public SimpleDoubleProperty x;
    public SimpleDoubleProperty y;
    public double getX(){return x.get();}
    public double getY(){return y.get();}
}