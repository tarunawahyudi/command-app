package bestpracticeprogramming.core.app.console.util;

import bestpracticeprogramming.core.app.console.constant.Character;
import bestpracticeprogramming.core.app.console.constant.Input;
import bestpracticeprogramming.core.app.console.constant.Message;

import java.util.Scanner;

public class Prompt {

    private static final Scanner scanner = new Scanner(System.in);

    public static String string(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static String string(String command, Input input) {
        placeholder(command, input);
        return scanner.nextLine();
    }

    public static int integer(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println(Message.INVALID_INTEGER);
            scanner.next();
            System.out.print(prompt);
        }

        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }

    public static double decimal(String prompt) {
        while (!scanner.hasNextInt()) {
            System.out.println(Message.INVALID_DECIMAL);
            scanner.next();
            System.out.println(prompt);
        }

        double input = scanner.nextDouble();
        scanner.nextLine();
        return input;
    }

    private static void placeholder(String prompt, Input input) {
        switch (input) {
            case PROMPT -> System.out.print(prompt + Character.PROMPT_COLON);
            case REDIRECT -> System.out.println(prompt + Character.PROMPT_REDIRECT);
            default -> System.out.print(prompt);
        }
    }
}
