package com.company.Services;

import com.company.Exceptions.MyCustomException;
import com.company.Services.Messages.Message;
import com.company.Services.Messages.MessageNumber;
import com.company.Services.Messages.MessageOperand;

import java.util.Scanner;

public class Input {
    private int number1, number2;
    private String action;
    private final Scanner scanner = new Scanner(System.in);
    private final Message messageNumber = new MessageNumber();
    private final Message messageOperand = new MessageOperand();

    public void input() throws MyCustomException {
        messageNumber.sendMessage();
        number1 = scanner.nextInt();

        messageOperand.sendMessage();
        action = scanner.next();

        messageNumber.sendMessage();
        number2=scanner.nextInt();
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public String getAction() {
        return action;
    }
}