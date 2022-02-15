package HomeWorkApp;

public class Animal {
    String name;
    int appetite;

    public Animal(String name, int appetite) {
        this.appetite = appetite;
        this.name = name;
    }

    public Animal() {

    }


    void run(int lenrun) {
        System.out.println("Животное пробежало " + lenrun);
    }

    void swim(int lenswim) {
        System.out.println("Животное проплыло " + lenswim);

    }
    public static class Plate {
        int food;
        public Plate(int food) {
            this.food = food;
            if(this.food < 0) {
                System.out.println("Нельзя");
            }
        }
        public void decreaseFood(int n) {
            food -= n;
        }

        public void info() {
            System.out.println("тарелка: " + food);
        }

    }

    public static class Cat extends Animal {
        static int countcat;


        @Override
        void swim(int lenswim) {
            System.out.println(name + " не может плавать");
        }

        @Override
        void run(int lenrun) {
            if (lenrun >= 200) {
                System.out.println(name + " не сможет столько пробежать");
            }
            if (lenrun < 200) {
                System.out.println(name + " пробежал " + lenrun);
            }
        }

        public Cat(String name, int appetite) {
            this.name = name;
            this.appetite = appetite;
            countcat++;

        }
        void eat(Plate p) {
            p.decreaseFood(appetite);
        }

        void countcats() {
            System.out.println("Кол-во котов: " + countcat);
        }






            public static class Dog extends Animal {
                static int countdog;

                @Override
                void run(int lenrun) {
                    if (lenrun >= 500) {
                        System.out.println(name + " не сможет столько пробежать");
                    }
                    if (lenrun < 500) {
                        System.out.println(name + " пробежал " + lenrun);
                    }
                }

                @Override
                void swim(int lenrun) {
                    if (lenrun > 10) {
                        System.out.println(name + " не сможет столько проплыть");
                    }
                    if (lenrun <= 10) {
                        System.out.println(name + " проплыл " + lenrun);
                    }
                }

                public Dog(String name) {
                    this.name = name;
                    countdog++;
                }

                void countdogs() {
                    System.out.println("Кол-во собак: " + countdog);
                }

                public static void main(String[] args) {
                    Cat cat = new Cat("Лиза", 10);
                    cat.run(156);
                    cat.swim(65);
                    Dog dog = new Dog("Артем");
                    dog.swim(15);
                    dog.run(10000000);
                    cat.countcats();
                    dog.countdogs();
                    Plate plate = new Plate(50);
                    cat.eat(plate);
                    plate.info();


                }

            }

    }
}
