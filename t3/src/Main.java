public class Main {

    public static void main(String[] args) {
        // Пример использования SafeList
        SafeList<Integer> safeList = new SafeList<>();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                safeList.add(i);
                System.out.println("Added " + i + " to the list");
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 5; i < 10; i++) {
                safeList.add(i);
                System.out.println("Added " + i + " to the list");
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("SafeList contents: " + safeList);

        // Пример использования SafeSet
        SafeSet<String> safeSet = new SafeSet<>();
        Thread thread3 = new Thread(() -> {
            safeSet.add("apple");
            safeSet.add("banana");
            safeSet.add("orange");
        });

        Thread thread4 = new Thread(() -> {
            safeSet.add("apple");
            safeSet.add("grape");
            safeSet.add("banana");
        });

        thread3.start();
        thread4.start();

        try {
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("SafeSet contents: " + safeSet.toString());
    }
}