import jdk.internal.icu.lang.UCharacterDirection;

public class ClassicSingleton {
    private static ClassicSingleton instance;
    // ленивая инициализация
    private ClassicSingleton() {
        // Приватный конструктор, чтобы предотвратить создание экземпляров извне.
    }

    public static ClassicSingleton getInstance() {
        if (instance == null) {
            instance = new ClassicSingleton();
        }
        return instance;
    }
}