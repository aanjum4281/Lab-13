package co.grandcircus.lab13;

public class RockPlayer extends Player {
//constructor
	public RockPlayer(String name) {
		super(name);
	}
	
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}
	
}
