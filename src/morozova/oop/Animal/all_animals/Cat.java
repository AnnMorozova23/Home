package morozova.oop.Animal.all_animals;

public class Cat extends Animals {
    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void Swim(int a) {
        System.out.println("Коты не плавают! Котики предпочитают спать на солнышке");
    }

    @Override
    public void Run(int b) {
        if (b > 200) {
            System.out.println(name + " Не может столько бежать." + name + "Устал.");
        } else {
            System.out.println(name + " Пробежал " + b + " метров");
        }
    }
}
