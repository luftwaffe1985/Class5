//        * 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//        * 2. Конструктор класса должен заполнять эти поля при создании объекта.
//        * 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//        * 4. Создать массив из 5 сотрудников.
//        * 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

public class Lesson5 {

    public static void main(String[] args) {


//        Employee Employee1 = new Employee("Ivanov Ivan", "Manager", "ivanovi@mail.ru", "+79260000000", 60000, 35);
//        Employee Employee2 = new Employee("Sergeev Sergey", "Worker", "sergeevs@mail.ru", "+79155678976", 40000, 40);
//        System.out.println(Employee1.getEmployeeAge());
//        Employee Employee3 = new Employee("Pavlov Pavel", "Worker", "pavlovp@mail.ru", "+79153798514", 40000, 45);
//        Employee Employee4 = new Employee("Petrov Petr", "Worker", "petrovp@mail.ru", "+79155556789", 40000, 29);
//        Employee Employee5 = new Employee("Sidorov Sidor", "Worker", "sidorovs@mail.ru", "+79155556789", 40000, 50);





        Employee[] empArray = new Employee[5];

        empArray[0] = new Employee("Ivanov Ivan", "Manager", "ivanovi@mail.ru", "+79260000000", 60000, 35);
        empArray[1] = new Employee("Sergeev Sergey", "Worker", "sergeevs@mail.ru", "+79155678976", 40000, 40);
        System.out.println(empArray[1].getEmployeeSalary());
        empArray[2] = new Employee("Pavlov Pavel", "Worker", "pavlovp@mail.ru", "+79153798514", 40000, 45);
        empArray[3] = new Employee("Petrov Petr", "Worker", "petrovp@mail.ru", "+79155556789", 40000, 29);
        empArray[4] = new Employee("Sidorov Sidor", "Worker", "sidorovs@mail.ru", "+79155556789", 40000, 50);
        for (int i = 0; i < empArray.length; i++)
            if (empArray[i].getEmployeeAge() > 40) empArray[i].print();




//        employee1.fullName = "Ivanov Ivan";
//        employee1.position = "Manager";
//        employee1.email = "ivanovi@mail.ru";
//        employee1.telNmb = "+79167054466";
//        employee1.salary = 60000;
//        employee1.age = 35;


//        employee2.fullName = "Sergeev Sergey";
//        employee2.age = 40;
//        System.out.println(employee2.fullName + " / " + " Age: " + employee2.age);


    }









}
