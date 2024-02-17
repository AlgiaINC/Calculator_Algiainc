package com.algiainc;

public class Calculator {
    public Calculator(int number_01, int number_02, double exponent) {
        this.number_01 = number_01;
        this.number_02 = number_02;
        this.exponent = exponent;

    }
    int number_01;
    int number_02;

    int summ;
    int substraction;
    int multiplex;
    float division;
    double building_in_degree;
    double exponent;
    double square_root;

    public void summ() {
        summ = this.number_01 + this.number_02;
        System.out.println("summ - The answer is " + summ);}

    public void substraction() {
        substraction = this.number_01 - this.number_02;
        System.out.println("substraction - The answer is " + substraction);}

    public void multiplex() {
        multiplex = this.number_01 * this.number_02;
        System.out.println("mult - The answer is " + multiplex);}

    public void division() {
        division = this.number_01 / this.number_02;
        System.out.println("division - The answer is " + division);}

    public void square_root() {
        square_root = Math.sqrt(this.number_01);
        System.out.println("square root - The answer is " + square_root);}

    public void building_in_degree() {
        building_in_degree = Math.pow(this.number_01, this.exponent);
        System.out.println("building in degree - The answer is " + building_in_degree);}
}