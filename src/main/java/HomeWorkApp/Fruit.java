package HomeWorkApp;
import java.util.List;
import java.util.ArrayList;
// не понимаю до конца тему, поэтому нет 5 и 6 заданий, извините т.т (стараюсь разобраться))
abstract class Fruit {
    private double weight;

    public Fruit(double weight) {

        this.weight = weight;
    }
    public double getWeight() {

        return weight;
    }
}
class Apple extends Fruit {
    public Apple() {
        super(1);
    }
}

class Orange extends Fruit {
    public Orange() {
        super(1.5);
    }
}


class Box<T extends Fruit> {
    private List<T> fruitList;

    private double totalWeight;

    public Box() {
        this.fruitList = new ArrayList<>();

    }

    public void addFruit(T fruit) {
        fruitList.add(fruit);

        totalWeight = totalWeight + fruit.getWeight();
    }

    public double getTotalWeight() {

        return totalWeight;
    }

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box();
        Box<Orange> orangeBox = new Box();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        System.out.println(appleBox.getTotalWeight() + " вес яблок в корзине");
        Box<Fruit> fruitBox = new Box();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        System.out.println(orangeBox.getTotalWeight() + "  вес апельсинов в корзине");
    }

    }
