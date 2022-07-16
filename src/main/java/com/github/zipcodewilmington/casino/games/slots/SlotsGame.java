package com.github.zipcodewilmington.casino.games.slots;

import com.github.zipcodewilmington.Casino;
import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.CasinoAccountManager;
import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 * Created by leon on 7/21/2020.
 */
public class SlotsGame extends CasinoAccountManager implements GameInterface {

    private final IOConsole console = new IOConsole(AnsiColor.BLUE);
    public List<PlayerInterface> gambler = new ArrayList<>();
    public List<PlayerInterface> leaveGame = new ArrayList<>();
    private Integer balance;
    @Override
    public void add(PlayerInterface player) {

        player.getArcadeAccount();
        this.balance = player.getArcadeAccount().getBalance();
        System.out.println("Welcome to Slots! " + "\uD83C\uDFB0" + "\n" +
                "Your balance is " + this.balance);
        gambler.add(player);
    }

    @Override
    public void remove(PlayerInterface player) {
        gambler.get(0).getArcadeAccount().setBalance(this.balance);
        Casino c = new Casino(player);
        c.run();
    }

    @Override
    public void run() {
        boolean running = true;
        while (running) {
            int bet = this.setBet(gambler.get(0));
            if (bet == 1) this.slots(gambler.get(0));
            else {
                String done = console.getStringInput("You can't play without inserting a dollar. Would you like to stay?");
                if (done.equals("no")) {
                    this.remove(gambler.get(0));
                    break;
                }
            }
        }
    }

    public void slots(PlayerInterface player) {
        int[] lever = Lever.PullLever();

        String result = getResult(lever);
        if (result.equals("bingo")) win(player, 25);
        if (result.equals("bango")) win(player, 10);
        if (result.equals("bongo")) lose(player);

    }

    public String getResult(int[] pulled) {
        if (pulled[0] == pulled[1] && pulled[0] == pulled[2]) return "bingo";
        else if (pulled[0] == pulled[1] || pulled[1] == pulled[2]) return "bango";
        else return "bongo";
    }

    public int setBet(PlayerInterface player) {
        String input = console.getStringInput("Input $1 to play!");
        if (input.equals("1")) {
            int balance = player.getArcadeAccount().getBalance();
            player.getArcadeAccount().setBalance(balance - 1);
            return 1;
        }
        else return 0;
    }

    public void win(PlayerInterface player, int winnings) {
        int balance = player.getArcadeAccount().getBalance();
        balance = balance + winnings;
        player.getArcadeAccount().setBalance(balance);
        System.out.println("Your new balance is " + player.getArcadeAccount().getBalance());
    }

    public void lose(PlayerInterface player) {
        System.out.println("Better luck next time. \n" +
                "Your new balance is " + player.getArcadeAccount().getBalance());
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