package morozova.oop.Animal.all_animals;

public class Dog extends Animals {
    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void Swim(int a) {
        if (a > 10) {
            System.out.println(name + " Не может столько много плыть");
        } else {
            System.out.println(name + " Проплыл " + a + " метров");
        }
    }

    @Override
    public void Run(int b) {
        if (b > 500) {
            System.out.println(name + " Не может столько бежать. " + name + " Устал.");
        } else {
            System.out.println(name + " Пробежал " + b + " метров");
        }
    }
}
