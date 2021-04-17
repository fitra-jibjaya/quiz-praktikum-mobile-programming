package com.praktikum.simple_kalkulator;

public class MainPresenter implements MainView.Presenter {

    private MainView.Response view;

    MainPresenter(MainView.Response view){
        this.view = view;
    }

    @Override
    public void init(double textOne, double textTwo, double textThree, double hasil, int type,boolean checkOne, boolean checkTwo, boolean checkThree) {
        switch (type){
            case 1:
                if (textOne> 0 && textTwo > 0 && textThree > 0){
                    if (checkOne && checkTwo && checkThree){
                        hasil = textOne + textTwo + textThree;
                        view.showSuccess(hasil);
                    }else {
                        view.showError("belum diceklist");
                    }
                }else if (textOne > 0 && textTwo > 0){
                    if (checkOne && checkTwo){
                        hasil = textOne + textTwo;
                        view.showSuccess(hasil);
                    }else {
                        view.showError("belum diceklist");
                    }
                }else if (textTwo>0 && textThree>0) {
                    if (checkTwo && checkThree) {
                        hasil = textTwo + textThree;
                        view.showSuccess(hasil);
                    } else {
                        view.showError("belum diceklis");
                    }
                } else if (textOne>0 && textThree>0){
                    if (checkOne && checkThree) {
                        hasil = textOne + textThree;
                        view.showSuccess(hasil);
                    } else {
                        view.showError("belum diceklis");
                    }
                } else {
                    view.showError("kolom belum diisi");
                }
                break;
            case 2:
                if (textOne >0 && textTwo > 0 && textThree > 0) {
                    if (checkOne && checkTwo && checkThree) {
                        hasil = textOne - textTwo - textThree;
                        view.showSuccess(hasil);
                    } else {
                        view.showError("belum diceklis");
                    }
                } else if (textOne >0 && textTwo >0) {
                    if (checkOne && checkTwo) {
                        hasil = textOne - textTwo;
                        view.showSuccess(hasil);
                    } else {
                        view.showError("belum diceklis");
                    }
                } else if (textTwo>0 && textThree>0) {
                    if (checkTwo && checkThree) {
                        hasil = textTwo - textThree;
                        view.showSuccess(hasil);
                    } else {
                        view.showError("belum diceklis");
                    }
                } else if (textOne>0 && textThree>0){
                    if (checkOne && checkThree) {
                        hasil = textOne - textThree;
                        view.showSuccess(hasil);
                    } else {
                        view.showError("belum diceklis");
                    }
                } else {
                    view.showError("kolom belum diisi");
                }
                break;
            case 3:
                if (textOne >0 && textTwo > 0 && textThree > 0) {
                    if (checkOne && checkTwo && checkThree) {
                        hasil = textOne * textTwo * textThree;
                        view.showSuccess(hasil);
                    } else {
                        view.showError("belum diceklis");
                    }
                } else if (textOne >0 && textTwo >0) {
                    if (checkOne && checkTwo) {
                        hasil = textOne * textTwo;
                        view.showSuccess(hasil);
                    } else {
                        view.showError("belum diceklis");
                    }
                } else if (textTwo>0 && textThree>0) {
                    if (checkTwo && checkThree) {
                        hasil = textTwo * textThree;
                        view.showSuccess(hasil);
                    } else {
                        view.showError("belum diceklis");
                    }
                } else if (textOne>0 && textThree>0){
                    if (checkOne && checkThree) {
                        hasil = textOne * textThree;
                        view.showSuccess(hasil);
                    } else {
                        view.showError("belum diceklis");
                    }
                } else {
                    view.showError("kolom belum diisi");
                }
                break;
            case 4:
                if (textOne >0 && textTwo > 0 && textThree > 0) {
                    if (checkOne && checkTwo && checkThree) {
                        hasil = textOne / textTwo / textThree;
                        view.showSuccess(hasil);
                    } else {
                        view.showError("belum diceklis");
                    }
                } else if (textOne >0 && textTwo >0) {
                    if (checkOne && checkTwo) {
                        hasil = textOne / textTwo;
                        view.showSuccess(hasil);
                    } else {
                        view.showError("belum diceklis");
                    }
                } else if (textTwo>0 && textThree>0) {
                    if (checkTwo && checkThree) {
                        hasil = textTwo / textThree;
                        view.showSuccess(hasil);
                    } else {
                        view.showError("belum diceklis");
                    }
                } else if (textOne>0 && textThree>0){
                    if (checkOne && checkThree) {
                        hasil = textOne / textThree;
                        view.showSuccess(hasil);
                    } else {
                        view.showError("belum diceklis");
                    }
                } else {
                    view.showError("kolom belum diisi");
                }
                break;
        }
    }
}
