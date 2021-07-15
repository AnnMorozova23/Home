package morozova.oop.lesson7;

public class Cat {
    private String name;
    private int satiety; // показатель сытости каждого кота

    public Cat(String name, int satiety) {
        this.name = name;
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public boolean eat(Plate plate) {
        if (satiety < plate.food) {
            System.out.println("Котик " + name + " кушает");
            plate.decrease(satiety);
            System.out.println("Котик " + name + " Сыт");
            return true;
        } else {
            System.out.println("Котик " + name + " не смог поесть. " + name + " остался голодным");
            return false;
        }
    }

    public void sleep() {
        System.out.println(name + " спит....");
    }

}
