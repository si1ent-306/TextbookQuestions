import java.util.Scanner;

public class reverseString {
    public static void main(String[] args){
        //Write a program that prompts the user to enter a string
        Scanner inputLine = new Scanner(System.in);
        System.out.println("Enter a string: ");
        char[] string = inputLine.nextLine().toCharArray();
        // and displays the string in reverse order.
        for(int i = string.length-1; i >= 0; i--){
            System.out.print(string[i]);
        }
    }
}
