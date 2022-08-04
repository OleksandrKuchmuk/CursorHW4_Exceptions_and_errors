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
    public void calculate() throws MyCustomException {
        float result;
        switch (action) {
            case "+":
                result = number1 + number2;
                new MessageResult(result).sendMessage();
                break;
            case "-":
                result = number1 - number2;
                new MessageResult(result).sendMessage();
                break;
            case "*":
                result = number1 * number2;
                new MessageResult(result).sendMessage();
                break;
            case "/":
                if (number2 != 0) {
                    result = (float) number1 / number2;
                    new MessageResult(result).sendMessage();
                } else {
                    throw new ArithmeticException("!!! ERROR !!! Division by zero !!!!");
                }
                break;
            default:
                System.out.println("You entered an incorrect math operand!");
        }
    }
}
