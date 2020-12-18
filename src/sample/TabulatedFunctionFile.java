package sample;

import functions.*;

import java.io.*;

public class TabulatedFunctionFile implements TabulatedFunction {
    private String fileName;
    private TabulatedFunction tabulatedFunction;
    private boolean modified = false;
    private boolean fileNameAssigned = false;
    public boolean getModified(){return modified;}
    public boolean getFileNameAssigned(){return fileNameAssigned;}
    public void newFunction(double leftX, double rightX, int pointsCount){
        tabulatedFunction = new LinkedListTabulatedFunction(leftX,rightX,pointsCount);
        modified = true;
    }
    public void saveFunction() throws IOException {
        DataOutputStream out =new DataOutputStream(new FileOutputStream(fileName));
        TabulatedFunctions.outputTabulatedFunction(tabulatedFunction,out);}
    public void saveFunctionAs(String fileName) throws IOException {
        DataOutputStream out = new DataOutputStream (new DataOutputStream(new FileOutputStream(fileName)));
        TabulatedFunctions.outputTabulatedFunction(tabulatedFunction,out);
    }
    public void loadFunction(String fileName) throws IOException {
        DataInputStream in = new DataInputStream(new FileInputStream(fileName));
        tabulatedFunction = TabulatedFunctions.inputTabulatedStream(in);
        fileNameAssigned = true;
    }
    public void tabulateFunction(Function function, double leftX, double rightX, int pointsCount) throws InappropriateFunctionPointException {
        tabulatedFunction = TabulatedFunctions.tabule(function,leftX,rightX,pointsCount);
        modified = true;
    }

    @Override
    public void addPoint(FunctionPoint point) throws InappropriateFunctionPointException {
        tabulatedFunction.addPoint(point);
        modified = true;
    }

    @Override
    public FunctionPoint getPoint(int n) {
        return tabulatedFunction.getPoint(n);
    }

    @Override
    public int getPointCount() {
        return tabulatedFunction.getPointCount();
    }

    @Override
    public void setPoint(int index, FunctionPoint point) {
        modified = true;
        tabulatedFunction.setPoint(index, point);
    }

    @Override
    public double getPointX(int index) {
        return tabulatedFunction.getPointX(index);
    }

    @Override
    public void setPointX(int index, double x) throws InappropriateFunctionPointException {
        tabulatedFunction.setPointX(index, x);
        modified = true;
    }

    @Override
    public double getPointY(int index) {
        return tabulatedFunction.getPointY(index);
    }

    @Override
    public void setPointY(int index, double Y) throws InappropriateFunctionPointException {
        tabulatedFunction.setPointY(index, Y);
        modified = true;
    }

    @Override
    public void deletePoint(int index) {
        tabulatedFunction.deletePoint(index);
        modified = true;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return tabulatedFunction.clone();
    }

    @Override
    public double getLeftDomainBorder() {
        return tabulatedFunction.getLeftDomainBorder();
    }

    @Override
    public double getRightDomainBorder() {
        return tabulatedFunction.getRightDomainBorder();
    }

    @Override
    public double getFunctionValue(double x) throws InappropriateFunctionPointException {
        return tabulatedFunction.getFunctionValue(x);
    }
}
