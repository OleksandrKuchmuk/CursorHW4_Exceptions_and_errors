package com.company.Services;

import com.company.Exceptions.MyCustomException;
import com.company.Services.Messages.MessageResult;

public class CalculatingServices implements Calculating {
    private final int number1, number2;
    private final String action;

    public CalculatingServices(int number1, int number2, String action) {
        this.number1 = number1;
        this.number2 = number2;
        this.action = action;
    }

    @Override
    public void addition() throws MyCustomException {
        new MessageResult(number1 + number2).sendMessage();
    }

    @Override
    public void subtraction() throws MyCustomException {
        new MessageResult(number1 - number2).sendMessage();
    }

    @Override
    public void multiplication() throws MyCustomException {
        new MessageResult(number1 * number2).sendMessage();
    }

    @Override
    public void division() throws MyCustomException {
        if (number2 != 0) {
            new MessageResult((float) number1 / number2).sendMessage();
        } else
            throw new ArithmeticException("!!! ERROR !!! Division by zero !!!!");
    }


    public void calculate() throws MyCustomException {
try{
        switch (action) {
            case "+":
                addition();
                break;
            case "-":
                subtraction();
                break;
            case "*":
                multiplication();
                break;
            case "/":
                division();
                break;
            default:
                System.out.println("You entered an incorrect math operand!");

        }
    }catch (NullPointerException e){
    e.fillInStackTrace();
}
    }
}
