package bestpracticeprogramming.core.app.console;

import bestpracticeprogramming.Configuration;
import bestpracticeprogramming.core.app.console.constant.Character;
import bestpracticeprogramming.core.app.console.constant.Text;
import bestpracticeprogramming.core.app.console.service.AppService;
import bestpracticeprogramming.core.app.console.service.impl.AppServiceImpl;

import java.util.List;

public class ConsoleApp {

    public static void run() {

    }
    public static void run(Configuration configuration) {
        List<String> menus = configuration.getMenus();
        String appName = configuration.getName();

        System.out.println(Character.SEPARATOR + appName + Character.SEPARATOR);
        for (int i = 0; i < menus.size(); i++) {
            if (i == 0) System.out.println((i) + Character.DOT + "Exit");
            System.out.println((i + 1) + Character.DOT + menus.get(i));
        }

        AppService appService = new AppServiceImpl();
    }
}
