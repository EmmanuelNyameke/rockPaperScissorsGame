import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args){
        // Creating instances of the imported classes
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Create an array of choices
        String[] choices = {"rock", "paper", "scissors"};

        // Game intro
        System.out.println("------------------------------------------------------");
        System.out.println("   Welcome to ROCK-PAPER-SCISSORS GAME!");
        System.out.println("-------------------------------------------------------");
        System.out.print("Enter your choice (rock, paper, scissors): ");


        // Receive input and convert to lowercase characters
        String userChoice = scanner.next().toLowerCase();
        System.out.println("-------------------------------------------------------");

        // Generate computer choice
        int randomIndex;
        randomIndex = random.nextInt(choices.length);
        String computerChoice = choices[randomIndex];
        // Output computer choice
        System.out.println("Computer chose: " + computerChoice);
        // Find the winning side
        if(userChoice.equals(computerChoice)){
            System.out.println("It's a tie");
        } else if((userChoice.equals("rock") && computerChoice.equals("scissors")) || (userChoice.equals("paper") && computerChoice.equals("rock"))
                || (userChoice.equals("scissors") && computerChoice.equals("paper"))
        ){
            System.out.println("Congratulations! You won");
        } else{
            System.out.println("Oops! You lost");
        }
        scanner.close();
    }

}
