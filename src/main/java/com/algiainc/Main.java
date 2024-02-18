package com.algiainc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число\nВведите второе число \n" +
                "Введите степень возведения числа\n" +
                "Квадратный корень и возведение в степень будут вычислены из первого числа");
        System.out.println("===================================");
        Scanner sc = new Scanner(System.in);
        Calculator calculator1 = new Calculator(sc.nextInt(), sc.nextInt(),sc.nextInt());

        calculator1.summ();
        calculator1.substraction();
        calculator1.multiplex();
        calculator1.division();

        calculator1.square_root();
        calculator1.building_in_degree();

    }


}