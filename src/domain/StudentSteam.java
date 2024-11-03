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
    private List<StudentGroup> studentSteam;

    /**
     * Конструктор
     * @param listStudentGroups
     */
    public StudentSteam(List<StudentGroup> listStudentGroups, int id) {
        this.studentSteam = listStudentGroups;
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
        return studentSteam;
    }

    public void setListStudentGroups(List<StudentGroup> listStudentGroups) {
        this.studentSteam = listStudentGroups;
    }

    /**
     * Переопределение метода toString
     * @return
     */
    @Override
    public String toString() {
        return "StudentSteam: " +
                "id=" + id + " amount groups=" + studentSteam.size() +
                " studentSteam: " + " \n" + studentSteam +
                '}';
    }

    /**
     * Переопределение метода iterator
     * для перебора групп студентов
     * @return
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupIterator(studentSteam);
    }
}
