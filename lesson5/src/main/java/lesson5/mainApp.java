package lesson5;


import java.util.Scanner;

public class mainApp {


    public static void main(String[] args) throws Exception {
        int ageFilter = 0;

        Employee[] employeeArray = {
                new Employee("Ivanov Ivan Ivanovich", "office manager", "IvanovII@test.ru", "+79009999991", 1000, 31),
                new Employee("Petrov Petr Petrovich", "manager", "PetrovPP@test.ru", "+79009999992", 2000, 40),
                new Employee("Sidorov Sidr Sidrovich", "Project manager", "SidorovSS@test.ru", "+79009999993", 3000, 33),
                new Employee("Sergeev Sergey Sergeevich", "Head of managers", "SergeevSS@test.ru", "+79009999994", 4000, 42),
                new Employee("Konstantinov Konstantin Konstantinovich", "general manager", "KonstantinovKK@test.ru", "+79009999995", 5000, 35)
        };

        Scanner scanner = new Scanner(System.in);

            do {
                System.out.println("Прошу ввести возраст старше которого вам отфильтровать сотрудников");

                if (scanner.hasNextInt()) {
                    ageFilter = scanner.nextInt();
                    if (ageFilter >0) {
                        break;
                    }
                    System.out.println("Прошу ввести возраст старше которого вам отфильтровать сотрудников");
                    scanner.next();
                }
                } while (!scanner.hasNextInt());

        for (Employee employee : employeeArray) {
            employee.getEmployeeFiltered(employee, ageFilter);
        }



        scanner.close();
    }



}

