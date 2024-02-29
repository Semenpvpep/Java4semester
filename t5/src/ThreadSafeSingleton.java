public class ThreadSafeSingleton {
    private ThreadSafeSingleton() {
        // Приватный конструктор
    }
 // Thread-safe Singleton с использованием статического блока и внутреннего класса
    private static class SingletonHelper {
        private static final ThreadSafeSingleton INSTANCE = new ThreadSafeSingleton();
    }

    public static ThreadSafeSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
