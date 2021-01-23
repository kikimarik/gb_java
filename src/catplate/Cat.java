package catplate;

public class Cat {
    private final String name;
    private final int appetite;
    public boolean noHungry = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (this.noHungry) {
            System.out.println(this.name + " don`t eat and say: Thx! But I`m not hungry =)");
        }
        try {
            p.decreaseFood(appetite);
            this.noHungry = true;
        } catch (OutOfFoodLimitException exception) {
            System.out.println(this.name + " is hungry.. " + exception.getMessage());
        }
    }

    public String getName() {
        return name;
    }
}
