package com.algiainc;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Олег", 28);

        Calculator calculator1 = new Calculator(10,5,2);

        calculator1.summ();
        calculator1.substraction();
        calculator1.multiplex();
        calculator1.division();

        calculator1.square_root();
        calculator1.building_in_degree();

    }


}