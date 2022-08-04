package com.company.Services.Messages;

import com.company.Exceptions.MyCustomException;

public abstract class Message {
    public abstract void sendMessage() throws MyCustomException;
}
