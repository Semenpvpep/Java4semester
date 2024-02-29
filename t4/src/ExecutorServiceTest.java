public class ExecutorServiceTest {
    public static void main(String[] args) {
        CustomExecutorService executorService = new CustomExecutorService(3);

        for (int i = 0; i < 5; i++) {
            int taskNumber = i;
            executorService.execute(() -> {
                System.out.println("Task " + taskNumber + " is running in thread " + Thread.currentThread().getName());
            });
        }

        executorService.shutdown();
    }
}