package com.driver;

public class Main {
  public static void main(String args[]){
      B obj=new B();
      String ans=obj.f1();
      String ans2=obj.f1();
  }
  public static class A{


      public static String f1(){
          return "Invoking method from class A";
      }
  }
  static class B extends A{
      public static String f1(){
          return "Method is overridden in Extendend class B";
      }
  }
}