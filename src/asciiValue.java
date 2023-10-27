import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class asciiValue {
    public static void main(String[] args){
        //Write a program that receives an ASCII code (an integer between 0 and 127)
        System.out.println("Enter an integer to dislpay as a charecter(0-127): ");
        Scanner inputLine = new Scanner(System.in);
        int integer = inputLine.nextInt();
        // and displays its character
        System.out.println((char)integer);
    }
}
