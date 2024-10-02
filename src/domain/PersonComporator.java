package domain;

import java.util.Comparator;

/**
 * Класс компоратора (обобщенных типов)
 * Для сравнения всех сущностей типа Person
 * обобщенный компоратор
 * @param <T>
 */

public class PersonComporator<T extends Person> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        int result = o1.getName().compareTo(o2.getName());
        if (result == 0) {
            return 0;
        } else {
            return result;
        }
    }
}
