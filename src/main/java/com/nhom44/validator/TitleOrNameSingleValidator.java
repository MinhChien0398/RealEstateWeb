package com.nhom44.validator;

import com.nhom44.bean.ResponseModel;

public class TitleOrNameValidator implements Validator{

    @Override
    public boolean validator(String input) {
        if (input == null || input.trim().isEmpty() || input.length() < 6) {
          return false;
        }
        return true;
    }
}
