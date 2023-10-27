import java.util.Scanner;

public class positiveOrNegative {
    public static void main(String [] args){
        //Write a program that reads an unspecified number of integers,
        int positiveCount = 0;
        int negativeCount = 0;
        while(true){
            Scanner inputLine = new Scanner(System.in);
            System.out.println("Enter an integer: ");
            int integer = inputLine.nextInt();
            // determines how many positive and negative values have been read,
            if(integer > 0){
                positiveCount++;
            }else if(integer < 0){
                negativeCount++;
            }
            // and computes the total and average of the input values (not counting zeros).
            // Your program ends with the input 0 .
            if(integer == 0) {
                System.out.println(positiveCount);
                System.out.println(negativeCount);
                System.out.println(positiveCount + negativeCount);
            }
        }
    }
}
