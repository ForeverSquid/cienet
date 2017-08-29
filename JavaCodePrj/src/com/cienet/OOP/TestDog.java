package com.cienet.OOP;

public class TestDog{
  public static void main(String args[])  {
    Dog myDog=new Dog();
    myDog.setWeight(50);
    System.out.println("宽度:"+myDog.getWeight());
    myDog.Bark();
    myDog.breath();
    myDog.beat();
  }
}
