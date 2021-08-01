package morozova.oop.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxWithFruits<T extends Fruit> {
    private List<T> list;

    public BoxWithFruits() {
        this.list = new ArrayList<>();
    }

    public BoxWithFruits(T... fruit) {
        this.list = new ArrayList(Arrays.asList(fruit));
    }

    public void addF(T fruit){
        list.add(fruit);

    }

    public boolean compareBox(BoxWithFruits<?> some){
        return Math.abs(this.getWeight() - some.getWeight())<0.001;
    }

    public void swapBox(BoxWithFruits<T> some){
        if(some == this.list){
            return;
        }
        some.list.addAll(this.list);
        this.list.clear();

    }
    public List<T> getList() {
        return list;
    }


    public float getWeight() {
        float weight = 0.0f;
        for (T fruit: list) {
            weight = weight + fruit.getWeight();
        }
        return weight;
    }

}
