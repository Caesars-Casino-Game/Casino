package com.github.zipcodewilmington.casino.games.PracticeGamesAndPlayerClasses;

import com.github.zipcodewilmington.Casino;
import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessGamePractice implements GameInterface {
    public static int playerGuess;
    public static int randomNumber;
    Scanner playerObject = new Scanner(System.in);

    String playerName;

    private final IOConsole console = new IOConsole(AnsiColor.BLUE);

    public Integer balance;
    public List<PlayerInterface> gambler = new ArrayList<>();
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


    @Override
    public void add(PlayerInterface player) {
        player.getArcadeAccount();
        this.balance = player.getArcadeAccount().getBalance();
        System.out.println("Your balance is " + this.balance);
        gambler.add(player);
    }

    @Override
    public void remove(PlayerInterface player) {
        Casino c = new Casino(player);
        c.run();

    }

    @Override
    public void run() {

        Random rand = new Random();
        int randomNumber = rand.nextInt(11) + 2;
        System.out.println("Random number is a secret");
        int counter = 0;

        boolean running = true;
        while (running) {
            int playerGuess = console.getIntegerInput("Pick a number between 2 and 12: ");
            if (playerGuess == randomNumber) {
                System.out.println("Congratulations! You win!");

                System.out.println("It took you " + counter + " tries");
                String playAgain = console.getStringInput("Enter yes to play again or no to quit game");
                if(playAgain.equalsIgnoreCase("yes")){
                    this.run();
                    break;
                } else if (playAgain.equalsIgnoreCase("no")){
                    this.remove(gambler.get(0));
                    break;
                }
            } else {
                System.out.println("Nope, guess again!");
                counter++;

            }

        }

    }

    @Override
    public void bet() {

    }

    @Override
    public void continueGambling() {

    }

    @Override
    public void lose() {

    }

    @Override
    public void outcome() {

    }

    @Override
    public void bonus() {

    }

    @Override
    public void enterGame() {

    }

    @Override
    public void kickout() {

    }

    @Override
    public void account() {

    }

    @Override
    public void moneyCheck() {

    }

    @Override
    public void music() {

    }
}
