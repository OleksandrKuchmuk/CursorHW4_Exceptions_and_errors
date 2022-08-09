package com.company.Services.Messages;

import com.company.Exceptions.MyCustomException;

public class MessageResult extends Message {
    private final float result;

    public MessageResult(float result) {
        this.result = result;
    }

    @Override
    public void sendMessage() throws MyCustomException {
        if (result > 100) {
            throw new MyCustomException("We can only count to 100, sorry.");
        } else if (result % 1 != 0) {
            System.out.print("The result is: " + result);

        } else {
            System.out.print("The result is: " + (int) result);

        }

    }
}
