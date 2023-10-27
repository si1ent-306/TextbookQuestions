import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args){
        //Write a program that plays the popular scissor–rock–paper game.
        // (A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.)

        // The program randomly generates a number 0,1,2 representing scissor, rock, and paper.
        int comNumber = (int)(Math.random()*2);
        // The program prompts the user to enter a number 0,1,2
        System.out.println("Enter Rock(0) Paper (1) or scissor (2)");
        Scanner inputLine = new Scanner(System.in);
        int playerNumber = inputLine.nextInt();
        System.out.println(playerNumber + " " + comNumber);
        int winCounter = 0;
        // and displays a message indicating whether the user or the computer wins, loses, or draws.

            if (playerNumber > -1 && playerNumber < 3) {
                if (comNumber == playerNumber) {
                    System.out.println("Draw");
                } else if (playerNumber == 1 && comNumber == 0) {
                    System.out.println("You Win");
                    winCounter++;
                } else if (playerNumber == 1 && comNumber == 2) {
                    System.out.println("You Lose");
                } else if (playerNumber == 2 && comNumber == 0) {
                    System.out.println("You Lose");
                } else if (playerNumber == 2 && comNumber == 1) {
                    System.out.println("You Win");
                    winCounter++;
                } else if (playerNumber == 0 && comNumber == 1) {
                    System.out.println("You Lose");
                } else if (playerNumber == 0 && comNumber == 2) {
                    System.out.println("You Win");
                    winCounter++;
                }
            } else {
                System.out.println("Enter a number between 0-2");
            }
    }
}
