package lab.oodp.challenge2;

import lab.oodp.Keyboard;

import java.util.Random;

/**
 * A guessing game!
 */
public class GuessingGame {

    private int guess = 0, goal;

    public void start() {

        // TODO Write your code here.
        RandomNumber();
        do {
            GussNumber();
        }while (CompareNumber());

    }

    public int GussNumber()
    {
        System.out.print("Enter your guess (1 – 100): ");

        guess = Integer.parseInt(Keyboard.readInput());

        return guess;

    }

    public int RandomNumber()
    {
        Random random = new Random();
        goal = random.nextInt(100)+1;

        return goal;
    }

    public boolean CompareNumber()
    {
        if(guess > goal)
        {
            System.out.println("Too high, try again");
            return true;
        }

        else if(guess < goal)
        {
            System.out.println("Too low, try again");
            return true;
        }

        else
        {
            System.out.println("Perfect!!");
            System.out.println("Goodbye");
            return false;
        }

    }


    /**
     * Program entry point. Do not edit.
     */
    public static void main(String[] args) {

        GuessingGame ex = new GuessingGame();
        ex.start();

    }
}
