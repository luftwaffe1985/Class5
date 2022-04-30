//        * 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//        * 2. Конструктор класса должен заполнять эти поля при создании объекта.
//        * 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//        * 4. Создать массив из 5 сотрудников.
//        * 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

 class Employee {
      String fullName;
     private String position;
     private String email;
     private String telNmb;
     private int salary;
     private int age;

//    public Employee() {
//        fullName = "Ivanov Ivan";
//        position = "Manager";
//        email = "ivanovi@mail.ru";
//        telNmb = "+79167054466";
//        salary = 60000;
//        age = 35;
//    }

    public Employee(String fullName,String position, String email, String telNmb, int salary, int age) {
    this.fullName = fullName;
    this.position = position;
    this.email = email;
    this.telNmb = telNmb;
    this.salary = salary;
    this.age = age;
    }

    int getEmployeeSalary() {
        return salary;
    }
    int getEmployeeAge() {
         return age;
     }
     public void print(){
         System.out.println(this.fullName);
     }



}
