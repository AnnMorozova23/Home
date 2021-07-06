package morozova.oop;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Andrey", "engineer", "andr.com", 26, 1500, "+375291111111");
        Employee employee2 = new Employee("Tory", "accountant", "tory.com", 21, 1400, "+3752911111151");
        employee1.info();
        System.out.println(employee1.getAge());
        employee1.setAge(19);
        System.out.println(employee1.getAge());


        Employee[] persArray = {
                new Employee("Andrey", "engineer", "andr.com", 39, 1500, "+375291111111"),
                new Employee("Tory", "accountant", "tory.com", 45, 1400, "+375291111122"),
                new Employee("Petr", "Chief", "petr.com", 55, 1600, "+375291111133"),
                new Employee("Elena", "secretary", "lena.com", 22, 1300, "+375291111144"),
                new Employee("Artem", "chauffeur", "artem.com", 57, 1400, "+375291111155")
        };
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                System.out.println(persArray[i]);
            }
        }
    }
}
