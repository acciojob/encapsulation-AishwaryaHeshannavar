package com.driver;

public class Main {
    //java: name has private access in com.driver.RWOnly
    public static void main(String arg[]){
        RWOnly obj=new RWOnly();
        obj.setName("Priya");
        System.out.println(obj.getName());
    }
  
}