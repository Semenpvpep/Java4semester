public class DesignPatternsTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Фабричный метод (Factory Method)
        Creator creator = new ConcreteCreator();
        creator.someOperation();

        // Абстрактная фабрика (Abstract Factory)
        AbstractFactory factory = new ConcreteFactory1();
        AbstractProductA productA = factory.createProductA();
        AbstractProductB productB = factory.createProductB();
        productA.createA();
        productB.createB();

        // Строитель (Builder)
        ConcreteBuilder builder = new ConcreteBuilder();
        builder.buildPart1();
        builder.buildPart2();
        Product1 product = builder.getResult();
        product.show();

        // Прототип (Prototype)
        ConcretePrototype prototype = new ConcretePrototype();
        ConcretePrototype clonedPrototype = (ConcretePrototype) prototype.clone();
        prototype.use();
        clonedPrototype.use();
    }
}