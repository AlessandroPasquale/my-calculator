package it.unisa.diem.se.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {

    private DataModel model = new DataModel();

    @FXML
    private TextField textField;

    private void updateTexfield() {
        if(model.isOperatorSet())
            textField.setText(model.getFirstNumber());
        else textField.setText(model.getSecondNumber());
    }

    private void resetTextfield() {
        textField.setText("");
    }

    @FXML
    void button0Clicked(ActionEvent event) {
        model.addNumber(0);
        updateTexfield();
    }

    @FXML
    void button1Clicked(ActionEvent event) {
        model.addNumber(1);
        updateTexfield();
    }

    @FXML
    void button2Clicked(ActionEvent event) {
        model.addNumber(2);
        updateTexfield();
    }

    @FXML
    void button3Clicked(ActionEvent event) {
        model.addNumber(3);
        updateTexfield();
    }

    @FXML
    void button4Clicked(ActionEvent event) {
        model.addNumber(4);
        updateTexfield();
    }

    @FXML
    void button5Clicked(ActionEvent event) {
        model.addNumber(5);
        updateTexfield();
    }

    @FXML
    void button6Clicked(ActionEvent event) {
        model.addNumber(6);
        updateTexfield();
    }

    @FXML
    void button7Clicked(ActionEvent event) {
        model.addNumber(7);
        updateTexfield();
    }

    @FXML
    void button8Clicked(ActionEvent event) {
        model.addNumber(8);
        updateTexfield();
    }

    @FXML
    void button9Clicked(ActionEvent event) {
        model.addNumber(9);
        updateTexfield();
    }

    @FXML
    void calculateAction(ActionEvent event) {
        Double result = model.calculate();
        textField.setText(result.toString());
    }

    @FXML
    void cancelAction(ActionEvent event) {
        textField.setText("");
        model.resetNumber();
    }

    @FXML
    void divideAction(ActionEvent event) {
        model.setOperator("/");
    }

    @FXML
    void multAction(ActionEvent event) {
        model.setOperator("*");
    }

    @FXML
    void subAction(ActionEvent event) {
        model.setOperator("-");
    }

    @FXML
    void sumAction(ActionEvent event) {
        model.setOperator("+");
    }

}
