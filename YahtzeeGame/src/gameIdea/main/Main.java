package gameIdea.main;

import java.util.Random;

import gameIdea.object.Die;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die dice = new Die();
		Random rand = new Random();
		dice.Roll(rand);
		System.out.println(dice.getValue()); 
		dice.Roll(rand);
		System.out.println(dice.getValue());
		dice.Roll(rand);
		System.out.println(dice.getValue()); 

	}

}
