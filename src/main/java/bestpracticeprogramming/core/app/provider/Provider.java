package bestpracticeprogramming.core.app.provider;

public interface Provider<T> {
    void run();
    void run(T t);
}