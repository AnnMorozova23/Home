package morozova.oop;

public class Employee {
    private String name;
    private String position;
    private String email;
    private int age;
    private int salary;
    private String phone;

    public Employee(String name, String position, String email, int age, int salary, String phone) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.age = age;
        this.salary = salary;
        this.phone = phone;
    }

    public void info() {
        System.out.printf("%s %s %s %d %d %s \n", name, position, email, age, salary, phone);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Возраст должен быть положительным");
            return;
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", phone='" + phone + '\'' +
                '}';
    }
}
