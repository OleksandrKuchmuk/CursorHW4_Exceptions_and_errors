package com.company;

import com.company.Exceptions.MyCustomException;
import com.company.Services.CalculatingServices;
import com.company.Services.Input;

public class Main {

    public static void main(String[] args) throws MyCustomException {
        Input input = new Input();
        input.input();
        CalculatingServices calculatingServices = new CalculatingServices(input.getNumber1(), input.getNumber2(), input.getAction());
        calculatingServices.calculate();
    }
}