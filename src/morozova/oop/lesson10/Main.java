package morozova.oop.lesson10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] str = {"Ваня", "Петя", "Аня", "Саша", "Юля", "Ваня", "Катя", "Саня", "Женя",
                "Рута", "Света", "Галя", "Ваня", "Таня", "Петя", "Аня", "Саша", "Юля", "Ваня",
                "Света", "Галя", "Ваня", "Таня", "Петя", "Аня"};
        System.out.println("Массив Имен: ");
        System.out.println(Arrays.toString(str));
        System.out.println();

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            map.put(str[i], map.getOrDefault(str[i], 0) + 1);
        }
        System.out.println("Имя - количество повторений в массиве");
        System.out.println(map);
        System.out.println();
        System.out.println("Массив уникальных слов:");
        System.out.println(map.keySet());
        System.out.println();
        telephone();
    }

    public static void telephone() {

        Map<String, List<String>> mapTelephone2 = new HashMap<>();

        List<String> telephoneMorozova = new ArrayList<>();
        telephoneMorozova.add("+375449638874");

        List<String> telephoneIvanov = new ArrayList<>();
        telephoneIvanov.add("+375996331254");
        telephoneIvanov.add("+375112365877");

        List<String> telephonePetrov = new ArrayList<>();
        telephonePetrov.add("+375445558555");
        telephonePetrov.add("+375444558556");
        telephonePetrov.add("+375443558557");

        List<String> telephoneLevkin = new ArrayList<>();
        telephoneLevkin.add("+375338594441");


        mapTelephone2.put("Morozova", telephoneMorozova);
        mapTelephone2.put("Ivanov", telephoneIvanov);
        mapTelephone2.put("Petrov", telephonePetrov);
        mapTelephone2.put("Levkin", telephoneLevkin);

        System.out.println();
        mapTelephone2.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println();
        System.out.println("Запрос телефона по фамилии: Ivanov ");
        System.out.println(mapTelephone2.get("Ivanov"));
        System.out.println();
        System.out.println("Запрос телефона по фамилии: Morozova ");
        System.out.println(mapTelephone2.get("Morozova"));
        System.out.println();
        System.out.println("Запрос телефона по фамилии: Petrov ");
        System.out.println(mapTelephone2.get("Petrov"));
    }
}
