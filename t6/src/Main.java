interface Product { //Фабричный метод (Factory Method)
    void create();

    void show();
}

class ConcreteProduct extends Product1 {
    @Override
    public void create() {
        System.out.println("Creating ConcreteProduct");
    }
}

abstract class Creator {
    public void someOperation() {
        Product1 product = factoryMethod();
        product.create();
    }

    protected abstract Product1 factoryMethod();
}

class ConcreteCreator extends Creator {
    @Override
    protected Product1 factoryMethod() {
        return new ConcreteProduct();
    }
}