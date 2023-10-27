import java.util.Scanner;

public class vowelOrConstanent {
    public static void main(String[] args) {
        //Write a program that prompts the user to enter a letter
        System.out.println("Enter a letter: ");
        Scanner inputLine = new Scanner(System.in);
        char letter = inputLine.nextLine().charAt(0);
        // and check whether the letter is a vowel or consonant.
        if(letter >= 'a' && letter <= 'z' || letter >= 'A' && letter <= 'Z') {
            if (letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E' || letter == 'i' || letter == 'I' || letter == 'o' || letter == 'O' || letter == 'u' || letter == 'U') {
                System.out.println(letter + " is a vowel");
            }else{
                System.out.println(letter + " is not a vowel");
            }
        }else{
            // For a nonletter input, display invalid input
            System.out.println(letter + " is not a letter");
        }

    }
}
