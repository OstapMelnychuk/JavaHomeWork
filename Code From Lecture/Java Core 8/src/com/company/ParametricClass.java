package com.company;

public class ParametricClass <T>{
  private T object;

  public T printObject(){
    System.out.println(object);
    return object;
  }

  public T getObject() {
    return object;
  }

  public void setObject(T object) {
    this.object = object;
  }
}
