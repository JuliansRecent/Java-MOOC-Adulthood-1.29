
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // Prompt the user for their age
        System.out.println("How old are you?");
        int userAge = Integer.valueOf(scanner.nextLine());

        if (userAge >= 18) {
            // If they are 18 or older, print "You are an adult."
            System.out.println("You are an adult.");
        } else {
            // If they are younger, print "You are not an adult."
            System.out.println("You are not an adult.");
        }
    }
}
