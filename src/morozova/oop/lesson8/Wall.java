package morozova.oop.lesson8;

public class Wall implements Obstacles {
    private int high;
    private String name;

    public Wall(int high) {
        this.high = high;
    }

    {
        high = 10;
    }

    {
        name = "Стена";
    }

    public int getHigh() {
        return high;
    }

    public String getName() {
        return name;
    }

    @Override
    public void runTreadMill(Robot robot, Human human, Cat cat) {
        System.out.println();
    }


    @Override
    public void jumpWall(Robot robot, Human human, Cat cat) {
        System.out.println();
        System.out.println("Препятствие для Спортсменов: " + getName());
        System.out.println();


        robot.jump(this);
        if (high < robot.maxJump) {
            System.out.println(robot.getName() + " совершил прыжок высотой: " + high + " м.");
        } else {
            System.out.println(robot.getName() + " не смог совершить прыжок высотой: " + high + " м.");
        }
        System.out.println();

        human.jump(this);
        if (high < human.maxJump) {
            System.out.println(human.getName() + " совершил прыжок высотой: " + high + " м.");
        } else {
            System.out.println(human.getName() + " не смог совершить прыжок высотой: " + high + " м.");
        }
        System.out.println();

        cat.jump(this);
        if (high < cat.maxJump) {
            System.out.println(cat.getName() + " совершил прыжок высотой: " + high + " м.");
        } else {
            System.out.println(cat.getName() + " не смог совершить прыжок высотой: " + high + " м.");
        }
        System.out.println();

    }
}
