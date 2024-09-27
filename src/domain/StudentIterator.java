package domain;

import java.util.Iterator;
import java.util.List;

/**
 * Класс итератора
 * Для методов перебора
 * hasNext() и next()
 */
public class StudentIterator implements Iterator<Student> {


    /**
     * Поля
     * для реализации итератора
     */

    // Счетчик
    private int count;

    // Итерируемый список
    private List<Student> listStudents;

    /**
     * Конструктор
     * для получения итерируемого списка
     * @param listStudents
     */
    public StudentIterator(List<Student> listStudents) {
        this.listStudents = listStudents;
    }

    /**
     * Переопределение метода hasNext
     * @return
     */
    @Override
    public boolean hasNext() {
        // Проверка наличия следующего элемента
        return count < listStudents.size();
    }

    /**
     * Переопределение метода next
     * @return
     */
    @Override
    public Student next() {
        // Переход к следующему элементу
        return listStudents.get(count++);
    }
}
