package HomeWorkApp;

public class exs {


    public static void main(String[] args) {

        String[][] arr = new String[][]{{"1", "2", "3", "4"}, {"2", "2", "2", "3"}, {"1", "2", "2", "2"}, {"2", "2", "2", "2"}};
        try {
            try {
                int result = method(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива превышен");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Неправильное значение");
            System.out.println("Ошибка в ячейке");
        }

    }
    static class CustomException extends Exception {
        CustomException(String message) {
            super(message);
        }
    }

    static class MyArrayDataException extends CustomException {

        MyArrayDataException(int row, int col) {
            super(String.format("Неверные данные находятся в ячейке", row, col));
        }
    }

    static class MyArraySizeException extends CustomException {

        MyArraySizeException() {
            super("Размерность массива должна быть 4 x 4");
        }
    }
    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }



}
