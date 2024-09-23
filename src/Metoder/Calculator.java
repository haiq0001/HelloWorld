package Metoder;

public class Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition of two integers: 5 + 10 = " + calc.add(5, 10));
        System.out.println("Addition of two doubles: 3.5 + 4.7 = " + calc.add(3.5, 4.7));
        System.out.println("Addition of three integers: 1 + 2 + 3 = " + calc.add(1, 2, 3));
        System.out.println("Multiplication of two integers: 5 * 6 = " + calc.multiply(5, 6));
        System.out.println("Multiplication of two doubles: 3.5 * 2.0 = " + calc.multiply(3.5, 2.0));
        System.out.println("Division of integers: 10 / 2 = " + calc.divide(10, 2));

    }

    public double add(double a, double b) {
        return a + b;

    }

    public int add(int a, int b) {
        return a + b;

    }

    public int add(int a, int b, int c) {
        return a + b + c;

    }

    public int multiply(int a, int b) {
        return a * b;

    }

    public double multiply(double a, double b) {
        return a * b;

    }

    public double divide(int a, int b) {
        return a / b;

    }
}



