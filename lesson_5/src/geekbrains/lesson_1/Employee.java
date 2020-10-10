package geekbrains.lesson_1;

public class Employee {

    String FIO;
    String positon;
    String mail;
    String number;
    String salary;
    int age;

    String[] Person = new String[5];

    Employee() {
        FIO = "Иван Петрович Замалеев";
        positon = "Руководитель проекта";
        mail = "IvanZam@mail.ru";
        number = "+79507536";
        salary = "50 000";
        age = 42;
    }


//    Новые сотрудники

    Employee(String FIO, String positon, String mail, String number, String salary, int age) {

        this.FIO = FIO;
        this.positon = positon;
        this.mail = mail;
        this.number = number;
        this.salary = salary;
        this.age = age;

    }

    public void output() {
        if (age > 40) {
            System.out.println(
                    "ФИО: " + FIO + "\n" +
                    "Должность: " + positon + "\n" +
                    "Почта: " + mail + "\n" +
                    "Номер телефона: " + number + "\n" +
                    "Зароботная плата " + salary + " Рублей" + "\n" +
                    "Возраст: " + age + "\n");
        }

    }
}
