import catplate.Cat;
import catplate.Plate;

public class CatPlateUsage {
    public static void main(String[] args) {
        Plate plate = new Plate(0);
        Cat[] cats = {
                new Cat("Tom", 2), // done
                new Cat("Molly", 1), // done
                new Cat("Fat guy", 6), // fail
                new Cat("Augustin", 3), // done
                new Cat("Dr. Bob", 2), // done
                new Cat("Lizzy", 1), // done
                new Cat("Stacy", 2), // done
        };
        for (Cat cat : cats) {
            plate.addFood(2); // add 2 food units
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
