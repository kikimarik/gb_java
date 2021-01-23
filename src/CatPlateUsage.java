import catplate.Cat;
import catplate.Plate;

public class CatPlateUsage {
    public static void main(String[] args) {
        Cat molly = new Cat("Molly kitty", 3);
        Plate plate = new Plate(6);
        molly.eat(plate); // try to feed hungry cat
        CatPlateUsage.checkHungry(molly);
        Cat silvester = new Cat("Silvester", 4);
        plate.info();
        silvester.eat(plate); // try to feed hungry cat when no enough food
        plate.info();
        CatPlateUsage.checkHungry(silvester);
        molly.eat(plate); // try to feed no hungry cat
    }

    private static void checkHungry(Cat cat) {
        if (cat.noHungry) {
            System.out.println("Nice! " + cat.getName() + " is not hungry!");
        }
    }
}
