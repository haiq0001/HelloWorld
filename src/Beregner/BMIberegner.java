package Beregner;

import java.util.Scanner;
public class BMIberegner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Beregn dit BMI");

        System.out.print("Indtast din vægt i kilo:");
        double vægt = input.nextDouble();

        System.out.print("Indtast din højde i meter:");
        double højde = input.nextDouble();

        double bmi = vægt / (højde * højde);
        System.out.println("Dit BMI tal er: " + bmi);

        










    }
}
