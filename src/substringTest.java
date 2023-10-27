import java.util.Scanner;

public class substringTest {
    public static void main(String[] args){
        // Write a program that prompts the user to enter two strings,
        Scanner inputLine = new Scanner(System.in);
        System.out.println("Enter 2 Strings: ");
        String string1 = inputLine.nextLine().toLowerCase();
        String string2 = inputLine.nextLine().toLowerCase();

        // and reports whether the second string is a substring of the first string.
        if(string1.contains(string2)){
            System.out.println("The first string contains the second");
        }else{
            System.out.println("The first string doesnt contain the second");
        }
    }
}
