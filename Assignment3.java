import java.util.Scanner;

class Assignment3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Ask the user how many games they want to play
        System.out.print("How many games would you like to play? ");
        int gamesToPlay = kb.nextInt();
        kb.nextLine();

        // Keep track of the scores
        int playerWins = 0, computerWins = 0, ties = 0;

        for (int i = 1; i <= gamesToPlay; i++) {
            // Get the player's choice
            System.out.print("Game " + i + ": Enter r (rock), p (paper), or s (scissors): ");
            char playerChoice = kb.nextLine().trim().toLowerCase().charAt(0);

            // Computer randomly chooses rock, paper, or scissors
            int computerNum = (int) (Math.random() * 3); // 0, 1, or 2
            char computerChoice = 'r'; // Set as rock
            if (computerNum == 1) {
                computerChoice = 'p'; // Set as paper
            } else if (computerNum == 2) {
                computerChoice = 's'; // Set as scissors
            }

            System.out.println("Computer chose: " + computerChoice);

            // Find and output the winner
            if (playerChoice == computerChoice) {
                System.out.println("It's a tie!");
                ties++;
            } else if ((playerChoice == 'r' && computerChoice == 's') ||
                       (playerChoice == 'p' && computerChoice == 'r') ||
                       (playerChoice == 's' && computerChoice == 'p')) {
                System.out.println("You win!");
                playerWins++;
            } else if ((playerChoice == 'r' || playerChoice == 'p' || playerChoice == 's')) {
                System.out.println("Computer wins!");
                computerWins++;
            } else {
                System.out.println("Invalid input. Please choose r, p, or s.");
            }
        }

        // Print the final scores
        System.out.println("\nFinal Results:");
        System.out.println("Player wins: " + playerWins);
        System.out.println("Computer wins: " + computerWins);
        System.out.println("Ties: " + ties);
    }
}
