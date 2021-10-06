package sankeandladder;

import java.util.Random;

public class SnakeAndLadder {
	 public static void main(String[] args) {
	        System.out.println("Welcome to Snake and Ladder Game");
	        int startPosition = 0;
	        Random random = new Random();
	        int diceNumber = random.nextInt(6)+1;
	        System.out.println("Dice Number : " + diceNumber);
}
}
