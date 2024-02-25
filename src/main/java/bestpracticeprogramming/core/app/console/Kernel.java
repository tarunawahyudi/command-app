package bestpracticeprogramming.core.app.console;

import bestpracticeprogramming.Configuration;
import bestpracticeprogramming.core.app.console.service.AppService;
import bestpracticeprogramming.core.app.console.service.impl.AppServiceImpl;

public class Kernel {

    public void boot(Configuration configuration) {
        AppService appService = new AppServiceImpl();
    }
}
