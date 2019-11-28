package com.company;

import java.util.*;

public class CollectionClass{
  private List<Integer> list;

  CollectionClass(){
    list = new ArrayList<>();
  }

  public void randomFilling(){
    Random random = new Random();
    for(int i = 0; i < 10; i++){
      list.add(random.nextInt());
    }
  }

  public void contains(Integer i){
    if(list.contains(i)){
      list.remove(i);
    } else {
      list.add(i);
    }
  }

  public void sortCollection(){
    Collections.sort(this.list);
  }

  public void addElementsFromCollection(Collection<Integer> collections){
    for (Integer i : collections){
      if(!list.contains(i)){
        list.add(i);
      }
    }
  }

  public void showElements(){
    for(Integer i : list){
      System.out.println(i);
    }
  }
}