/**
 * @author Neil Alishev
 *
 * Дополнительный материал к 7 уроку в курсе про Spring Framework
 *
 * Пример класса, реализующего паттерн Singleton (англ. Одиночка)
 * Можно будет использовать только один объект класса Lesson7Singleton
 */
public class Lesson7Singleton {
    // В этой статической(!) переменной будет хранится единственный объект класса Lesson7Singleton
    private static Lesson7Singleton instance;

    // Скажем, что у нашего единственного объекта должно быть поле value
    private String value;

    // Метод getter для поля value
    public String getValue() {
        return value;
    }

    // ВАЖНО: Конструктор должен быть приватным
    // Мы не хотим, чтобы пользователь мог создавать новые объекты класса Lesson7Singleton
    private Lesson7Singleton(String value) {
        this.value = value;
    }

    // Вот этот статический метод будет вызывать пользователь, чтобы получить объект класса Lesson7Singleton
    public static Lesson7Singleton getInstance(String value) {
        // если ранее не был создан единственный объект
        if (instance == null) {
            // код здесь выполняется только в момент первого вызова метода getInstance()

            // создаем объект один раз
            instance = new Lesson7Singleton(value);
        }

        // все остальные вызовы метода getInstance() пользователю возвращается тот же самый объект
        return instance;
    }
}

// Тестируем
class SingletonTest {
    public static void main(String[] args) {
        Lesson7Singleton first = Lesson7Singleton.getInstance("Hello!");
        Lesson7Singleton second = Lesson7Singleton.getInstance("Goodbye!");

        // true
        System.out.println(first == second);

        // Hello!
        System.out.println(first.getValue());

        // Hello!
        System.out.println(second.getValue());
    }
}