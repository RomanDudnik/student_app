package services;

import domain.PersonComporator;
import domain.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements iPersonService<Teacher> {

    /**
     * Поля
     */
    // Количество учителей
    private int count;
    // Список учителей
    private List<Teacher> teachers;

    /**
     * Конструктор
     * без параметров
     * создание пустого списка
     */
    public TeacherService() {
        teachers = new ArrayList<>();
    }

    /**
     * Переопределение методов интерфейса iPersonService
     * @return
     */
    // получение списка учителей
    @Override
    public List<Teacher> getAll() {
        return teachers;
    }
    // создание учителя
    @Override
    public void create(String name, int age) {
        // создание нового учителя
        Teacher teacher = new Teacher(name, age, "учитель");
        // увеличение счетчика
        count++;
        // добавление в список
        teachers.add(teacher);
        // сортировка по ФИО
        sortByFIO();
    }

    /**
     * Cортировка по ФИО
     * c помощью обобщенного компоратора PersonComporator
     */
    public void sortByFIO() {
        // создание компоратора для учителей
        PersonComporator<Teacher> comporator = new PersonComporator<>();
        // сортировка по ФИО
        teachers.sort(comporator);
    }


}
