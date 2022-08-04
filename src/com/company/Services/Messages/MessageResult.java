package com.company.Services.Messages;

public class MessageResult extends Message {
    private float result;

    public MessageResult(float result) {
        this.result = result;
    }

    @Override
    public void sendMessage() {
        if (result % 1 != 0) {
            System.out.print("The result is: " + result);
        } else {
            System.out.print("The result is: " + (int) result);
        }
    }
}
