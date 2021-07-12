package morozova.oop.Animal;

import morozova.oop.Animal.all_animals.Cat;
import morozova.oop.Animal.all_animals.Dog;

public class Main {
    public static void main(String[] args) {
        int animal_count = 0;
        Cat cat = new Cat("Куки", "белый", 2);
        animal_count++;
        cat.info();
        Dog dog = new Dog("Бобик", " Черный", 4);
        animal_count++;
        Cat cat1 = new Cat("Васька", "рыжий", 4);
        animal_count++;
        dog.info();
        cat.Swim(14);
        dog.Swim(180);
        cat1.Run(15);
        dog.Run(890);
        System.out.println("Количество всех котиков и собачек = " + animal_count);
    }
}
