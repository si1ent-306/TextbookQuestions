import java.util.Scanner;

public class highestScore {
    public static void main(String[] args) {
        //Write a program that prompts the user to enter the number of students
        Scanner inputLine = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudents = inputLine.nextInt();
        int highestScore = 0;
        // and each student’s name and score
        for(int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter the name of a student: ");
            String name = inputLine.next();
            System.out.println("Enter the score: ");
            int score = inputLine.nextInt();
            // and finally displays the name of the student with the highest score.
            highestScore = Math.max(highestScore, score);
        }
        System.out.println("The highest score is " + highestScore);

    }
}
