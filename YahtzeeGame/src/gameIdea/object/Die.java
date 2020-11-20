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
	
	// able to roll a dice of six sides
	public void Roll(Random rand) {
		int numRolled = rand.nextInt(diceSides) + 1;
		diceValue = numRolled;
	}
	
	public int getValue() {
		if(diceValue == 0) {
			System.out.println("Dice has not been rolled-- Dice not correctly rolled");
			return diceValue;
		} else {
			return diceValue;
		}
	}

}
