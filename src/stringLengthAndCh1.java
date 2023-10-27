import java.util.Scanner;

public class stringLengthAndCh1 {
    public static void main(String[] args){
        // Write a program that prompts the user to enter a string
        Scanner inputLine = new Scanner(System.in);
        System.out.print("Enter a string to test: ");
        String string = inputLine.nextLine().replace(" ", "");
        // and displays its length
        int length = string.length();
        // and its first character.
        char firstChar = string.charAt(0);
        System.out.println(length + " " + firstChar);
    }
}
