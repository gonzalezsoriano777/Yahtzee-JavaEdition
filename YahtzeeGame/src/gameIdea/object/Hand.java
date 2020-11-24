package gameIdea.object;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	
	public List<Die> dice = new ArrayList<>();
	private int numberOfDice = 5; 
	private int sides = 6;
	
	public Hand(int sides, int numberOfDice) {
		this.numberOfDice = numberOfDice;
		this.sides = sides;
	}
	
	public void generateDice() {
		for(int count = 0; count < numberOfDice; count++) {
			dice.add(new Die());
		}
	}

}
