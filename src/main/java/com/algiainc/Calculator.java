package com.algiainc;

public class Calculator {int number_01; int number_02;
    public Calculator(int number_01, int number_02) {
this.number_01 = number_01;
this.number_02 = number_02;}
    int summ;
    int substraction;
    int multiplex;
    float division;
    double building_in_degree;
    int exponent;
    double square_root;

    public int summ(int number_01, int number_02) {
        summ = this.number_01 + this.number_02;
        System.out.println("summ - The answer is " + summ);
        return summ;
    }

    public int substraction(int number_01, int number_02) {
        substraction = this.number_01 - this.number_02;
        System.out.println("substraction - The answer is " + substraction);
        return substraction;
    }

    public int multiplex(int number_01, int number_02) {
        multiplex = this.number_01 * this.number_02;
        System.out.println("mult - The answer is " + multiplex);

        return multiplex;
    }

    public float division(int number_01, int number_02) {
        division = this.number_01 / this.number_02;
        System.out.println("division - The answer is " + division);
        return division;
    }

    public double square_root(int number_01) {
        square_root = Math.sqrt(this.number_01);
        System.out.println("square root - The answer is " + square_root);
        return square_root;
    }

    public double building_in_degree(int number_01, int exponent) {
        building_in_degree = Math.pow(this.number_01, this.exponent);
        System.out.println("building in degree - The answer is " + building_in_degree);
        return building_in_degree;
    }
}