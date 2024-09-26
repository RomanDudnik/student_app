import domain.Student;
import domain.StudentGroup;

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


//        // Вывод на консоль
//        System.out.println(student1);
//        System.out.println(student2);
//        System.out.println(student3);

        // Создание списка студентов
        List<Student> listStudents = new ArrayList<>();
        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);
        listStudents.add(student4);
        listStudents.add(student5);

        // Создание группы
        StudentGroup studentGroup = new StudentGroup(listStudents, 1);

        // Вывод на консоль
        for (Student student : studentGroup) {
            System.out.println(student);
        }

        System.out.println("\n" + "Сортировка:" + "\n");

        // Сортировка
        Collections.sort(studentGroup.getListStudents());

        // Вывод на консоль после сортировки
        for (Student student : studentGroup) {
            System.out.println(student);
        }
    }
}