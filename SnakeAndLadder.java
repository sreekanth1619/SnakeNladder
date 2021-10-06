package sankeandladder;

public class SnakeAndLadder {
	 public static final int WINNING_POSITION = 100;
	    public static final int IS_LADDER = 2;
	    public static final int IS_SNAKE = 1;
	    public static final int IS_NO_PLAY = 0;

	    static int diceCount = 0;
	    static String turn = "player1";

	    public static void main(String[] args) {

	        int playerPosition1 = 0;
	        int playerPosition2 = 0;
	        int diceCount1 = 0;
	        int diceCount2 = 0;

	        while (playerPosition1 < WINNING_POSITION && playerPosition2 < WINNING_POSITION) {
	            ++diceCount;
	            if (turn.equals("player1")) {
	                turn = "player2";
	                ++diceCount1;
	                playerPosition1 = getPosition(playerPosition1);
	            } else {
	                ++diceCount2;
	                turn = "player1";
	                playerPosition2 = getPosition(playerPosition2);
	            }
	        }

	        if (playerPosition1 == WINNING_POSITION) {
	            System.out.println("Player1 win the game");
	            System.out.println("dice count " + diceCount1);
	        } else {
	            System.out.println("Player2 win the game");
	            System.out.println("dice count " + diceCount2);
	        }
	        System.out.println("Total dice count " + diceCount);

	        System.out.println("player1Position " + playerPosition1);
	        System.out.println("player2Position " + playerPosition2);

	    }
	    public static int getPosition(int position) {
	        int diceNumber = (int) (Math.floor(Math.random() * 10) % 6 + 1);
	        int option = (int) (Math.floor(Math.random() * 10) % 3);
	        if (option == IS_SNAKE) {
	            System.out.println("Snake for the player");
	            if (position - diceNumber > 0) {
	                position -= diceNumber;
	            }
	        } else if (option == IS_LADDER) {
	            System.out.println("Ladder for the player");
	            if (turn.equals("player1")) {
	                turn = "player1";
	            } else if (turn.equals("player2")) {
	                turn = "player2";
	            }
	            if (position + diceNumber <= 100) {
	                position += diceNumber;
	            }
	        } else {
	            System.out.println("No play for the player");
	        }
	        return position;
	    }
}
