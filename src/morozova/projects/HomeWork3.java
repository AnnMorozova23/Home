package morozova.projects;

import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class HomeWork3 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("Мы загадали число от 0 до 9. Ваша задача отгадать число.У Вас 3 попытки. Поехали!\n");
//        checkAnswer();
//        int level = 250;
//        PlayAgain(level);
        guessWord();
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

    public static void guessWord(){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int secret = (int) (Math.random()*words.length);
        System.out.println(secret);
        System.out.println(words[secret]);
        System.out.println("Input Guess Word:");

        while (true){
            System.out.println("input word");
            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine();
            if(answer.equals(words[secret])){
                System.out.println("Yes");
                break;
            }else{
                for (int i = 0; i < 15; i++) {
                    if(i<words[secret].length()&& i< answer.length()&& answer.charAt(i)==words[secret].charAt(i)){
                        System.out.print(answer.charAt(i));
                    }else {
                        System.out.print("#");
                    }

                }
            }
        }

    }
}
