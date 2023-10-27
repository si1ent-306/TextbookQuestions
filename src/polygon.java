import java.util.Scanner;

public class polygon {
    public static void main(String[] args){
        //A regular polygon is an n-sided polygon in which all sides are of the same length and all angles have the same degree
        // (i.e., the polygon is both equilateral and equiangular).
        //Here, s is the length of a side. Area =  (n * s^2)/ 4 * tan(pie/n)
        // Write a program that prompts the user to enter the number of sides and their length of a regular polygon
        Scanner inputLine = new Scanner(System.in);
        System.out.println("Enter a number of sides: ");
        double sides = inputLine.nextDouble();
        System.out.println("Enter a length of side");
        double length = inputLine.nextDouble();
        final double PI = 3.14159;
        // and displays its area.
        double area = (sides * Math.pow(length , 2))/ (4 * Math.tan(PI/sides));
        System.out.println("The area is " + area);
    }
}
