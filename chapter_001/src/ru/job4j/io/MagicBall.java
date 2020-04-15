package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

/**
 * Class   MagicBall
 * Created 15/04/2020 - 10:54
 * Project job4j_elementary
 * Author  Sergey Bulygin
 */
public class MagicBall {
    /**
     * Text color fields.
     */
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RED = "\u001B[31m";


    private static void oracle() {
        Scanner input = new Scanner(System.in);
        greeting();
        boolean run = true;
        while (run) {
            int select = Integer.parseInt(input.nextLine());
            if (select == 2) {
                System.out.println(ANSI_RED + "God protect you." + ANSI_RESET);
                run = false;
            }
            if (select == 1) {
                System.out.print(ANSI_CYAN + "!------------What do you want to know?-------------!" + ANSI_RESET);
                System.out.println();
                String name = input.nextLine();
                answers(name);
                menu();
            }
        }
    }

    /**
     * The method displays the compliment to the console.
     */
    private static void greeting() {
        System.out.println(ANSI_BLUE + "====================================================" + ANSI_RESET);
        System.out.print(ANSI_BLUE + "! I am the great Oracle. What do you want to know? !" + ANSI_RESET);
        System.out.println();
        menu();
    }

    /**
     * The method generates responses.
     * @param name user input.
     */
    private static void answers(String name) {
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.println("+----+----+----+----+----+----+----+");
            System.out.println(String.format(ANSI_YELLOW + "|Your question - %s <---> Answer - Yes|"
                    + ANSI_RESET, name));
        }
        if (answer == 1) {
            System.out.println(String.format(ANSI_YELLOW + "|Your question - %s <---> Answer - No|"
                    + ANSI_RESET, name));
        }
        if (answer == 2) {
            System.out.println(String.format(ANSI_YELLOW + "|Your question - %s <---> Answer - May be ...|"
                    + ANSI_RESET, name));
        }
    }

    /**
     * The method displays the menu to the console.
     */
    private static void menu() {
        System.out.println(ANSI_GREEN + "====================================================" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "|--------------- 1 - Ask a Question.---------------|" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "|--------------- 2 - No questions.-----------------|" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "****************************************************" + ANSI_RESET);
        System.out.print(ANSI_PURPLE + "Enter number: " + ANSI_RESET);
    }

    /**
     * Point of entry.
     * @param args array strings.
     */
    public static void main(String[] args) {
        oracle();
    }
}


