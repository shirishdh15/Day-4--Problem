package Day4;

import java.util.Scanner;

public class SnakeLadder {
    public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    int player1Position = 0;
    int player2Position = 0;
    int die;
    int option;
    int player1DieCount = 0;
    int player2DieCount = 0;
    boolean gameWon = false;
    String winner = "";

    while (!gameWon) {
        System.out.println("Player 1 turn.");
        die = (int) (Math.random() * 6) + 1;
        System.out.println("Die Roll: " + die);
        player1DieCount++;
        option = (int) (Math.random() * 3) + 1;
        switch (option) {
            case 1:
                System.out.println("No play. Stay in the same position.");
                break;
            case 2:
                player1Position += die;
                if (player1Position > 100) {
                    player1Position = 100;
                }
                System.out.println("Ladder. Move ahead by " + die + " positions.");
                break;
            case 3:
                player1Position -= die;
                if (player1Position < 0) {
                    player1Position = 0;
                }
                System.out.println("Snake. Move behind by " + die + " positions.");
                break;
        }
        System.out.println("Player 1 current position: " + player1Position);

        if (player1Position == 100) {
            gameWon = true;
            winner = "Player 1";
            break;
        }
        System.out.println("Player 2 turn.");
        die = (int) (Math.random() * 6) + 1;
        System.out.println("Die Roll: " + die);
        player2DieCount++;
        option = (int) (Math.random() * 3) + 1;
        switch (option) {
            case 1:
                System.out.println("No play. Stay in the same position.");
                break;
            case 2:
                player2Position += die;
                if (player2Position > 100) {
                    player2Position = 100;
                }
                System.out.println("Ladder. Move ahead by " + die + " positions.");
                break;
            case 3:
                player2Position -= die;
                if (player2Position < 0) {
                    player2Position = 0;
                }
                System.out.println("Snake. Move behind by " + die + " positions.");
                break;
        }
        System.out.println("Player 2 current position: " + player2Position);

        if (player2Position == 100) {
            gameWon = true;
            winner = "Player 2";
            break;
        }
    }

    System.out.println(winner + " won the game!");
    System.out.println("Player 1 die count: " + player1DieCount);
}
}