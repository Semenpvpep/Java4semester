abstract class Prototype implements Cloneable {
    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }

    abstract void use();
}

class ConcretePrototype extends Prototype {
    @Override
    void use() {
        System.out.println("Using ConcretePrototype");
    }
}