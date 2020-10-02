public abstract class Dog {
    String name;
    private int lifespan;
    private double length;
    private double height;
    private String origin;
    private int age;
    private double completedWay;

    Dog(String name, int age) {
        this.age = age;
        this.name = name;
        this.lifespan = 16;
        this.length = 40;
        this.height = 35;
        this.origin = "Germany";
    }


    abstract void bark();
    abstract void walk();

    void setName(String name) {
        this.name = name;
    }
    void passYear() {
        age++;
    }

    public String getName() {
        return name;
    }
}