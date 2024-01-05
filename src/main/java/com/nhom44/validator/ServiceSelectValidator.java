package com.nhom44.validator;

public class ServiceSelectValidator implements MuitipleValidator{
    @Override
    public boolean validator(String[] input) {
        return input == null || input.length == 0;
    }
}
