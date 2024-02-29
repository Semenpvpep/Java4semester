public class SingletonTest {
    public static void main(String[] args) {
        // Тест ClassicSingleton
        ClassicSingleton classicSingleton = ClassicSingleton.getInstance();
        System.out.println("ClassicSingleton instance: " + classicSingleton);

        // Тест EnumSingleton
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        System.out.println("EnumSingleton instance: " + enumSingleton);

        // Тест ThreadSafeSingleton
        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
        System.out.println("ThreadSafeSingleton instance: " + threadSafeSingleton);
    }
} //Singleton - это шаблон проектирования, который гарантирует, что для класса
// существует только один экземпляр, и предоставляет
// глобальную точку доступа к этому экземпляру.