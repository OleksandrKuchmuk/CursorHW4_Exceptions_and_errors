package com.company.Services;

import com.company.Services.Messages.Message;
import com.company.Services.Messages.MessageNumber;
import com.company.Services.Messages.MessageOperand;

import java.util.Scanner;

public class Input {
    private int number, number1, number2;
    private String action;
    private Scanner scanner = new Scanner(System.in);
    private Message messageNumber = new MessageNumber();
    private Message messageOperand = new MessageOperand();

    public void input(){
        messageNumber.sendMessage();
        inputNumber();
        this.number1 = number;

        messageOperand.sendMessage();
        inputOperand();


        messageNumber.sendMessage();
        inputNumber();
        this.number2=number;
    }

    private int inputNumber(){
      number = scanner.nextInt();
       return number;
       }

    private String inputOperand(){
        action = scanner.next();
        return action;
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