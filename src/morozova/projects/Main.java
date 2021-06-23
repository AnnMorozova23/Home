package morozova.projects;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hey! Start doing HomeWork! ");
        // Задание №2: создать и инициализировать все типы данных
        byte a = 10;
        short b = 11000;
        int c = 122000;
        long d = 1500000L;
        float e = 10.20f;
        double f = -123.1515;
        char g = '\u0000';
        boolean l = true;
        System.out.println(getTask3(3.4444f, 5.4987f, 1.477693f, 0, 45787f));
        System.out.println(getTask4(7,7));
        getTask5(5);
        System.out.println(getTask6(5));
        getTask7("Tory");
        getTask8(104);


    }

    public static float getTask3(float v, float a, float b, float c, float d) {
        float result = a * (b + (c / d));
        return (result);
    }

    public static boolean getTask4(int a, int b){
        if (a+b>=10 && a+b<=20){
            return true;
        }else {
            return false;
        }
    }

    public static void getTask5(int a){
        if(a>=0){
            System.out.println("Вы ввели положительное число");
        }else {
            System.out.println("Вы ввели отрицательное число");
        }
    }

    public static boolean getTask6(int a){
        if(a>=0){
            return false;
        }else {
            return true;
        }

    }
    public static void getTask7(String name){
        System.out.println("Hello, " + name + "!");
    }

    public static void getTask8(int a){
        if(a%4 == 0){
            System.out.println(a + " - Високосный год");
        }else if(a%100 == 0){
            System.out.println(a + " - Не високосный год");
        }else if(a%400 == 0){
            System.out.println(a + " - Високосный год");
        }else {
            System.out.println(a + " - Не високосный год");
        }
    }
}
