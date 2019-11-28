package com.company;

import java.util.Arrays;

public class MyArrayList {
  private Integer[] arr;
  private int size = 0;

  public MyArrayList(){
    arr = new Integer[10];
  }

  public void add(Integer i){
    if (size + 1 > arr.length){
      Integer[] newArr = Arrays.copyOf(arr, (int)(arr.length * 1.5));
      arr = newArr;
      arr[size] = i;
      size++;
    } else {
      arr[size] = i;
      size++;
    }
  }

  public void printCollection(){
    for(int i = 0; i < arr.length; i++){
      if(arr[i] != null) {
        System.out.println(arr[i]);
      }
    }
  }
}
