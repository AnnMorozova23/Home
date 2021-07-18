package morozova.oop.lesson8;

public class Cat implements Sportble {
    String name;
    int maxDistance;
    int maxJump;

    public Cat(String name, int maxDistance, int maxJump) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxJump = maxJump;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean run(int distance) {
        if(distance<maxDistance) {
            System.out.println("Кот " + name + " пробежал дистанцию: " + distance + " м.");
            return true;
        }else {
            System.out.println("Кот " + name + " не смог пробежать дистанцию");
            return false;
        }
    }

    @Override
    public void jump() {
        System.out.println("Прыжок");
    }

    @Override
    public void jump(Wall wall) {
        System.out.println("Кот прыгает ");
    }

    @Override
    public void run (TreadMill treadMill) {
        System.out.println("Кот побежал ");
    }
}
