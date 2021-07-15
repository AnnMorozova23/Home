package morozova.oop.lesson7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cat cat1;
        Cat cat2;
        Cat cat3;
        Cat cat4;
        Cat[] cats = {
                cat1 = new Cat("Барсик", 15),
                cat2 = new Cat("Куки", 10),
                cat3 = new Cat("Васька", 80),
                cat4 = new Cat("Мурзик", 30),
        };

        Plate plate1 = new Plate(100);
        plate1.setFood(200);
        plate1.getFood();

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate1);
            System.out.println(plate1);
            System.out.println();
        }
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Подкинуть котам еды? если да введите 1 если нет - 0");
            int x;
            x = sc.nextInt();
            if (x == 1) {
                plate1.plus_food(150);
                System.out.println(plate1);
            } else if (x == 0) {
                System.out.println("ну и жадина");
                return;
            }
            System.out.println("Покормить еще раз котов? 1 - да, 0 - нет");
            x = sc.nextInt();
            if (x == 1) {
                for (int i = 0; i < cats.length; i++) {
                    cats[i].eat(plate1);
                    System.out.println(plate1);
                    System.out.println();
                }
            } else if (x == 0) {
                System.out.println("Тогда котики пойдут спать");
                for (int i = 0; i < cats.length; i++) {
                    cats[i].sleep();
                }
                return;
            }
        }
    }
}