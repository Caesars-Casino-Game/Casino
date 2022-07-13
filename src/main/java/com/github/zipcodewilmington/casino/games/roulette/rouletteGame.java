package com.github.zipcodewilmington.casino.games.roulette;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class rouletteGame extends ballGenerator {

    Scanner input = new Scanner(System.in);
    int money = 1000;
    int bet = 0;
    ballGenerator gen;

    public rouletteGame(){
        gen = new ballGenerator();
    }
    public void printSummary(){
        System.out.println("Welcome to Roulette!");
        System.out.println("Below is the pay out of your desired option.");
        System.out.println("+----------------------------------------------------+");
        System.out.println("| Bet              | Payout          | Probability   |");
        System.out.println("+----------------------------------------------------+");
        System.out.println("| [1]Red           | 1 : 1           | ~47.6%        |");
        System.out.println("+----------------------------------------------------+");
        System.out.println("| [2]Black         | 1 : 1           | ~47.3%        |");
        System.out.println("+----------------------------------------------------+");
        System.out.println("| [3]Green         | 35 : 1          | ~2.6%         |");
        System.out.println("+----------------------------------------------------+");
        System.out.println("| [4]Odd           | 1 : 1           | ~47.3%        |");
        System.out.println("+----------------------------------------------------+");
        System.out.println("| [5]Even          | 1 : 1           | ~47.3%        |");
        System.out.println("+----------------------------------------------------+");
        System.out.println("| [6]Single number | 35 : 1          | ~2.6%         |");
        System.out.println("+----------------------------------------------------+");
        System.out.println("| [7]First Twelve  | 2 : 1           | ~31.5         |");
        System.out.println("+----------------------------------------------------+");
        System.out.println("| [8]Second Twelve | 2 : 1           | ~31.5         |");
        System.out.println("+----------------------------------------------------+");
        System.out.println("| [9]Third Twelve  | 2 : 1           | ~31.5         |");
        System.out.println("+----------------------------------------------------+");
        System.out.println("| [10] No. 1 - 18  | 1 : 1           | ~31.5         |");
        System.out.println("+----------------------------------------------------+");
        System.out.println("| [11] No. 19 - 36 | 1 : 1           | ~31.5         |");
        System.out.println("+----------------------------------------------------+");
        System.out.println("//////////////////////////////////////////////////////");
        System.out.println("Please decide how much you want to bet and chose bet. ");
        System.out.println("//////////////////////////////////////////////////////");
    }
    public void printHelp(){
        if(input.equals("help")){
            System.out.println("Here is the help desk.");
            System.out.println("Below is the pay out of your desired option.");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| Bet              | Payout          | Probability   |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| [1]Red           | 1 : 1           | ~47.6%        |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| [2]Black         | 1 : 1           | ~47.3%        |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| [3]Green         | 35 : 1          | ~2.6%         |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| [4]Odd           | 1 : 1           | ~47.3%        |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| [5]Even          | 1 : 1           | ~47.3%        |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| [6]Single number | 35 : 1          | ~2.6%         |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| [7]First Twelve  | 2 : 1           | ~31.5         |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| [8]Second Twelve | 2 : 1           | ~31.5         |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| [9]Third Twelve  | 2 : 1           | ~31.5         |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| [10] No. 1 - 18  | 1 : 1           | ~31.5         |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| [11] No. 19 - 36 | 1 : 1           | ~31.5         |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("//////////////////////////////////////////////////////");
            System.out.println("Please decide how much you want to bet and chose bet. ");
            System.out.println("//////////////////////////////////////////////////////");
        }
    }


//    public String winningMove(Scanner input, int bet) {
//        if(input.equals("1") && bet == 3))
//        return null;
//    }
}
