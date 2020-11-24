package gameIdea.main;

import java.util.Random;

import gameIdea.object.Die;
import gameIdea.object.Hand;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		//Die die = new Die();
		Hand myHand = new Hand(6, 5);
		myHand.roll(rand);
		System.out.println(myHand);
		myHand.roll(rand);
		System.out.println(myHand);
		myHand.roll(rand);
		System.out.println(myHand);
	}

}
