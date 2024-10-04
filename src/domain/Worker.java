package domain;

/**
 * Промежуточный класс работников
 * для отделения студентов и сотрудников
 */
public class Worker extends Person {
    /**
     * Конструктор
     *
     * @param name
     * @param age
     */
    public Worker(String name, int age) {
        super(name, age);
    }
}
