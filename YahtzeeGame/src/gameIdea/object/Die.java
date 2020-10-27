package gameIdea.object;

import java.util.Random;

public class Die {
	
	private int diceSides;
	private int diceValue;
	
	// Randomizer for value of dice
	private Random randomizer = new Random();
	
	
//	public Die(int diceSides) {
//		this.diceSides = diceSides;
//	}
	
	public Die(int diceSides, int diceValue) {
		this.diceSides = diceSides;
		this.setDiceValue(diceValue);
	}
	
	public void Roll() {
		this.setDiceValue(randomizer.nextInt(diceSides) + 1);
	}
	 public int getDiceValue() {
		 return diceValue;
	 }
	
	public void setDiceValue(int diceValue) {
		this.diceValue = diceValue;
	}

}
