package bestpracticeprogramming.core.app.console.util;

import bestpracticeprogramming.core.app.console.constant.Character;
import bestpracticeprogramming.core.app.console.constant.Text;

public class Console {

    public static void log(String text) {
        System.out.println(text);
    }

    public static void log(String text, Text type) {
        switch (type) {
            case TITLE -> System.out.println(Character.SEPARATOR + text.toUpperCase() + Character.SEPARATOR);
            case DESC -> System.out.println(text.toLowerCase());
        }
    }
}
