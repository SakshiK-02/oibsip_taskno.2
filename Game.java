import java.util.Scanner;
import java.util.Random;

public class Game {
	int systemInput;
	int userInput;
	int noOfGuesses=0;
	
	Game()
	{
		Random random=new Random();
		this.systemInput=random.nextInt(100)+1;
	}
	
	public boolean takeUserInput() {
		if(noOfGuesses < 10) {
			System.out.print("Guess the number: ");
			this.userInput = Game.takeIntegerINput(100);
			noOfGuesses++;
			return false;
		}else {
			System.out.println("Number of attempts finished..better luck next time");
			return true;
	    }
	}
	
       private static int takeIntegerINput(int i) {
    	   int input=0;
   		boolean flag=false;
   		
   		while(!flag) {
   			try {
   				Scanner sc= new Scanner(System.in);
   				input =sc.nextInt();
   				flag=true;
   			}
   			
   			catch(Exception e)
   			{
   				System.out.println("Enter only integer values:");
   				flag=  false;
   			}
   		};
   		return input;
   	}


	public boolean isCorrectGuess() {
	if(systemInput==userInput) {
		System.out.println("Congratulations, you guess the number " + systemInput+" in "+noOfGuesses + " guesses");
		
		switch(noOfGuesses) {
		case 1:
		System.out.println("Your score is 100 ");
		break;
		case 2:
		System.out.println("Your score is 90 ");
		break;
		case 3:
		System.out.println("Your score is 80 ");
		break;
		case 4:
		System.out.println("Your score is 70 ");
		break;
		case 5:
		System.out.println("Your score is 60 ");
		break;
		case 6:
		System.out.println("Your score is 50 ");
		break;
		case 7:
		System.out.println("Your score is 40 ");
		break;
		case 8:
		System.out.println("Your score is 30 ");
		break;
		case 9:
		System.out.println("Your score is 20 ");
		break;
		case 10:
		System.out.println("Your score is 10 ");
		break;
		
		}
		System.out.println();
		return true;
	}
	else if (noOfGuesses < 10 && userInput > systemInput) {
		if(userInput - systemInput > 10) {
			System.out.println("Too high");
		}
		else {
			System.out.println("Little high");
		}
	}
	else if(noOfGuesses < 10 && userInput < systemInput) {
		if( systemInput - userInput > 10) {
			System.out.println("Too low");
		}
		else {
			System.out.println("Little low");
		}
	}
	
	return false;
 }

}

 /*   public class GuessTheNumber{
	public static int takeIntegerINput(int limit) {
		int input=0;
		boolean flag=false;
		
		while(!flag) {
			try {
				Scanner sc= new Scanner(System.in);
				input =sc.nextInt();
				flag=true;
			}
			
			catch(Exception e)
			{
				System.out.println("Enter only integer values:");
				flag=  false;
			}
		};
		return input;
	}
	
	public static void main(String args[])
			{
		System.out.println("1.Start the Game  \n2.Exit");
		System.out.println("Enter your choice: ");
		int choice=takeIntegerINput(2);
		int nextRound=1;
		int nextROund=0;
		
		if(choice == 1) {
			while(nextRound == 1) {
				Game game=new Game();
				boolean isMatched = false;
				boolean isLimitCross=false;
				int noOfRound = 0;
				System.out.println("\n Round "+ ++noOfRound + " starts..");
				
				while(!isMatched && !isLimitCross) {
					isLimitCross=game.takeUserInput();
					isMatched=game.isCorrectGuess();
				}
				
				System.out.println("1.Next Roundn 2.Exit");
				System.out.println("Enter your choice: ");
				nextRound=takeIntegerINput(2);
				if( nextRound != 1) {
					System.exit(0);
				}
			}
		}
			
	   else {
				System.exit(0);
			}
		}
		
}
*/