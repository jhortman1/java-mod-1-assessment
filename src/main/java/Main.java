import java.util.*;

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
            results(1, guess, random);
        }
        else if (guess == random)
        {
            results(2, guess, random);
        }
        else
        {
            results(3, guess, random);
            
        }
    }
    private static void levelTwoMediumPlay(int guess, int random) 
    {
        if(guess > random)
        {
            results(1, guess, random);
        }
        else
        {
            results(3, guess, random);
        }

    }
    private static void levelThreeHardPlay(int guess, int random) 
    {
        if(guess == random)
        {
            results(5, guess, random);
        }
        else
        {
            results(4, guess, random);
        }
    }
    private static void results(int message, int guess, int random)
    {
        switch (message)
        {
            case 1:
                System.out.println("Your number is greater than the Computer - WINNER!!!! :^) ");
                break;
            case 2:
                System.out.println("Your guess is equal to the Computer - WINNER!!!! :^) ");
                break;
            case 3:
                System.out.println("Your guess is lower than the Computer - LOSER :'( ");
                break;
            case 4:
                System.out.println("Your guess is not equal to the Computer - LOSER :'( ");
                break;
            case 5:
                System.out.println("Your guess equal to the Computer - WINNER!!!!! :'( ");
                break;
        }
        System.out.println("Your guess: " + guess);
        System.out.println("Computer's NUmber: " + random);
    }

}
