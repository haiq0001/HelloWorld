package Loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean isOnRepeat = true;


    while (isOnRepeat) {

        System.out.println("PlayingCurrentSong");
        System.out.print("Would you like to take the song off repeat? ");
        String input = scanner.next();
        if ("yes".equals(input)) {
            isOnRepeat = false;
        }
    }
    System.out.println("Playing next song");
    }
}
