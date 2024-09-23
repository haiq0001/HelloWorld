package FunctionsInJava;
import java.util.Scanner;
public class TeaTime {

    public static void announceTeaTime() {
        System.out.println("Waiting for tea time...");
        System.out.print("Type in random word and press Enter: ");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's tea time!");

    }

    public static void main(String[] args) {
        announceTeaTime();

    }
}



