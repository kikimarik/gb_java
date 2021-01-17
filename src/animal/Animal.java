package animal;

public abstract class Animal {

    protected String name;

    protected Animal(String name) {
        this.name = name;
    }

    public void run(int distance) {
        System.out.println(this.name + " ran through " + distance + " metres");
    }

    public void swim(int distance) {
        System.out.println(this.name + " swam through " + distance + " metres");
    }
}
