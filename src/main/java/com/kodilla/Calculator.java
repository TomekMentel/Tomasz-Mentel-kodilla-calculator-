package com.kodilla;

public class Calculator {

    int x;
    int y;

    public static void main(String[] args) {

        System.out.println("Liczby 5 i 8 ");

        Calculator calculator = new Calculator();
        double suma = calculator.suma(5, 8);
        System.out.println("wynik Sumowanie:" + suma);
        double subtraction = calculator.sub(5, 8);
        System.out.println("Wynik odejmowania:" + subtraction);
        double multiplication = calculator.multi(5, 8);
        System.out.println("Wynik Mnozenie:" + multiplication);
        double division = calculator.divi(5, 8);
        System.out.println("Wynik dzielenia:" + division);
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
