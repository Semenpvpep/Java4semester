interface AbstractProductA { // Абстрактная фабрика (Abstract Factory)
    void createA();
}

interface AbstractProductB {
    void createB();
}

interface AbstractFactory {
    AbstractProductA createProductA();
    AbstractProductB createProductB();
}

class ConcreteProductA1 implements AbstractProductA {
    @Override
    public void createA() {
        System.out.println("Creating ConcreteProductA1");
    }
}

class ConcreteProductB1 implements AbstractProductB {
    @Override
    public void createB() {
        System.out.println("Creating ConcreteProductB1");
    }
}

class ConcreteFactory1 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}
