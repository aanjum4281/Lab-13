package co.grandcircus.lab13;

public abstract class Player {

	private String name;
	
	//constructor
	//have no return type and have same name as class
	public Player(String name) {
		this.name = name;
	}
	
	//getter
	public String getName() {
		return name;
	}
	
	//returns rock, paper, or scissors
	abstract public Roshambo generateRoshambo();
	
	public String toString() {
		return "Player" + name;
	}
}
