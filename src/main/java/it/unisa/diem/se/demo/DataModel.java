package it.unisa.diem.se.demo;

public class DataModel {

    private StringBuffer firstNumber;
    private StringBuffer secondNumber;
    private StringBuffer operator;

    public DataModel() {
        this.firstNumber = new StringBuffer();
        this.secondNumber = new StringBuffer();
        this.operator = new StringBuffer();
    }

    public void addNumber(int number)
    {
        if(isOperatorSet()) {
            firstNumber.append(number);
        }
        else {
            secondNumber.append(number);
        }
    }

    public void resetNumber()
    {
        firstNumber.delete(0, firstNumber.length());
    }

    public String getFirstNumber() {
        return firstNumber.toString();
    }

    public String getOperator() {
        return operator.toString();
    }

    public void setOperator(String operator) {
        this.operator.append(operator);
    }

    public double calculate(){
        Double result = 0.0;
        int operand1 = Integer.parseInt(firstNumber.toString());
        int operand2 = Integer.parseInt(secondNumber.toString());

        switch(operator.toString()){
            case "+":
                result = (double) (operand1 + operand2);
                break;

            case "-":
                result = (double) (operand1 - operand2);
                break;

            case "*":
                result = (double) (operand1 * operand2);
                break;

            case "/":
                result = (double) operand1 / operand2;
                break;

            default:
                break;

        }

        operator.delete(0, operator.length());

        Integer resInt = result.intValue();

        firstNumber.replace(0, firstNumber.length(), resInt.toString());
        secondNumber.delete(0, secondNumber.length());

        return result;
    }

    public boolean isOperatorSet(){
        return this.operator.isEmpty();
    }

    public String getSecondNumber() {
        return secondNumber.toString();
    }
}
