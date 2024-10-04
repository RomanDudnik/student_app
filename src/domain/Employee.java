package domain;

/**
 * Класс сотрудник
 */
public class Employee extends Worker {

    /**
     * Поле
     * Специальность
     */
    private String special;

    /**
     * Конструктор
     * @param name
     * @param age
     * @param special
     */
    public Employee(String name, int age, String special) {
        super(name, age);
        this.special = special;
    }
}
