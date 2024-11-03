import controllers.AccountController;
import domain.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Основная программа
 */
public class StudentApp {
    public static void main(String[] args) {

        // Создание студентов
        Student student1 = new Student("Ivan", 19);
        Student student2 = new Student("Sergey", 20);
        Student student3 = new Student("Petr", 19);
        Student student4 = new Student("Lena", 25);
        Student student5 = new Student("Alina", 19);
        Student student6 = new Student("Alex", 20);
        Student student7 = new Student("Vova", 19);
        Student student8 = new Student("Sveta", 25);
        Student student9 = new Student("Dima", 19);
        Student student10 = new Student("Masha", 20);


//        // Вывод на консоль
//        System.out.println(student1);
//        System.out.println(student2);
//        System.out.println(student3);

        // Создание списков студентов
        // 1
        List<Student> listStudents1 = new ArrayList<>();
        listStudents1.add(student1);
        listStudents1.add(student2);
        listStudents1.add(student3);
        listStudents1.add(student4);

        //2
        List<Student> listStudents2 = new ArrayList<>();
        listStudents2.add(student5);
        listStudents2.add(student6);
        listStudents2.add(student7);

        //3
        List<Student> listStudents3 = new ArrayList<>();
        listStudents3.add(student8);
        listStudents3.add(student9);
        listStudents3.add(student10);

        // Создание группы
        // 1
        StudentGroup studentGroup1 = new StudentGroup(listStudents1, 1);

        System.out.println("\n" + "Группа 1:" + "\n");

        // Вывод на консоль
        for (Student student : studentGroup1) {
            System.out.println(student);
        }

        System.out.println("\n" + "Сортировка:" + "\n");

        // Сортировка
        Collections.sort(studentGroup1.getListStudents());

        // Вывод на консоль после сортировки
        for (Student student : studentGroup1) {
            System.out.println(student);
        }

        // Создание группы
        // 2
        StudentGroup studentGroup2 = new StudentGroup(listStudents2, 2);

        System.out.println("\n" + "Группа 2:" + "\n");

        // Вывод на консоль
        for (Student student : studentGroup2) {
            System.out.println(student);
        }

        System.out.println("\n" + "Сортировка:" + "\n");

        // Сортировка
        Collections.sort(studentGroup2.getListStudents());

        // Вывод на консоль после сортировки
        for (Student student : studentGroup2) {
            System.out.println(student);
        }

        // Создание группы
        //3
        StudentGroup studentGroup3 = new StudentGroup(listStudents3, 3);

        System.out.println("\n" + "Группа 3:" + "\n");

        // Вывод на консоль
        for (Student student : studentGroup3) {
            System.out.println(student);
        }

        System.out.println("\n" + "Сортировка:" + "\n");

        // Сортировка
        Collections.sort(studentGroup3.getListStudents());

        // Вывод на консоль после сортировки
        for (Student student : studentGroup3) {
            System.out.println(student);
        }


        // Создание потока групп
        // 1
        StudentSteam studentSteam = new StudentSteam(List.of(studentGroup1, studentGroup2, studentGroup3), 1);

        System.out.println("\n" + "Поток студентов:" + "\n");

        // Вывод на консоль потока
        System.out.println(studentSteam);

        System.out.println("\n" + "Сортировка:" + "\n");

        // Сортировка потока
        /**
         * Использование `ArrayList` для создания нового списка на основе
         * элементов полученного списка `studentGroupsList` гарантирует,
         * что новый список будет модифицируемым. Это позволяет успешно
         * сортировать его с помощью `Collections.sort()`
         */
        List<StudentGroup> studentGroupsList = new ArrayList<>(studentSteam.getListStudentGroups());

        // Сортировка
        Collections.sort(studentGroupsList);

        // Вывод на консоль потока после сортировки
        System.out.println(studentSteam);

        // Создание учителя
        Teacher teacher1 = new Teacher("Иванов И.И.", 50, "Доцент");
        // Создание сотрудника
        Employee employee1 = new Employee("Петров П.П.", 35, "Дворник");

        // Создание контроллера
        AccountController controller = new AccountController();
        // Оплата зарплат
        controller.paySalary(teacher1, 50000);
        controller.paySalary(employee1, 25000);

        // Средний возраст студентов
        System.out.println("\n" + "Средний возраст студентов:" + "\n");
        System.out.println(controller.averageAge(studentGroup1.getListStudents()));
        System.out.println(controller.averageAge(studentGroup2.getListStudents()));
        System.out.println(controller.averageAge(studentGroup3.getListStudents()));
    }
}