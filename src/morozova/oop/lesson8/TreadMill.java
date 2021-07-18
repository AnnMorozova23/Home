package morozova.oop.lesson8;

public class TreadMill implements Obstacles {

    private int length;
    private String name;

    public TreadMill(int length) {
        this.length = length;
    }


    {
        name = "Беговая дорожка";
    }

    public int getLength() {
        return length;
    }

    public String getName() {
        return name;
    }

    @Override
    public void jumpWall(Robot robot, Human human, Cat cat) {
        System.out.println();
    }

    @Override
    public void runTreadMill(Robot robot, Human human, Cat cat) {
        System.out.println("Препятствие для Спортсменов: " + getName());
        System.out.println();

        robot.run(this);
        if (length < robot.maxDistance) {
            System.out.println(robot.getName() + " пробежал дистанцию : " + length + " м.");
        } else {
            System.out.println(robot.getName() + " не смог пробежать дистанцию : " + length + " м.");
        }
        System.out.println();

        human.run(this);
        if (length < human.maxDistance) {
            System.out.println(human.getName() + " пробежал дистанцию : " + length + " м.");
        } else {
            System.out.println(human.getName() + " не смог пробежать дистанцию : " + length + " м.");
        }
        System.out.println();

        cat.run(this);
        if (length < cat.maxDistance) {
            System.out.println(cat.getName() + " пробежал дистанцию : " + length + " м.");
        } else {
            System.out.println(cat.getName() + " не смог пробежать дистанцию : " + length + " м.");

        }
        System.out.println();

    }
}
