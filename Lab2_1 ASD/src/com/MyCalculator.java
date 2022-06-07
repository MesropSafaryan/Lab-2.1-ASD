package com;

public class MyCalculator {
    public MyCalculator() {
    }
    private static double f(double x) {
        return Math.sqrt(6 * x + 5);
    }
    public double simpsonsMethod(double a, double b, double step) {
        int n = (int) ((b - a) / step);
        double sum = f(b) + f(a);
        double subSum = 0;
        double x;
        for (int i = 1; i < n; i += 2) {
            x = a + step * i;
            subSum += Math.sqrt(6 * x + 5);
        }
        subSum *= 4;
        sum += subSum;
        subSum = 0;

        for (int i = 2; i < n - 1; i += 2) {
            x = a + step * i;
            subSum += f(x);
        }

        subSum *= 2;
        sum += subSum;
        return sum * step / 3;

    }
    public double trapezoidMethod(double a, double b, double step) {
        double sum = (f(b) + f(a)) / 2;
        int n = (int) ((b - a) / step);
        double current;//x
        for (int i = 1; i < n; i++) {
            current = a + step * i;
            sum += f(current);
        }
        return sum * step;
    }
    public double rectangleMethodM(double a, double b, double step) {
        double sum = 0.0;
        double x = a + step / 2;
        int n = (int) ((b - a) / step);
        for (int i = 0; i < n; i++) {
            sum += f(x + i * step);
        }
        return sum * step;
    }
    public double rectangleMethodL(double a, double b, double step) {
        double sum = 0.0;
        double x = a;
        int n = (int) ((b - a) / step);
        for (int i = 0; i < n; i++) {
            sum += f(x + i * step);
        }
        return sum * step;

    }
    public double rectangleMethodR(double a, double b, double step) {
        double sum = 0.0;
        double x = a;
        int n = (int) ((b - a) / step);
        for (int i = 1; i <= n; i++) {
            sum += f(x + i * step);
        }
        return sum * step;
    }
}

