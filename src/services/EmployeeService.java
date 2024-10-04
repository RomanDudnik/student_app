package services;

import domain.Employee;
import domain.PersonComporator;

import java.util.ArrayList;
import java.util.List;

/**
 * Сервис для работы с сотрудниками
 */
public class EmployeeService implements iPersonService<Employee> {

    /**
     * Поля
     */
    // количество сотрудников
    private int count;
    // список сотрудников
    private List<Employee> employees;

    /**
     * Конструктор
     */
    public EmployeeService() {
        employees = new ArrayList<>();
    }


    /**
     * Переопределение методов интерфейса iPersonService
     * @return
     */

    // получение всех сотрудников
    @Override
    public List<Employee> getAll() {
        return employees;
    }

    // создание сотрудника
    @Override
    public void create(String name, int age) {
        // создание нового сотрудника
        Employee employee = new Employee(name, age, "работник");
        // увеличение счетчика
        count++;
        // добавление в список
        employees.add(employee);
    }

    /**
     * сортировка по ФИО
     * c помощью обобщенного компоратора PersonComporator
     */
    public void sortByFIO() {
        // создание компоратора для сотрудников
        PersonComporator<Employee> comporator = new PersonComporator<>();
        // сортировка по ФИО
        employees.sort(comporator);
    }
}
