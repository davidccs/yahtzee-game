import java.util.Arrays;
import java.util.Scanner;

public class Yahtzee {
    public static final int MAX_DICE_VALUES = 5;

    public static void main (String args[]){
        // constants


        System.out.println("Please enter dice values:");

        // take in user input
        Scanner input = new Scanner(System.in);
        int[] arr = new int[MAX_DICE_VALUES];
        //String line = input.nextLine();
        for (int i = 0; i < MAX_DICE_VALUES; i++){
            arr[i] = input.nextInt();
        }

        dice newDice = new dice(arr);
        newDice.showDice();

        // return a value in the range from 1 - 3
        // depending on the users choice
        double userChoice = userOptions();
        evaluation(userChoice);


    }

    public static double userOptions(){
        System.out.println("Please choose:");
        System.out.println("1 -> Reroll some dice");
        System.out.println("2 -> Reroll all dice");
        System.out.println("3 -> Keep dice");

        Scanner sc = new Scanner (System.in);
        double userChoice = sc.nextDouble();

        System.out.println(userChoice);

        if (userChoice % 1 != 0 || userChoice > 3 || userChoice < 1){
            System.out.println("Invalid Choice.");
            return 0;
        } else {
            return userChoice;

        }
    }
    public static void evaluation(double optionNumber){
        if (optionNumber == 1){
            System.out.println("Route 1");
        } else if (optionNumber == 2){
            System.out.println("Route 2");
        } else if (optionNumber == 3){
            System.out.println("Route 3");
        }
    }

}
