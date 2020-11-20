package gameIdea.object;

import java.util.Random;

public class Die {

	private int diceSides = 6;
	private int diceValue = 0;

	public Die() {
	}

	public Die(int dicesides) {
		this.diceSides = dicesides;
	}

	// able to roll a dice of six sides.. 1 - 6
	public void Roll(Random rand) {
		int numRolled = rand.nextInt(diceSides) + 1;
		diceValue = numRolled;
	}

	
	public int getValue() {
		if (diceValue == 0) {
			System.out.println("Dice has not been rolled-- Dice not correctly rolled");
			return diceValue;
		}
		
		return diceValue;
	}

}
