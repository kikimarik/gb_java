package animal;

public class Dog extends Animal {

    private static final int MAX_RUN_DISTANCE = 500;
    private static final int MAX_SWIM_DISTANCE = 10;

    public static int instanceCounter = 0;

    public Dog(String name) {
        super(name);
        Dog.instanceCounter++;
    }

    @Override
    public void run(int distance) {
        if (distance <= Dog.MAX_RUN_DISTANCE) {
            super.run(distance);
        } else {
            System.out.println(this.name + " can`t run throw " + distance + " metres");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= Dog.MAX_SWIM_DISTANCE) {
            super.swim(distance);
        } else {
            System.out.println(this.name + " can`t swim throw " + distance + " metres");
        }
    }
}
