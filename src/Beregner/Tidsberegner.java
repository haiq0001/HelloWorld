package Beregner;

import java.util.Scanner;
public class Tidsberegner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hvor mange timer er der gået siden midnat?");
        int timer = input.nextInt();
        System.out.println("Hvor mange minutter er der gået siden midnat?");
        int minutter = input.nextInt();
        System.out.println("Hvor mange sekunder er der gået siden midnat?");
        int sekunder = input.nextInt();
        System.out.println("Hvor lang tid er der gået siden midnat?");
        System.out.println("Der er gået " + ((timer * 3600) + (minutter * 60) + sekunder) + " sekunder");

    }
}


