import catplate.Cat;
import catplate.Plate;

public class CatPlateUsage {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 6);
        Plate plate = new Plate(10);
        plate.info();
        cat.eat(plate);
        plate.info();
        cat.eat(plate);
        plate.info();
    }
}
