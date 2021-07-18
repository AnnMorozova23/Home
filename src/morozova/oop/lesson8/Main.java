package morozova.oop.lesson8;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Иван", 150, 2);
        Cat cat1 = new Cat("Мурзик", 100, 1);
        Robot robot1 = new Robot("Альтрон", 1530, 480);

        Wall wall1 = new Wall(10);
        TreadMill treadMill1 = new TreadMill(100);

        System.out.println("Задание №1 \n");

        human1.run(140);
        cat1.jump();
        robot1.run(140);
        System.out.println();

        System.out.println("Задание № 2 \n");

        wall1.jumpWall(robot1, human1, cat1);
        treadMill1.runTreadMill(robot1, human1, cat1);


        Sportble[] sportbles = {
                new Robot("Теслик", 1500, 20),
                new Human("Сережа", 10, 10),
                new Cat("Барсик", 10, 2),
        };

        Obstacles[] obstacles = {
                new Wall(15),
                new TreadMill(1000)
        };

        System.out.println("Задание № 3 \n");

        for (int i = 0; i < sportbles.length; i++) {
            sportbles[i].run(150);
        }

        for (int i = 0; i < obstacles.length; i++) {
            obstacles[i].jumpWall(robot1,human1, cat1);

        }

    }

}

