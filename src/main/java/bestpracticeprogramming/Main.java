package bestpracticeprogramming;

import bestpracticeprogramming.component.view.HomeView;
import bestpracticeprogramming.component.view.LoginView;
import bestpracticeprogramming.component.view.WelcomeView;
import bestpracticeprogramming.core.app.console.ConsoleView;

public class Main {
    public static void main(String[] args) {

        ConsoleView consoleView = new ConsoleView();
        consoleView.register(HomeView.class, WelcomeView.class, LoginView.class);
    }
}
