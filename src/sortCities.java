import java.util.Arrays;
import java.util.Scanner;

public class sortCities {
   public static void main(String[] args) {
       //Write a program that prompts the user to enter three cities
       System.out.println("Enter 3 cities: ");
       Scanner inputLine = new Scanner(System.in);
       String city1 = inputLine.next();
       String city2 = inputLine.next();
       String city3 = inputLine.next();
       String [] cityArray = {city1, city2, city3};
       //Sort by alphabet
       Arrays.sort(cityArray);
       for (int i = 0; i < cityArray.length; i++) {
           System.out.print(cityArray[i] + " ");
       }

   }
}
