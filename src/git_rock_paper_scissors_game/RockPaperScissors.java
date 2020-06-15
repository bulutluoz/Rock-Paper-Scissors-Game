package git_rock_paper_scissors_game;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	static int result = 0 ;
	public static void main(String[] args) {
		// Plays Rock Paper Scissors with user 
		// who ones reaches five win the game
		
		int userScore = 0;
		int computerScore = 0;
		int choise=0;
		
		
		while (userScore<5 && computerScore<5) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your choise ");
		System.out.println("1 Rock  === 2 Paper  === 3 Scissors");

		choise = scan.nextInt();
		
		if (choise>0 && choise<4) {
			
			game(choise);
			
		}else System.out.println("It is not a valid choise"); // end of if - else statement
		
		System.out.println("******************");		
		if (result==3) {
			computerScore++;
			System.out.println("I won");
		} else if (result==2) {
			userScore++;
			System.out.println("You won");
		} else System.out.println("No one won");
		 System.out.println("====================");
		 System.out.println("Computer is  : " + computerScore);
		 System.out.println("User is  : " + userScore);
		 System.out.println("====================");
		 if(computerScore !=5 && userScore!=5) {
			 System.out.println("Lets play again"); 
		 } else System.out.println("GAME OVER");
		 
		}			// end of while loop
		
		
		
	}				// end of main method
	

	public static int game(int choise) { // in main method we send our choise as parimeter
										 // to method and in the method we decide who is winner
										 //every single game
		result=0;
		Random r = new Random();			
		int num = r.nextInt();	
		
		if (num<0) {
			num=-num;
		}
		
		num=num%3; // gives us 0,1,2 
				   // let's accept 0=rock , 1=paper , 2 = scissors
		
		switch(num) {
			case 0:
				if (choise==1) {
					result=1;	// result 1 means no one is winner
				}else if (choise==2) {
					result=2;	// result 2 means user is winner
				}else result=3;	// result 3 means computer is winner
				break;
			case 1:
				if (choise==1) {
					result=3;	
				}else if (choise==2) {
					result=1;	
				}else result=2;	
				break;
			case 2:
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
