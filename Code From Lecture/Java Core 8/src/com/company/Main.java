package com.company;

import com.company.Pack.Classz;

import java.util.*;

public class Main {

  public static void main(String[] args) {
    MyArrayList myArrayList = new MyArrayList();
    for(int i = 0; i < 200; i++){
      myArrayList.add(i);
    }
    Classz classz = new Classz();
    myArrayList.printCollection();
  }
}
