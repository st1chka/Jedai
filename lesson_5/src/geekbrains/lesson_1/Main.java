package geekbrains.lesson_1;

public class Main {

    public static void main(String[] args) {
        Employee Иван = new Employee();
        Иван.output();

        Employee[] Person = new Employee[5];
        Person[0] = new Employee("Шубин Юлий Семенович", "Помощник руководителя проекта", "ShubinSem@mail.ru", "+79501451596", "50 000", 35);
        Person[1] = new Employee("Виноградов Велор Альвианович", "Программист Java", "VinoAl@mail.ru", "+79504569872", "32 000", 38);
        Person[2] = new Employee("Фомин Владимир Борисович", "Гейм-дизайнер", "FomiBo@mail.ru", "+79507924684", "46 000", 48);
        Person[3] = new Employee("Щербаков Ян Агафонович", "Гейм-дизайнер", "SherbYa@mail.ru", "+7950164596", "10 000", 19);
        Person[4] = new Employee("Герасимов Агафон Максимович", "Креативный человек", "EtoNePochta@mail.ru", "+76662281488", "228 000", 28);

        for (int i = 0; i < Person.length; i++) {
            Person[i].output();
        }
    }
}