package gameIdea.object;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hand {

	public List<Die> dice = new ArrayList<>();
	private int numberOfDice = 5;
	private int sides = 6;

	public Hand(int sides, int numberOfDice) {
		this.numberOfDice = numberOfDice;
		generateDice(sides);
	}

	// Hand methods consisting of initializing both the dice ( /# of dices ) and
	// roll of each dice

	public void generateDice() {
		for (int count = 0; count < numberOfDice; count++) {
			dice.add(new Die());
		}
	}

	public void generateDice(int sides) {
		for (int count = 0; count < numberOfDice; count++) {
			dice.add(new Die(sides));
		}
	}
	
	public void roll(Random random) {
		for(var die : dice) {
			die.Roll(random);
		}
	}
	
	public void roll(List<Integer> diceNumber, Random random) {
		for(int diceNum : diceNumber) {
			var die = dice.get(diceNum - 1);
			die.Roll(random);
		}
	}

}
