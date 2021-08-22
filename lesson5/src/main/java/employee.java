import java.lang.reflect.Array;
import java.util.Arrays;

public class employee {
    private String person;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public employee (String person, String position, String email, String phone, int salary, int age) {
        this.person = person;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public static void main(String[] args) {
        employee[] employeeArray = {
                new employee("Ivanov Ivan Ivanovich", "office manager", "IvanovII@test.ru", "+79009999991", 1000, 31),
                new employee("Petrov Petr Petrovich", "manager", "PetrovPP@test.ru", "+79009999992", 2000, 40),
                new employee("Sidorov Sidr Sidrovich", "Project manager", "SidorovSS@test.ru", "+79009999993", 3000, 33),
                new employee("Sergeev Sergey Sergeevich", "Head of managers", "SergeevSS@test.ru", "+79009999994", 4000, 42),
                new employee("Konstantinov Konstantin Konstantinovich", "general manager", "KonstantinovKK@test.ru", "+79009999995", 5000, 35)
        };

        for (employee emp: employeeArray)
             {
            printEmployeeOlder40(emp);
        }

    }

    private static void printEmployeeOlder40(employee employee1) {
        if (employee1.age >= 40) {
            System.out.println("Имя сотрудника: " + employee1.person);
            System.out.println("Должность сотрудника: " + employee1.position);
            System.out.println("e-mail: " + employee1.email);
            System.out.println("Телефон сотрудника: " + employee1.phone);
            System.out.println("Зарплата сотрудника: " + employee1.salary);
            System.out.println("Возраст сотрудника: " + employee1.age);
            System.out.println();
        }

    }

}

//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.

