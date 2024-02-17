package com.algiainc;

public class Person {
    private String name;
    private int age;


    public Person(String name, int age){
    this.name = name;
    this.age = age;
    }
    public String getName() {return name;}
    public int getAge() {return age;}
    public void sayInfo() {System.out.println("My name " + name + "\nand my age is " + age);}
}