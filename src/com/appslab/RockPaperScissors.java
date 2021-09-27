package com.appslab;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner cs = new Scanner(System.in);

        System.out.println("Welcome in my game!!");
        System.out.println("Game named: Rock, Paper, Scissors.");
        System.out.println("--------");
        System.out.println("Rules of the game:");
        System.out.println("1. Only two players are needed.");
        System.out.println("2. Explain and demonstrate the rules of play");
        System.out.println("3. Enjoy the Game!!");
        System.out.println("--------");
        System.out.println("How to Play:");
        System.out.println("Partners say, “Roshambo” or “Rock Paper Scissors” together with their hands in a fist.\n" +
                "On “bo” or “paper,” players pick one of three things to show with their hand:\n" +
                "Rock which is demonstrated by a fist.\n" +
                "Scissors with two finger spread out to represent scissors. (This looks like a sideways peace sign.)\n" +
                "Paper by holding out a palm down, flat hand.\n" +
                "If players show the same things, they go again.\n" +
                "If one player picks rock and one scissors, the player who showed rock wins the dispute. To explain this, say rock crushes scissors (no need to actually crush).\n" +
                "If one player picks scissors and the other paper, the player who showed scissors succeeds. Scissors cuts paper.\n" +
                "If a player shows paper while the other shows rock, the player who picked paper succeeds. Paper covers rock.\n" +
                "Once game is taught, ask players to use in many different games and situations to solve minor disputes, such as is the ball in or out or who arrived first in line.\n");
        System.out.println("-------");
        System.out.println("Now u know everything. Let's start a game.");

        System.out.println("Player 1. Rock, Paper or scissors? Write there:");
        String player1 = cs.nextLine();

        System.out.println("Player 2. Rock, Paper or scissors? Write there:");
        String player2 = cs.nextLine();

        System.out.println("Result's:" + GameRockPaperScissors(player1, player2));
    }
 public static String GameRockPaperScissors(String player1, String player2)   {
     if(player1.equals("rock") && player2.equals("rock") || player1.equals("paper") && player2.equals("paper") ||player1.equals("scissors") && player2.equals("scissors") )
     {
         return "TIE";
     }
     if(player1.equals("rock") && player2.equals("scissors") || player1.equals("scissors") && player2.equals("paper") || player1.equals("paper") && player2.equals("rock") )
     {
         return "   Player 1 Win!!";
     }
     else
     {
         return "   Player 2 Win";
     }

 }

}
