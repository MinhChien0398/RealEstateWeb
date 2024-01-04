package com.nhom44.validator;

public class SelectorSingleValidator implements SingleValidator {
    @Override
    public boolean validator(String input) {
        if(input==null||input.trim().isEmpty())
        return false;
        return true;
    }
}
