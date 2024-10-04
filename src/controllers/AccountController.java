package controllers;

import domain.Worker;

/**
 * Класс контроллер
 */
public class AccountController {
    /**
     * Generic метод выплаты зарплаты
     * @param person
     * @param salary
     * @param <T>
     * @param <V>
     */
    public <T extends Worker, V> void paySalary(T person, V salary) {
        System.out.println(person.getName() + " выплата зарплаты: " + salary);
    }
}
