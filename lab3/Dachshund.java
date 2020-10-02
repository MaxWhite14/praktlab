public class Dachshund extends Dog{

    String name;
    public String breed;
    private final int lifespan;
    private final double length;
    private final double height;
    private final String origin;
    private final int age;
    private double completedWay;

    Dachshund(String name, int age) {
        super(name,age);
        this.age = age;
        this.name = name;
        this.lifespan = 16;
        this.length = 40;
        this.height = 35;
        this.origin = "Germany";

    }

    @Override
    void bark() {
        System.out.println("bark!");
    }

    @Override
    void walk() {
        completedWay+=0.5;
    }

    @Override
    public String toString() {
        return "Dachshund{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", lifespan=" + lifespan +
                ", length=" + length +
                ", height=" + height +
                ", origin='" + origin + '\'' +
                ", age=" + age +
                ", completedWay=" + completedWay +
                '}';
    }
}
