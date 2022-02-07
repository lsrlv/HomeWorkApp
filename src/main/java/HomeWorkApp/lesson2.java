package HomeWorkApp;

public class lesson2 {

    public static void main(String[] args) {
        one(1, 25);
        two(7);
        three(9);
        four(7, "help me pls");
        fourr(2015);
        five();
        six();
        seven();
        eight();
        nine(10, 1);
    }

    public static boolean one(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void two(int a) {
        System.out.println("Задание 2:");
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

    }

    public static boolean three(int a) {
        if(a >= 0) {
            return false;
        } else {
            return true;
        }
}

    public static void four(int a, String b) {
        System.out.println("Задание 4:");

        for(int i = 0; i < a; i++) {
            System.out.println(b);
        }

    }

    public static void fourr(int x) {
        System.out.println("Задание 4*: ");
        if (x % 4 == 0 && (x % 100 != 0 || x % 400 == 0)) {
            System.out.println(x + " високосный год");
        } else {
            System.out.println(x + " не високосный год");
        }

    }

    public static void five() {
        System.out.println("Задание 5:");
        int[] l = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for(int x : l) {
            if (x == 1) {
                System.out.print(0);
            }
            if (x == 0) {
                System.out.print(1);
            }
        }

        System.out.println("");
    }

    public static void six() {
        System.out.println("Задание 6:");
        int[] ll = new int[100];

        for(int i = 0; i < 100; i++) {
            ll[i] = i;
            System.out.print(i + " ");
        }

        System.out.println("");
    }

    public static void seven() {
        System.out.println("Задание 7:");
        int[] kk = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int x : kk) {
            if (x < 6) {
                x *= 2;
            }
            System.out.print(x + " ");
        }
        System.out.println("");
    }

    public static void eight() {
        System.out.println("Задание 8:");
        int[][] arr = new int[3][3];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if ((i + j) % 2 == 0) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }

                System.out.print(arr[i][j]);
            }

            System.out.println();
        }

    }

    public static void nine(int len, int Value) {
        System.out.println("Задание 9:");
        int[] x = new int[len];
        for(int i = 0; i < len; i++) {
            System.out.print(Value);
        }

    }
}