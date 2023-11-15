package it.unisa.diem.se.demo;

public class DataModel {

    private String firstNumber = "";

    public void addNumber(int number)
    {
         firstNumber += number;
    }

    public void resetNumber()
    {
        firstNumber = "";
    }

    public String getFirstNumber() {
        return firstNumber;
    }
    
}
