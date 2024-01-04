package com.nhom44.validator;

public class NumberVallidator implements SingleValidator {
    @Override
    public boolean validator(String input) {
        if (input==null||input.trim().isEmpty()) return false;
        try {
            int num = Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
