package com.gmail.s.granovskiy;

public class MyException extends Exception {
    @Override
    public String getMessage() {
        return System.lineSeparator() + "There are too many objects in the array.";
    }
}
