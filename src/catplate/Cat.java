package catplate;

public class Cat {
    private String name;
    private int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        try {
            p.decreaseFood(appetite);
        } catch (OutOfFoodLimitException exception) {
            System.out.println(this.name + " is hungry.. " + exception.getMessage());
        }
    }
}
