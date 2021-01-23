import catplate.Cat;
import catplate.Plate;

public class CatPlateUsage {
    public static void main(String[] args) {
        Plate plate = new Plate(10);
        Cat[] cats = {
                new Cat("Tom", 2), // done
                new Cat("Molly", 1), // done
                new Cat("Fat guy", 6), // done
                new Cat("Augustin", 3), // fail
                new Cat("Dr. Bob", 2), // fail
                new Cat("Lizzy", 1), // done
                new Cat("Stacy", 2), // fail
        };
        for (Cat cat : cats) {
            cat.eat(plate);
            CatPlateUsage.checkHungry(cat);
        }
    }

    private static void checkHungry(Cat cat) {
        if (cat.noHungry) {
            System.out.println("Nice! " + cat.getName() + " is not hungry!");
        }
    }
}
