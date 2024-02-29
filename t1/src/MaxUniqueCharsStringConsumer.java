import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

public class MaxUniqueCharsStringConsumer implements Consumer<String[]> {

    @Override
    public void accept(String[] strings) {
        if (strings == null || strings.length == 0) {
            System.out.println("Пустой массив строк");
            return;
        }

        String maxUniqueCharsString = Arrays.stream(strings)
                .max(Comparator.comparingInt(this::countUniqueChars))
                .orElse(null);

        System.out.println("Строка с наибольшим количеством уникальных символов: " + maxUniqueCharsString);
    }

    private int countUniqueChars(String str) {
        return (int) str.chars().distinct().count();
    }

    public static void main(String[] args) {
        String[] strings = {"hello", "world", "apple", "banana", "cat"};
        MaxUniqueCharsStringConsumer consumer = new MaxUniqueCharsStringConsumer();
        consumer.accept(strings);
    }
}