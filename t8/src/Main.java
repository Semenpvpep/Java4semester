// Интерфейс посетителя
interface Visitor {
    void visit(ElementA element);
    void visit(ElementB element);
}

// Абстрактный класс элемента, принимающего посетителя
interface Element {
    void accept(Visitor visitor);
}

// Конкретные элементы
class ElementA implements Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    String operationA() {
        return "операция A";
    }
}

class ElementB implements Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    String operationB() {
        return "операция B";
    }
}

// Конкретный посетитель
class ConcreteVisitor implements Visitor {
    public void visit(ElementA element) {
        System.out.println("Посетитель посещает " + element.operationA());
    }

    public void visit(ElementB element) {
        System.out.println("Посетитель посещает " + element.operationB());
    }
}

// Пример использования
public class Main {
    public static void main(String[] args) {
        // Пример использования шаблона "Шаблонный метод"
        AbstractClass abstractObject = new ConcreteClass();
        abstractObject.templateMethod();

        // Пример использования паттерна "Посетитель"
        Element[] elements = {new ElementA(), new ElementB()};
        Visitor visitor = new ConcreteVisitor();

        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}

// Абстрактный класс с шаблонным методом
abstract class AbstractClass {
    // Шаблонный метод, определяющий последовательность операций
    public final void templateMethod() {
        // Шаг 1
        step1();
        // Шаг 2
        step2();
        // Шаг 3
        step3();
    }

    // Абстрактные методы, которые подклассы должны реализовать
    protected abstract void step1();
    protected abstract void step2();
    protected abstract void step3();
}

// Конкретная реализация абстрактного класса
class ConcreteClass extends AbstractClass {
    // Реализация первого шага
    protected void step1() {
        System.out.println("Выполнение шага 1");
    }

    // Реализация второго шага
    protected void step2() {
        System.out.println("Выполнение шага 2");
    }

    // Реализация третьего шага
    protected void step3() {
        System.out.println("Выполнение шага 3");
    }
}
