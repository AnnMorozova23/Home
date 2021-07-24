package morozova.oop.lesson9;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    static int SIZE = 4;

    public static void main(String[] args) {


        String[][] str = {
                {"1", "5", "0", "4"},
                {"0", "0", "0", "0"},
                {"0", "0", "5", "0"},
                {"0", "0", "0", "5"}
        };
        int i = 0;
        int j = 0;

        int x = str.length;
        if (str.length != SIZE) {
            throw new MayArraySizeException("Неверный размер массива: " + x + " на " + x, x);
        }
        for (i = 0; i < str.length; i++) {
            for (j = 0; j < str.length; j++) {
                if (str[j].length != SIZE) {
                    throw new MayArraySizeException("Неверный размер массива: количество знаков в строке " + j, j);
                }
            }
        }

        check(str);
    }


    public static void check(String Array[][]) throws MyArrayDataException, MayArraySizeException {
        int x = Array.length;
        if (Array.length != SIZE) {
            throw new MayArraySizeException("Неверный размер массива: " + x + " на " + x, x);
        }
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array.length; j++) {
                if (Array[j].length != SIZE) {
                    throw new MayArraySizeException("Неверный размер массива: количество знаков в строке " + j, j);
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array.length; j++) {
                try {
                    sum += Integer.parseInt(Array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверный формат числа "+ "в строке " + i + " столбец " +j,i);
                }

            }

        }
        System.out.println("Сумма всех элементов массива равна: " + sum);
    }
}







