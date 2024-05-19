package com.lannstark.lec12;

public class Lec12Main {

  public static void main(String[] args) {
    Person.Factory.newBaby("ABC");
    
    // @JvmStatic을 붙였을 때 이렇게 사용 가능
    Person.newBaby("ABC");
  }

}
