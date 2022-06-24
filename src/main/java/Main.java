import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class Main {
    public static void main(String[] args) {
       
        int level = 0;
        int userInput;
        int randomNumber;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Guessing game!!!");

        System.out.print("Please Choose a level by entering 1(Easy) 2(Medium) 3(Hard): ");
        level = input.nextInt();

        System.out.print("Please enter a value between 0 and 1: ");
        userInput = input.nextInt();

        Random randomNumGenerator = new Random();
        randomNumber = randomNumGenerator.nextInt(11);

        System.out.println(userInput);
        System.out.println(randomNumber);

        switch (level)
        {
            case 1: levelOneEasyPlay(userInput, randomNumber);
                    break;
            case 2: levelTwoMediumPlay(userInput, randomNumber);
                    break;
            case 3: levelThreeHardPlay(userInput, randomNumber);
                    break;
        }




        input.close();
    }
    private static void levelOneEasyPlay(int guess, int random) 
    {
        if(guess > random)
        {
            System.out.println("Your number is greater than the Computer - WINNER!!!! :^) ");
        }
        else if (guess == random)
        {
            System.out.println("Your guess is equal to the Computer - WINNER!!!! :^) ");
        }
        else
        {
            System.out.println("Your guess is lower than the Computer - LOSER :'( ");
            
        }
        System.out.println("Your guess: " + guess);
        System.out.println("Computer's NUmber: " + random);
    }
    private static void levelTwoMediumPlay(int guess, int random) 
    {
        if(guess > random)
        {
            System.out.println("Congrats you won!!!");
        }

    }
    private static void levelThreeHardPlay(int guess, int random) 
    {
        if(guess > random)
        {
            System.out.println("Congrats you won!!!");
        }
    }
}
