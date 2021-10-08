package com.vjezba;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controller {
    private view theView;
    private Model calculatorModel;

    public controller(view theView, Model calculatorModel){
        this.theView = theView;
        this.calculatorModel = calculatorModel;

        this.theView.addCalcListener(new CalculateListener());
    }
   class CalculateListener implements ActionListener{

       @Override
       public void actionPerformed(ActionEvent e) {
           int a,b = 0;

           try{
               a = theView.getA();
               b = theView.getB();

               calculatorModel.addNums(a, b);

               theView.setValueOfRes(calculatorModel.getValue());
           }
           catch (NumberFormatException ex){
               theView.displayError("You need to enter two integers");
           }
       }
   }
}
