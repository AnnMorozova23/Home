package morozova.oop.Animal.all_animals;


public abstract class Animals {
    protected String name;
    protected String color;
    protected int age;

    public Animals(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void info() {
        System.out.printf("%s %s %d\n", name, color, age);
    }

    public abstract void Swim(int a);

    public abstract void Run(int b);

}
