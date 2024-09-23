package Opgaver;

import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        int studentAge = 15;
        double studentGPA = 3.45;
        char studentFirstInitial = 'H';
        char studentLastInitial = 'I';
        Boolean hasPerfectAttendance = true;
        String studentName = "Hamza Iqbal";
        String studentFirstName = "Hamza";
        String studentLastName = "Iqbal";



        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);
        System.out.println("What do you want to update it to?");
        Scanner input = new Scanner (System.in);
        studentGPA = input.nextDouble();
        System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of " + studentGPA);




    }
}

