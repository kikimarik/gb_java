package catplate;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) throws OutOfFoodLimitException {
        if (this.food < n) {
            throw new OutOfFoodLimitException("No enough food =(");
        }
        this.food -= n;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void addFood(int quantity) {
        this.food += quantity;
    }
}
