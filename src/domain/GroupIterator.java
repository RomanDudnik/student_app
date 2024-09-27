package domain;

import java.util.Iterator;
import java.util.List;

/**
 * Класс итератора для перебора групп студентов. Имплементирует интерфейс Iterator *
 */
public class GroupIterator implements Iterator<StudentGroup> {

    /**
     * Поля
     * для реализации итератора
     */
    // Счетчик
    private int count;
    // Итерируемый список групп студентов
    private List<StudentGroup> listStudentGroups;

    /**
     * Конструктор
     * @param listStudentGroups
     */
    public GroupIterator(List<StudentGroup> listStudentGroups) {
        this.listStudentGroups = listStudentGroups;
    }

    /**
     * Переопределение метода hasNext
     * @return
     */
    @Override
    public boolean hasNext() {
        // Проверка наличия следующего элемента в списке
        return count < listStudentGroups.size();
    }

    /**
     * Переопределение метода next
     * @return
     */
    @Override
    public StudentGroup next() {
        // Переход к следующему элементу
        return listStudentGroups.get(count++);
    }
}
