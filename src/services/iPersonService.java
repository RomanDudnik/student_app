package services;

import java.util.List;

/**
 * Обобщенный интерфейс(iGeneric) для сервиса
 * @param <T>
 */
public interface iPersonService<T> {

    /**
     * Получение всех сущностей
     * @return
     */
    List<T> getAll();

    /**
     * Создание сущности (регистрация сотрудника)
     * @param name
     * @param age
     */
    void create(String name, int age);
}
