package git_rock_paper_scissors_game;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	static int result = 0 ;
	public static void main(String[] args) {
		// Plays Rock Paper Scissors with user 
		// which one reaches five, wins the game
		
		int userScore = 0;
		int computerScore = 0;
		int choise=0;
		System.out.println("Welcome to our Game World");
		
		while (userScore<5 && computerScore<5) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your choise ");
		System.out.println("1 Rock  === 2 Paper  === 3 Scissors");

		choise = scan.nextInt();
		
		if (choise>0 && choise<4) {
			
			game(choise);  // sends game method for gaming
			
		}else System.out.println("It is not a valid choise"); // end of if - else statement
		
		System.out.println("******************");	// return from game method with result
													// 1: No one won   2: User won  3: Computer won
		if (result==3) {
			computerScore++;
			System.out.println("I won");
		} else if (result==2) {
			userScore++;
			System.out.println("You won");
		} else System.out.println("No one won");
		 System.out.println("********************");// prints scores and if someone reach five finishes game
		 											// otherwise game starts again
		 System.out.println("Computer is  : " + computerScore);
		 System.out.println("User is  : " + userScore);
		 System.out.println("====================");
		 if(computerScore !=5 && userScore!=5) {
			 System.out.println("Lets play again");
			 System.out.println("==================");
		 } else System.out.println("GAME OVER");
		 
		}			// end of while loop
		
	}				// end of main method
	

	public static int game(int choise) { // in main method we send user's choice as parameter
										 // to game method and in the method we decide who is winner for
										 //every single game
		result=0;
		Random r = new Random();			
		int num = r.nextInt();	
		
		if (num<0) {
			num=-num;
		}
		
		num=1 + num%3; // gives us 1,2,3 
				   // let's accept 1=rock , 2=paper , 3 = scissors
		
		switch(num) {
			case 1:
				if (choise==1) {
					result=1;	// result 1 means no one is winner
				}else if (choise==2) {
					result=2;	// result 2 means user is winner
				}else result=3;	// result 3 means computer is winner
				break;
			case 2:
				if (choise==1) {
					result=3;	
				}else if (choise==2) {
					result=1;	
				}else result=2;	
				break;
			case 3:
				if (choise==1) {
					result=2;	
				}else if (choise==2) {
					result=3;	
				}else result=1;	
				break;				
		}
	
		return result;	
	}
		
}
