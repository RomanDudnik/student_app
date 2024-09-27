package domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Класс потока групп студентов
 * Имплементирует интерфейс Iterable
 * Для перебора групп
 */
public class StudentSteam implements Iterable<StudentGroup> {

    /**
     * Поля
     */

    // идентификатор потока
    private int id;

    // список групп в потоке
    private List<StudentGroup> listStudentGroups = new ArrayList<>();

    /**
     * Конструктор
     * @param listStudentGroups
     */
    public StudentSteam(List<StudentGroup> listStudentGroups, int id) {
        this.listStudentGroups = listStudentGroups;
        this.id = id;
    }

    /**
     * Геттеры и сеттеры
     * @return
     */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<StudentGroup> getListStudentGroups() {
        return listStudentGroups;
    }

    public void setListStudentGroups(List<StudentGroup> listStudentGroups) {
        this.listStudentGroups = listStudentGroups;
    }

    /**
     * Переопределение метода toString
     * @return
     */
    @Override
    public String toString() {
        return "StudentSteam: " +
                "id=" + id +
                " listStudentGroups: " + " \n" + listStudentGroups +
                '}';
    }

    /**
     * Переопределение метода iterator
     * для перебора групп студентов
     * @return
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupIterator(listStudentGroups);
    }
}
