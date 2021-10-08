package com.vjezba;

public class Model {
  private int calculateValue;

  public void addNums(int a, int b){
      calculateValue = a + b;
  }
  public int getValue(){
      return calculateValue;
  }
}
