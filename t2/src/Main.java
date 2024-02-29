import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // Создаем список объектов Person
        List<Person> people = Arrays.asList(
                new Person("Alice", 25, 60),
                new Person("Bob", 30, 70),
                new Person("Charlie", 35, 80),
                new Person("David", 40, 90),
                new Person("Eve", 45, 100),
                new Person("Frank", 50, 110)
        );

        // Сортировка по сумме веса и возраста
        List<Person> sortedList = people.stream()
                .sorted((p1, p2) -> (p1.getAge() + p1.getWeight()) - (p2.getAge() + p2.getWeight()))
                .collect(Collectors.toList());

        // Фильтрация по весу, кратному 5
        List<Person> filteredList = sortedList.stream()
                .filter(person -> person.getWeight() % 5 == 0)
                .collect(Collectors.toList());

        // Выбор первых четырех элементов
        List<Person> firstFour = filteredList.stream()
                .limit(4)
                .collect(Collectors.toList());

        // Конкатенация имён через пробел
        String concatenatedNames = firstFour.stream()
                .map(Person::getName)
                .collect(Collectors.joining(" "));

        // Вывод результата
        System.out.println("Конкатенированные имена: " + concatenatedNames);
    }
}