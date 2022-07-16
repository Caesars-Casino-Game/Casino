package com.github.zipcodewilmington.casino.games.numberguess;

import java.util.Scanner;
import java.util.Random;

/**
 * Created by leon on 7/21/2020.
 */
public class NumberGuessGame {

    public static int playerGuess;
    public static int randomNumber;
    Scanner playerObject = new Scanner(System.in);

    String playerName;
    //Prompt for game menu
//Start game
// Exit game
//if player starts game,print "welcome player"
//ask player to pick a number between 2-12(user presses numbers on keyboard)
//player will be informed that they have max of 3 rounds "You will have a total of three guesses"
//player will roll dice, "player press 1 to activate random number generator aka dice"
//if the sum of the dice roll is higher than the secret number, print "Too high, try again!"
//if the sum of the dice roll is lower than the secret number, print "Too low, try again!"
//if the sum of the dice roll is equal to the secret number, print "Congratulation! Win! Win! Win!"
//After 3rd try, print "Game Over!"
//After Game Over, prompt player back to Main Menu 1
    public static void main(String[] args) {



        Random rand = new Random();
        int randomNumber = rand.nextInt(11) + 2;
        System.out.println("Random number is a secret");
        Scanner scanner = new Scanner((System.in));
        System.out.println("Pick a number between 2 and 12: ");

        int counter = 0;

 

        while (true) {
            int playerGuess = scanner.nextInt();
            if (playerGuess == randomNumber) {
                System.out.println("Congratulations! You win!");

                System.out.println("It took you " + counter + " tries");
                break;

            } else {
                System.out.println("Nope, guess again!");
                counter++;

            }

        }

    }

}

