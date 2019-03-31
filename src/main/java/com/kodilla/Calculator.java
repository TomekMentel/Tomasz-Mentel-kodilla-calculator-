package com.kodilla;

public class Calculator {

    int x;
    int y;

    public static void main(String[] args) {
        System.out.println("Liczby 5 i 8 ");
        Calculator calculator = new Calculator();
        double Suma = calculator.suma(5, 8);
        System.out.println("wynik Sumowanie:" + Suma);
        double Subtraction = calculator.sub(5, 8);
        System.out.println("Wynik odejmowania:" + Subtraction);
        double Multiplication = calculator.multi(5, 8);
        System.out.println("Wynik Mnozenie:" + Multiplication);
        double Division = calculator.divi(5, 8);
        System.out.println("Wynik dzielenia:" + Division);
    }

    int suma(int x, int y) {
        return x + y;

    }

    int multi(int x, int y) {

        return x * y;

    }

    int sub(int x, int y) {
        return x - y;

    }

    double divi(double x, double y) {

        return x / y;


    }
}
