package bestpracticeprogramming.core.app.console;

import bestpracticeprogramming.core.View;
import bestpracticeprogramming.core.app.console.constant.Character;
import bestpracticeprogramming.core.app.console.constant.Message;
import bestpracticeprogramming.core.app.console.service.AppService;
import bestpracticeprogramming.core.app.console.service.impl.AppServiceImpl;
import bestpracticeprogramming.core.app.console.util.Prompt;

import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsoleView implements View {

    private final AppService appService = new AppServiceImpl();
    private final List<Class<?>> registeredClasses = new ArrayList<>();
    @Override
    public void render() {
        for (int i = 0; i < registeredClasses.size(); i++) {
            String simpleName = registeredClasses.get(i).getSimpleName();
            String[] viewName = simpleName.split("(?=\\p{Upper})");
            System.out.println(i + Character.DOT + viewName[0]);

            int i1 = Prompt.integer(Message.PROMPT_MENU);
            appService.listen(i1);
        }
    }

    public void register(Class<?>... classes) {
        registeredClasses.addAll(Arrays.asList(classes));
        this.render();
    }

    private void execute(int input) {
        if (input < 0 || input >= registeredClasses.size()) {
            System.out.println(Message.INVALID_INTEGER);
        }

        Class<?> view = registeredClasses.get(input);
        try {
            Constructor<?> constructor = view.getConstructor();
            View viewInstance = (View) constructor.newInstance();
            viewInstance.render();
        } catch (NoSuchMethodException | IllegalAccessException |
                 InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
