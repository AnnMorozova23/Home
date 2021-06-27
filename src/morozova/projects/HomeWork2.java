package morozova.projects;

public class HomeWork2 {
    public static void main(String[] args) {
        int[] num = {0, 1, 1, 0, 0, 0, 1, 1};
        int[] num2 = {10, 4, 5, 8, 12, 0, 1, 32};
        int[] arr1 = {1, 0, 4, 5, 4};
        System.out.println("Просто вывожу массив");
        PrintArr(num);
        System.out.println();
        System.out.println("Меняю 0 на 1 и 1 на 0");
        ChangNumbers(num);
        System.out.println();
        System.out.println("Некая закономерность");
        ProgressionNumbers(5);
        System.out.println();
        System.out.println("Умножаю на 2 все элементы меньше 6");
        MultyNumbers(num2);
        System.out.println();
        System.out.println("Вывожу на экран матрицу с элементами главной диагонали 1 ");
        MainDiagonal(5);
        System.out.println("Вывожу на экран матрицу с элементами побочной диагонали 1");
        SideDiagonal(6);
        System.out.println(MaxElement(num2) + " Максимальный элемент массива");
        System.out.println(MinElement(num2) + " Минимальный элемент массива");

    }


    public static void PrintArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void ChangNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void ProgressionNumbers(int step) {
        int[] arrStep = new int[8];
        for (int i = 0; i < arrStep.length; i++) {
            if (i == 0) {
                arrStep[i] = 0;
            } else if (i > 0) {
                arrStep[i] = arrStep[i - 1] + step;
            }
            System.out.print(arrStep[i] + " ");
        }
        System.out.println();
    }

    public static void MultyNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void MainDiagonal(int size) {
        int[][] matrica = new int[size][size];
        int i;
        int j;
        for (i = 0; i < matrica.length; i++) {
            for (j = 0; j < matrica.length; j++) {
                if (i == j) {
                    matrica[i][j] = 1;
                } else {
                    matrica[i][j] = 0;
                }
                System.out.print(matrica[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void SideDiagonal(int size) {
        int[][] matrica = new int[size][size];
        int i;
        int j;
        for (i = 0; i < matrica.length; i++) {
            for (j = 0; j < matrica.length; j++) {
                if (i + j == matrica.length - 1) {
                    matrica[i][j] = 1;
                } else {
                    matrica[i][j] = 0;
                }
                System.out.print(matrica[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int MaxElement(int[] arr) {
        int max = 0;
        arr[0] = max;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int MinElement(int[] arr) {
        int min = 0;
        arr[0] = min;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int ArrSum(int[] arr) {
        int l = arr.length;
        int[] sum1 = new int[l];
        int count = 0;
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            count = arr[i] + count;
            sum1[i] = count;
//            System.out.print(sum1[i]+ " ");
        }
        return sum1[i];
    }

    public static int ArrSum2(int[] arr) {
        int l = arr.length;
        int[] sum2 = new int[l];
        int count = 0;
        int i = 0;
        for (i = (arr.length) - 1; i >= 0; i--) {
            count = arr[i] + count;
            sum2[i] = count;
            return sum2[i];
//            System.out.print(sum2[i]+ " ");
        }
        return sum2[i];
    }

//    public static boolean CheckBalance(int[] arr2) {
//        System.out.println(ArrSum(arr2));
//        System.out.println(ArrSum2(arr2));
////        for (int i = 0; i < arr2.length; i++) {
////            if (sum[i]==sum2[i])
////
////        }
//    }

}

