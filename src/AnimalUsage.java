import animal.Cat;
import animal.Dog;

public class AnimalUsage {
    public static void main(String[] args) {
        Dog dog = new Dog("Jack");
        dog.run(500);
        dog.run(501); //over
        dog.swim(5);
        dog.swim(11); // over
        Cat cat = new Cat("Molly");
        cat.run(15);
        cat.run(350); // over
        cat.swim(50); // disabled
    }
}
