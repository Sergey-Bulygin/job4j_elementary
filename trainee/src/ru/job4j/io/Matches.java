package ru.job4j.io;

import java.util.Scanner;

/**
 * Class   Matches
 * Created 18/04/2020 - 9:24
 * Project job4j_elementary
 * Author  Sergey Bulygin
 */
public class Matches {
    /**
     * Players fields.
     */
    public static String playerOne = "First player";
    public static String playerTwo = "Second player";

    /**
     * Move player.
     * @param input scanner input.
     * @param number player number.
     * @return amount matches.
     */
    public int playerMove(Scanner input, String number) {
        int result = 0;
        boolean move = true;
        while (move) {
            System.out.println(String.format("%s, take the matches: ", number));
            result = Integer.parseInt(input.nextLine());
            if (result >= 1 && result <= 3) {
                System.out.println(String.format("%s took %s matches.", number, result));
                move = false;
            } else {
                System.out.println("Wrong number of matches taken.");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Matches matches = new Matches();
        int value = 11;
        int pickOne;
        int pickTwo;
        Scanner input = new Scanner(System.in);
        System.out.println("There are 11 matches on the table. Two players take turns taking 1 to 3 matches. "
                         + "The one who picked up the last matches wins.");
        while (true) {
            System.out.println(String.format("There are %s matches.", value));
            pickOne = matches.playerMove(input, playerOne);
            value = value - pickOne;
            if (0 >= value) {
                System.out.println("The first player won!");
                break;
            }
            System.out.println(String.format("There are %s matches.", value));
            pickTwo = matches.playerMove(input, playerTwo);
            value = value - pickTwo;
            if (0 >= value) {
                System.out.println("The second player won!");
                break;
            }
        }
    }
}
