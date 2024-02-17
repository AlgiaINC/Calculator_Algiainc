package com.algiainc;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Олег", 28);

        Calculator calculator1 = new Calculator(2,3);

        calculator1.summ(2,3);
        calculator1.substraction(10,5);
        calculator1.multiplex();
        calculator1.division();

        calculator1.square_root(50);
        calculator1.building_in_degree(6,2);

    }


}