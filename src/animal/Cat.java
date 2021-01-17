package animal;

public class Cat extends Animal {

    private static final int MAX_RUN_DISTANCE = 200;

    public static int instanceCounter = 0;

    public Cat(String name) {
        super(name);
        Cat.instanceCounter++;
    }

    @Override
    public void run(int distance) {
        if (distance <= Cat.MAX_RUN_DISTANCE) {
            super.run(distance);
        } else {
            System.out.println(this.name + " can`t run throw " + distance + " metres");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(this.name + " can`t swim!");
    }
}
