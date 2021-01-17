import animal.Animal;
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
        Dog dog1 = new Dog("Spike");

        System.out.println("There are " + Animal.instanceCounter + " animals.");
        System.out.println("There are " + Dog.instanceCounter + " dogs.");
        System.out.println("There are " + Cat.instanceCounter + " cats.");
    }
}
