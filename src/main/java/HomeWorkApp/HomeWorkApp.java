package HomeWorkApp;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }
    public static void printThreeWords() {
        System.out.println("Задание 2:");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }
    public static void checkSumSign() {
        System.out.println("Задание 3:");
        int a = 1;
        int b = 2;
        int c = a + b;
        if(c >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        System.out.println("Задание 4:");
        int value = 130;
        if(value<=0) {
            System.out.println("Красный");
            System.out.println("Красный");
        }
        if(value>0 && value<=100) {
            System.out.println("Желтый");
        }
        if(value>100) {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        System.out.println("Задание 5:");
        int a = 999;
        int b = 666;
        if(a>=b) {
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }
    }
}
