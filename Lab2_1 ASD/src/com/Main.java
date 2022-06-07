package com;

public class Main {

    public static void main(String[] args) {
        MyCalculator calc = new MyCalculator();
        System.out.println("Результат за методом Сімпосона: " + calc.simpsonsMethod(0, 10, 0.2));
        System.out.println("Результат за методом Трапецій: " + calc.trapezoidMethod(0, 10, 0.2));
        System.out.println("Результат за методом прямокутників (центральний): " + calc.rectangleMethodM(0, 10, 0.2));
        System.out.println("Результат за методом прямокутників (лівий): " + calc.rectangleMethodL(0, 10, 0.2));
        System.out.println("Результат за методом прямокутників (правий): " + calc.rectangleMethodR(0, 10, 0.2));
    }
}

