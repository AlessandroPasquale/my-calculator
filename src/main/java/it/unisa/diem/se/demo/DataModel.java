package it.unisa.diem.se.demo;

public class DataModel {

    private String firstNumber = "";
    private String secondNumber = "";
    private String operator;
    public void addNumber(int number)
    {
        if(operator.isEmpty()) {
            firstNumber += number;
        }
        else{
            secondNumber += number;
        }
    }

    public void resetNumber()
    {
        firstNumber = "";
    }

    public String getFirstNumber() {
        return firstNumber;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
