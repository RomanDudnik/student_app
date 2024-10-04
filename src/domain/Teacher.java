package domain;

/**
 * Класс учитель
 */
public class Teacher extends Worker {

    /**
     * Поле
     * Ученая степень
     */
    private String academicDegree;

    /**
     * Конструктор
     * @param name
     * @param age
     * @param academicDegree
     */
    public Teacher(String name, int age, String academicDegree) {
        super(name, age);
        this.academicDegree = academicDegree;
    }

}
