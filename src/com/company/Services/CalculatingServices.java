package com.company.Services;

import com.company.Services.Messages.MessageResult;

public class CalculatingServices implements Calculating {
    private float result;
    private int number1, number2;
    private String action;

    public CalculatingServices(int number1, int number2, String action) {
        this.number1 = number1;
        this.number2 = number2;
        this.action = action;
    }

    @Override
    public void calculate() {
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
                }else {
                    throw new IllegalArgumentException("!!! ERROR !!! Division by zero !!!!");
                }
                break;
            default:
                System.out.println("You entered an incorrect math operand!");
        }
    }
}
