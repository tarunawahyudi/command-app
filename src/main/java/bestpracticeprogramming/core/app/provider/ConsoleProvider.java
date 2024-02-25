package bestpracticeprogramming.core.app.provider;

import bestpracticeprogramming.Configuration;
import bestpracticeprogramming.core.app.console.Kernel;

public class ConsoleProvider implements Provider<Configuration> {

    @Override
    public void run() {

    }

    @Override
    public void run(Configuration configuration) {
        Kernel kernel = new Kernel();
        kernel.boot(configuration);
    }
}
