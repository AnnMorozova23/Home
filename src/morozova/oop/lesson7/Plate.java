package morozova.oop.lesson7;

public class Plate {
    protected int food;

    public Plate(int food) {
        this.food = food;
    }

    public void getFood() {
        System.out.println("В тарелке находится: " + food);
    }

    public void setFood(int food) {
        if (food > 0) {
            this.food = food;
        } else {
            System.out.println("Количество еды должно быть положительным!!!");
            System.out.println();
            return;
        }
    }

    public boolean decrease(int amount) {
        if (food > amount) {
            food -= amount;
            return true;
        } else if (food < amount) {
            food = food;
//            System.out.println("Не хватило еды котику");
        }
        return false;
    }

    public boolean plus_food(int amount) {
        if (amount > 0) {
            food += amount;
            return true;
        } else if (amount <= 0) {
            System.out.println(" Количество еды должно быть положительным и не нулевым");
        }
        return false;
    }


    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}


