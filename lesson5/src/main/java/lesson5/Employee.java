package lesson5;

import java.lang.reflect.Array;

public class Employee {
    private String person;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String person, String position, String email, String phone, int salary, int age) {
        this.person = person;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }


    protected void getEmployeeFiltered(Employee employee, int ageFilter) {
        if (employee.age >= ageFilter) {
            printEmployeeFiltered(employee);
//            return employee;
//        else return null;
        }
    }

    protected void printEmployeeFiltered(Employee employee) {
            System.out.println("Имя сотрудника: " + employee.person);
            System.out.println("Должность сотрудника: " + employee.position);
            System.out.println("e-mail: " + employee.email);
            System.out.println("Телефон сотрудника: " + employee.phone);
            System.out.println("Зарплата сотрудника: " + employee.salary);
            System.out.println("Возраст сотрудника: " + employee.age);
            System.out.println();
    }


//    public String ToString(Employee employee) {
//        if (employee != null) {
//            return "Employee{" + "age" + age + "}";
//        }
//        return null;
//    }

}

//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.

