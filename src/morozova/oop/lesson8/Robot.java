package morozova.oop.lesson8;

public class Robot implements Sportble {
    String name;
    int maxDistance;
    int maxJump;

    public Robot(String name, int maxDistance, int maxJump) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxJump = maxJump;
    }

    public String getName() {
        return name;
    }

    public boolean run(int distance) {
        if (distance < maxDistance) {
            System.out.println("Робот " + name + " пробежал дистанцию: " + distance + " м.");
            return true;
        } else {
            System.out.println("Робот " + name + " не смог проюежать дистанцию");
            return false;
        }
    }

    @Override
    public void jump() {
        System.out.println("Прыжок");
    }

    @Override
    public void jump(Wall wall) {
        System.out.println("Робот прыгает ");
    }

    @Override
    public void run(TreadMill treadMill) {
        System.out.println("Робот побежал ");
    }

}
