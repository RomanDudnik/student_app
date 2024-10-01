package domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Класс группы студентов
 * Имплементирует интерфейс Iterable
 * Для перебора студентов (делаем класс итерируемым)
 */
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup>{

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
        return "StudentGroup: " +
                "id=" + id +
                " amount students=" + listStudents.size() + " \n" +
                " listStudents: " + " \n" + listStudents +
                '}' + "\n";
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

    /**
     * Переопределение метода compareTo
     * Сортировка по количеству студентов в группе
     * затем по идентификатору
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(StudentGroup o) {
//        return Integer.compare(this.listStudents.size(), o.listStudents.size());

        // Сортировка по количеству студентов
        if (o.listStudents.size() > this.listStudents.size()) {
            return -1;
        }

        if (o.listStudents.size() < this.listStudents.size()) {
            return 1;
        }

        // Сортировка по идентификатору
        return Integer.compare(this.getId(), o.getId());
    }
}
