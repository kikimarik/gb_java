import animal.Cat;
import animal.Dog;

public class AnimalUsage {
    public static void main(String[] args) {
        Dog dog = new Dog("Jack");
        dog.run(500);
        dog.swim(50);
        Cat cat = new Cat("Molly");
        cat.run(350);
        cat.swim(50);
    }
}
