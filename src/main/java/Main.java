import java.util.*;

public class Main {
    public static void main(String[] args) {

        int level = 0;
        int userInput;
        int randomNumber;
        Scanner input = new Scanner(System.in);
        boolean replayFlag = false;
        String replay;

        System.out.println("Welcome to the Guessing game!!!");

        String[] rules = {
                "Easy: guess a number - if your guess is higher or equal (you win), if your guess is lower (computer wins).",
                "Medium: guess a number - if your guess is strictly higher (you win), if your guess is lower or equal (computer wins).",
                "Hard: guess a number - if your guess is equal (you win) if your guess is not egual (computer wins)." };

        do {
            do {
                System.out.print("Please Choose a level by entering 1(Easy) 2(Medium) 3(Hard): ");
                while (!input.hasNextInt()) {
                    System.out.print("Invalid Value, Please enter value 1-3 to choose level: ");
                    input.next();
                }
                userInput = input.nextInt();
            } while (!(userInput >= 1 && userInput <= 3));

            level = userInput;

            System.out.println("");

            System.out.println(rules[level - 1]);

            System.out.println("");

            do {
                System.out.print("Please enter a value between 0 and 10: ");
                while (!input.hasNextInt()) {
                    System.out.print("Invalid Value, Please enter value 0-10: ");
                    input.next();
                }
                userInput = input.nextInt();
            } while (!(userInput >= 0 && userInput <= 10));

            randomNumber = generateRandomNumber();

            System.out.println("");

            switch (level) {
                case 1:
                    levelOneEasyPlay(userInput, randomNumber);
                    break;
                case 2:
                    levelTwoMediumPlay(userInput, randomNumber);
                    break;
                case 3:
                    levelThreeHardPlay(userInput, randomNumber);
                    break;
            }

            System.out.println("");

            System.out.print("Would you like to play again? y/n: ");

            replay = input.next();

            while (!(replay.equalsIgnoreCase("y") || replay.equalsIgnoreCase("n"))) {
                System.out.print("Please enter y for yes or n for no: ");
                replay = input.nextLine();
            }

            if (replay.equalsIgnoreCase("y"))
                replayFlag = true;
            else
                replayFlag = false;
        } while (replayFlag);

        System.out.println("");
        System.out.println("Thanks for playing! Have a great Day!");

        input.close();
    }

    private static int generateRandomNumber() {
        Random randomNumGenerator = new Random();
        int rand = randomNumGenerator.nextInt(11);
        return rand;
    }

    private static void levelOneEasyPlay(int guess, int random) {
        if (guess > random) {
            results(1, guess, random);
        } else if (guess == random) {
            results(2, guess, random);
        } else {
            results(3, guess, random);

        }
    }

    private static void levelTwoMediumPlay(int guess, int random) {
        if (guess > random) {
            results(1, guess, random);
        } else {
            results(3, guess, random);
        }

    }

    private static void levelThreeHardPlay(int guess, int random) {
        if (guess == random) {
            results(2, guess, random);
        } else {
            results(4, guess, random);
        }
    }

    private static void results(int message, int guess, int random) {
        switch (message) {
            case 1:
                System.out.println("Your number is greater than the Computer - WINNER!!!! :^) ");
                break;
            case 2:
                System.out.println("Your guess is equal to the Computer - WINNER!!!! :^) ");
                break;
            case 3:
                System.out.println("Your guess is lower or equal to the Computer - LOSER :'( Computer Wins");
                break;
            case 4:
                System.out.println("Your guess is not equal to the Computer - LOSER :'( Computer Wins");
                break;
        }
        System.out.println("Your guess: " + guess);
        System.out.println("Computer's NUmber: " + random);
    }

}
