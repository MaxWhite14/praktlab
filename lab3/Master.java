public class Master {
    public static void main(String[] args) {
        Dachshund dog1 = new Dachshund("Dog1", 12);
        Husky dog2 = new Husky("Dog2", 7);
        dog1.walk();
        dog2.walk();
        System.out.println(dog1.toString() + '\n' + dog2.toString());
    }
}
