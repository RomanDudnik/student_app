package domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Класс группы студентов
 * Имплементирует интерфейс Iterable
 * Для перебора студентов (делаем класс итерируемым)
 */
public class StudentGroup implements Iterable<Student> {

    /**
     * Поля
     */

    // Список студентов
    private List<Student> listStudents = new ArrayList<>();

    private int id;

    /**
     * Конструктор
     * @param listStudents
     * @param id
     */
    public StudentGroup(List<Student> listStudents, int id) {
        this.listStudents = listStudents;
        this.id = id;
    }

    /**
     * Геттеры и сеттеры
     * @return
     */

    public List<Student> getListStudents() {
        return listStudents;
    }

    public void setListStudents(List<Student> listStudents) {
        this.listStudents = listStudents;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    /**
     * Переопределение метода toString
     * @return
     */
    @Override
    public String toString() {
        return "StudentGroup{" +
                "listStudents=" + listStudents +
                ", id=" + id +
                '}';
    }

    /**
     * Переопределение метода iterator
     * для перебора студентов
     * @return
     */
    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(listStudents);
    }
}
