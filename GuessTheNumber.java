import java.util.Scanner;

public class GuessTheNumber{
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
