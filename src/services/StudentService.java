package services;

import domain.PersonComporator;
import domain.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Сервис для работы со студентами
 */
public class StudentService implements iPersonService<Student> {

    /**
     * Поля
     */
    // количество студентов
    private int count;
    // список студентов
    private List<Student> students;

    /**
     * Конструктор
     * без параметров
     * создание пустого списка
     */
    public StudentService() {
        students = new ArrayList<>();
    }

    /**
     * Переопределение методов интерфейса iPersonService
     * @return
     */

    // получение всех студентов
    @Override
    public List<Student> getAll() {
        return students;
    }
    // создание студента (регистрация студента)
    @Override
    public void create(String name, int age) {
        // создание нового студента
        Student student = new Student(name, age);
        // увеличение счетчика
        count++;
        // добавление в список
        students.add(student);
        // сортировка по ФИО
        sortByFIO();
    }

    /**
     * Cортировка по ФИО
     * c помощью обобщенного компоратора PersonComporator
     */
    public void sortByFIO() {
        // создание компоратора для студентов
        PersonComporator<Student> comporator = new PersonComporator<>();
        // сортировка по ФИО
        students.sort(comporator);
    }
}
