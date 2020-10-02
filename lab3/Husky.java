public class Husky extends Dog{

    public String name;
    private final int lifespan;
    private final double length;
    private final double height;
    private final String origin;
    private final int age;
    private double completedWay;
    
    Husky(String name, int age) {
        super(name, age);
        this.age = age;
        this.name = name;
        this.lifespan = 16;
        this.length = 80;
        this.height = 65;
        this.origin = "Siberia";
    }

    @Override
    void bark() {
        System.out.println("woof!");
    }

    @Override
    void walk() {
        completedWay+=2;
    }

    @Override
    public String toString() {
        return "Husky{" +
                "name='" + name + '\'' +
                ", lifespan=" + lifespan +
                ", length=" + length +
                ", height=" + height +
                ", origin='" + origin + '\'' +
                ", age=" + age +
                ", completedWay=" + completedWay +
                '}';
    }
}
