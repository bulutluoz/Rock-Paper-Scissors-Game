package git_rock_paper_scissors_game;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	static int result = 0;
	static int choise = 0;

	public static void main(String[] args) {
		// Plays Rock Paper Scissors with user
		// which one reaches 5, wins the game

		int userScore = 0;
		int computerScore = 0;

		System.out.println("Welcome to our Game World");
		do {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("1 Rock  === 2 Paper  === 3 Scissors");
			System.out.println("Enter your choise ");

			choise = scan.nextInt();
			if (choise > 0 && choise < 4) {
				System.out.println("**********************");
				game(choise); // sends game method for gaming
				
			// it returns with result (1- there is no winner , 2- user wins , 3- comp wins)
				
				switch(result) {
				case 1:
					System.out.println("There is no winner");
					break;
				case 2:
					System.out.println("****** USER WINS******");
					userScore++;
					break;
				case 3:
					System.out.println("****** COMP WINS******");
					computerScore++;
					break;
				}
				System.out.println("USER Score   : " + userScore);	
				System.out.println("COMP Score   : " + computerScore);
				System.out.println("**********************");

			} else
				System.out.println("It is not a valid choise"); // end of if - else statement

		} while (userScore < 5 && computerScore < 5);
			
			System.out.println("     GAME OVER   ");

	} // end of main method

	public static int game(int choise) { // in main method we send user's choice as parameter
											// to game method and in the method we decide who is winner for
											// every single game
		result = 0;

		int num = new Random().nextInt(3); // gives us 0,1,2
		num++;  // we added to num 1 and did it same with user's choise. 1,2,3 ... 1=rock , 2=paper , 3 = scissors

		switch (num) {
		case 1:
			System.out.println("Comp : ROCK");
			if (choise == 1) {
				System.out.println("User : ROCK ");
				result = 1; // result 1 means no one is winner
				break;
			} else if (choise == 2) {
				System.out.println("User : PAPER ");
				result = 2; // result 2 means user is winner
				break;
			} else
				System.out.println("User : SCISSORS ");
				result = 3; // result 3 means computer is winner
				break;
		case 2:
			System.out.println("Comp : PAPER");
			if (choise == 1) {
				System.out.println("User : ROCK ");
				result = 3;
				break;
			} else if (choise == 2) {
				System.out.println("User : PAPER ");
				result = 1;
				break;
			} else
				System.out.println("User : SCISSORS ");
				result = 2;
				break;
		case 3:
			System.out.println("Comp : SCISSORS");
			if (choise == 1) {
				System.out.println("User : ROCK ");
				result = 2;
				break;
			} else if (choise == 2) {
				System.out.println("User : PAPER ");
				result = 3;
				break;
			} else
				System.out.println("User : SCISSORS ");
				result = 1;
				break;
		}

		return result;
	}

}
