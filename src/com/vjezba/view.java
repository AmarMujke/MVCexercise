package com.vjezba;

import javax.swing.*;
import java.awt.event.ActionListener;

public class view extends JFrame {
    private JTextField a = new JTextField(10);
    private JLabel addLabel = new JLabel(" + ");
    private JTextField b = new JTextField(10);
    private JButton calculate = new JButton("calculate");
    private JTextField result = new JTextField(10);

    view(){
        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,200);

        calcPanel.add(a);
        calcPanel.add(addLabel);
        calcPanel.add(b);
        calcPanel.add(calculate);
        calcPanel.add(result);

        this.add(calcPanel);
    }
    public int getA(){
        return Integer.parseInt(a.getText());
    }
    public int getB(){
        return Integer.parseInt(b.getText());
    }
    public int getRes(){
        return Integer.parseInt(result.getText());
    }
    public void setValueOfRes(int solution){
        result.setText(Integer.toString(solution));
    }
    void addCalcListener(ActionListener listenForBtn){
        calculate.addActionListener(listenForBtn);
    }
    void displayError(String errorMessage){
        JOptionPane.showMessageDialog(this,errorMessage);
    }
}
