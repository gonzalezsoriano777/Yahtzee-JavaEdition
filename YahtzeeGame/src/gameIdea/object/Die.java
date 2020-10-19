package gameIdea.object;

import java.util.Random;

public class Die {
	
	private int diceSides = 5;
	private int diceValue;
	
	// Randomizer for value of dice
	private Random randomizer = new Random();
	
	// rolls dice and 
	public Die(int diceSides) {
		
		this.diceSides = diceSides;
		this.diceValue = (randomizer.nextInt(diceSides) + 1);
		
	}

}
