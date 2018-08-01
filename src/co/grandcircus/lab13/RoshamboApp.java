package co.grandcircus.lab13;

//Amna Anjum 


import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//Create user as a human player
		String humanName = Validator.getString(scnr,"Enter your name: ");
		HumanPlayer human = new HumanPlayer(humanName, scnr); 
		System.out.println("Hello " + humanName + "!");
		
		Player challenger;
		
		//select opponent aka challenger
		int opponent = Validator.getInt(scnr, "Select opponent (1 or 2): ", 1, 2);
		if (opponent == 1) {
			
			//duplicate variable error  is issue with declaring variable name 
			challenger = new RandomPlayer("Randy");
			System.out.println("You are playing Randy");
			System.out.println();
		} else {
			challenger = new RockPlayer("Rocky"); 
			System.out.println("You are playing Rocky");
			System.out.println();
		}
		
		
	//loop structure
		String cont = "y";
		
		do {
			
			playTheGame(human, challenger);
			
			cont = Validator.getString(scnr, "Play again? y/n?");
		} while (cont.matches("[yY],*"));
		System.out.println("Goodbye!");
		
//		HumanPlayer human = new HumanPlayer(name, scnr);
//		System.out.println(human.generateRoshambo());
//		
//		RockPlayer computerPlayer = new RockPlayer ("Dwayne");	
//		Roshambo playerChoice = computerPlayer.generateRoshambo();
//		System.out.println(playerChoice);
		
		
scnr.close();
	}

	private static void playTheGame(HumanPlayer human, Player challenger) {
		Roshambo input = human.generateRoshambo();
		
		Roshambo computerOutput = challenger.generateRoshambo();
		
		
		System.out.println(input);
		
		System.out.println(computerOutput);
		System.out.println();
		System.out.println("Who one?");
		whoWon(human.getName(), input, computerOutput);
		
		
		if (input == Roshambo.ROCK && computerOutput == Roshambo.SCISSORS) {
			System.out.println(human.getName() + "won!");
		}
	//modifiers return type
		
		//do it in a seperate method
		//win, draw, loose
		//draw: if input == output
		//win R && 2, S&&P, P&&R you won human.getname
	}

	private static void whoWon(String name, Roshambo input, Roshambo computerOutput) {
		// TODO Auto-generated method stub
		if (input == Roshambo.ROCK && computerOutput == Roshambo.SCISSORS) {
			System.out.println(name + " won!");
			System.out.println();
		} else if (input == computerOutput) {
			System.out.println();
			System.out.println("It's a draw! You both win! ");
			System.out.println();
		} else {
			System.out.println(" won!");
			System.out.println();
		}
	}

}
