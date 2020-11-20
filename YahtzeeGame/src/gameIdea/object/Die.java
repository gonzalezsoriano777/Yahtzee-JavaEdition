package gameIdea.object;

import java.util.Random;

public class Die {

	private int diceSides = 6;
	private int diceValue = 0;

	public Die() {
	}

	public Die(int dicesides, int dicevalue) {
		this.diceSides = dicesides;
		this.diceValue = dicevalue;
	}
	
	// Once rolled it will randomize the value of the die from range of 1-6
	public void Roll(Random rand) {
		int numRolled = rand.nextInt(diceSides) + 1;
		diceValue = numRolled;
	}

}
