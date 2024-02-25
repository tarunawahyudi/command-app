package bestpracticeprogramming.core.app.console.service;

import java.util.List;

public interface AppService {

    void init(List<Class<?>> classes);
    void listen(int input);
    void exit();
}
