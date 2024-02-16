package org.example;

public class Person {
    String name;
    int age;
    public Person(String name, int age){
    this.name = name;
    this.age = age;
    }
    public void sayInfo(){
        System.out.println("My name " + name + "\nand my age is " + age);
    }
}