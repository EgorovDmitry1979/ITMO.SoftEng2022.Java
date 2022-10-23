package Lab3.Ex1;

// Допишите в класс «Study» конструктор, что будет принимать один параметр и будет устанавливать
// значение этого параметра в поле «course». Создайте объект класса «Study». В качестве значения
// для поля «course» установите текст: «Изучение Java - это просто!».
// Обратитесь к методу «printCourse» для вывода значения поля «course».

public class Study {
    private final String course; // поле для конструктора

    // Конструктор с одним параметром
    public Study(String course) {
        this.course = course; // инициализация парамертов в конструкторе
    }

    // Метод для вывода значения course (его передаем в main)
    public String printCourse() {
        return this.course;
    }
}
