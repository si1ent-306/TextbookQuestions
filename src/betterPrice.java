import java.util.Scanner;

public class betterPrice {
    public static void main(String[] args){
        //Suppose you shop for rice in two different packages. You would like to write a program to compare the cost.
        // The program prompts the user to enter the weight and price of each package
        System.out.println("Enter the weight and price of package 1: ");
        Scanner inputLine = new Scanner(System.in);
        double weight1 = inputLine.nextDouble();
        double price1 = inputLine.nextDouble();
        System.out.println("Enter the weight and price of package 2: ");
        double weight2 = inputLine.nextDouble();
        double price2 = inputLine.nextDouble();
        // displays the one with the better price
        price1 /= weight1;
        price2 /= weight2;
        if(price1 < price2){
            System.out.println("Package 1 is better value");
        }else if(price1 > price2){
            System.out.println("Package 2 is better value");
        }else if(price1 == price2){
            System.out.println("It is the same value");
        }
    }
}
