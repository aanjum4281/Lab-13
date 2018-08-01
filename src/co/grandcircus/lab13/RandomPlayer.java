package co.grandcircus.lab13;



public class RandomPlayer extends Player{

	public RandomPlayer(String name) {
		super (name);
	}

	@Override
	public Roshambo generateRoshambo() {
		// TODO Auto-generated method stub
		int rIndex = (int) (Math.random() * 3);
		
		return Roshambo.values()[rIndex];
		
//		switch (random) {
//		case 1:
//			return Roshambo.ROCK;
//		case 2:
//			return Roshambo.PAPER;
//		case 3:
//			return Roshambo.SCISSORS;
//		}
//		return null;
	}
	
}
