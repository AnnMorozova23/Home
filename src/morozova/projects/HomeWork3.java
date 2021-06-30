package morozova.projects;

import java.util.Scanner;

public class HomeWork3 {

    public static void main(String[] args) {
        System.out.println("Мы загадали число от 0 до 9. Ваша задача отгадать число.У Вас 3 попытки. Поехали!\n");
        checkAnswer();
        int level = 150;
        PlayAgain(level);
    }

    public static void PlayAgain(int level) {
        for (int i = 0; i <= level; i++) {
            System.out.println("Хотите сыграть еще раз? Есди да, введите 1, Если нет - 0");
            Scanner sc = new Scanner(System.in);
            int b = sc.nextInt();
            if (b == 1) {
                checkAnswer();
            } else if (b == 0) {
                System.out.println("Конец игры!");
                break;
            }
        }
    }


    public static void checkAnswer() {
        int trueAnswer = (int) (Math.random() * 10);
        System.out.println("Попытка № 1. Введите число:");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int count = 2;
        while (b >= 0) {
            if (b == trueAnswer) {
                System.out.println("Вы угадали! Поздравляем");
                break;
            } else if (b > trueAnswer) {
                System.out.println("Загаданное число меньше, попробуйте еще раз. Попытка №" + count + "\n" +
                        "Введите число");
                b = sc.nextInt();
            } else if (b < trueAnswer) {
                System.out.println("Загаданное число больше, попробуйте еще раз.Попытка №" + count + "\n" +
                        "Введите число");
                b = sc.nextInt();
            }
            count++;
            if (count > 4) {
                System.out.println("Вы не угадали.Количество попыток исчерпано. Игра окончена");
                break;
            }
        }
    }
}
