package bestpracticeprogramming.core.app.console.service.impl;

import bestpracticeprogramming.Configuration;
import bestpracticeprogramming.core.View;
import bestpracticeprogramming.core.app.console.constant.Message;
import bestpracticeprogramming.core.app.console.service.AppService;
import bestpracticeprogramming.core.app.console.util.Prompt;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;


public class AppServiceImpl implements AppService {
    private List<String> views;

    public AppServiceImpl() {
    }

    @Override
    public void init(List<Class<?>> classes) {
        for (Class<?> aClass : classes) {
            try {
                Constructor<?> constructor = aClass.getConstructor();
                View viewInstance = (View) constructor.newInstance();
                String className = viewInstance.getClass().getSimpleName();
                String[] viewName = className.split("(?=\\p{Upper})");
                views.add(viewName[0]);
            } catch (NoSuchMethodException | IllegalAccessException |
                     InstantiationException | InvocationTargetException e) {
                throw new RuntimeException();
            }
        }
    }

    @Override
    public void listen(int input) {

        while (true) {
            if (input == 0) {
                System.exit(0);
            }
        }
    }

    @Override
    public void exit() {

    }
}
