abstract class Product1 {
    private String part1;
    private String part2;

    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }

    public void show() {
        System.out.println("Product parts: " + part1 + " and " + part2);
    }

    public abstract void create();
}

interface Builder {
    void buildPart1();
    void buildPart2();
    Product1 getResult();
}

class ConcreteBuilder implements Builder {
    private Product1 product = new Product1() {
        @Override
        public void create() {

        }
    };

    @Override
    public void buildPart1() {
        product.setPart1("Part1");
    }

    @Override
    public void buildPart2() {
        product.setPart2("Part2");
    }

    @Override
    public Product1 getResult() {
        return product;
    }
}