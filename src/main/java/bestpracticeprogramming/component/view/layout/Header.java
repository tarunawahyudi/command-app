package bestpracticeprogramming.component.view.layout;

import bestpracticeprogramming.core.app.console.constant.Input;
import bestpracticeprogramming.core.app.console.constant.Text;
import bestpracticeprogramming.core.app.console.util.Console;
import bestpracticeprogramming.core.app.console.util.Prompt;

public class Header {
    public static void render(String title) {
        Console.log(title, Text.TITLE);
    }

    public static void render() {
        Console.log("Welcome to null apps");
    }
}
