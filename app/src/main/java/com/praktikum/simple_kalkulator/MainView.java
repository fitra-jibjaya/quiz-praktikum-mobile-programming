package com.praktikum.simple_kalkulator;

public interface MainView {

    interface Presenter{
        void init(double textOne, double textTwo, double textThree, double hasil, int type, boolean checkOne, boolean checkTwo, boolean checkThree);
    }
    interface Response{
        void showSuccess(double value);
        void showError(String message);
    }
}
