package com.company.Services;

import com.company.Exceptions.MyCustomException;

public interface Calculating {

    void addition() throws MyCustomException;

    void subtraction() throws MyCustomException;

    void multiplication() throws MyCustomException;

    void division() throws MyCustomException;
}
