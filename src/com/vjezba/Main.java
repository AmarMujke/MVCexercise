package com.vjezba;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        view myView = new view();
        Model myModel = new Model();

        controller myController = new controller(myView,myModel);
        myView.setVisible(true);
    
    }

}