import PhoneDirectory.PhoneDirectory;
import Students.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class InitialList {

    //Новый список для первого задания
    public  static ArrayList<Student> setStudents() {
        return new ArrayList<>(List.<Student>of(
                // Курс 1
                new Student("Алексей Иванов", "Группа А-101", 1,
                        Map.ofEntries(
                                Map.entry("Математика", 4.5),
                                Map.entry("Физика", 4.2),
                                Map.entry("Программирование", 5.0),
                                Map.entry("Английский", 4.0)
                        )),

                new Student("Мария Петрова", "Группа А-101", 1,
                        Map.ofEntries(
                                Map.entry("Математика", 3.8),
                                Map.entry("Физика", 3.5),
                                Map.entry("Программирование", 3.2),
                                Map.entry("Английский", 4.5)
                        )),

                new Student("Дмитрий Сидоров", "Группа А-101", 1,
                        Map.ofEntries(
                                Map.entry("Математика", 2.5),
                                Map.entry("Физика", 2.8),
                                Map.entry("Программирование", 3.0),
                                Map.entry("Английский", 3.0)
                        )),

                // Курс 2
                new Student("Елена Смирнова", "Группа Б-202", 2,
                        Map.ofEntries(
                                Map.entry("Математика", 4.9),
                                Map.entry("Физика", 4.8),
                                Map.entry("Программирование", 5.0),
                                Map.entry("Базы данных", 4.7)
                        )),

                new Student("Павел Козлов", "Группа Б-202", 2,
                        Map.ofEntries(
                                Map.entry("Математика", 4.5),
                                Map.entry("Физика", 4.0),
                                Map.entry("Программирование", 4.8),
                                Map.entry("Базы данных", 4.2)
                        )),

                new Student("Анна Новикова", "Группа Б-202", 2,
                        Map.ofEntries(
                                Map.entry("Математика", 3.0),
                                Map.entry("Физика", 3.2),
                                Map.entry("Программирование", 3.5),
                                Map.entry("Базы данных", 3.0)
                        )),

                // Курс 3
                new Student("Сергей Морозов", "Группа В-303", 3,
                        Map.ofEntries(
                                Map.entry("Алгоритмы", 3.5),
                                Map.entry("ООП", 3.8),
                                Map.entry("Сети", 3.2),
                                Map.entry("Операционные системы", 3.0)
                        )),

                new Student("Ольга Васильева", "Группа В-303", 3,
                        Map.ofEntries(
                                Map.entry("Алгоритмы", 4.0),
                                Map.entry("ООП", 4.2),
                                Map.entry("Сети", 3.9),
                                Map.entry("Операционные системы", 3.5)
                        )),

                // Курс 4
                new Student("Игорь Павлов", "Группа Г-404", 4,
                        Map.ofEntries(
                                Map.entry("Дипломное проектирование", 4.5),
                                Map.entry("Экономика", 4.0),
                                Map.entry("Управление проектами", 4.8),
                                Map.entry("Английский", 4.2)
                        )),

                new Student("Татьяна Романова", "Группа Г-404", 4,
                        Map.ofEntries(
                                Map.entry("Дипломное проектирование", 3.5),
                                Map.entry("Экономика", 3.5),
                                Map.entry("Управление проектами", 3.8),
                                Map.entry("Английский", 3.0)
                        ))
        ));
    }

    public static void initialBook(PhoneDirectory phoneBook){
        phoneBook.add("Иванов", "+7 (123) 456-78-90");
        phoneBook.add("Петров", "+7 (234) 567-89-01");
        phoneBook.add("Сидоров", "+7 (345) 678-90-12");
        phoneBook.add("Иванов", "+7 (123) 456-78-91");
        phoneBook.add("Иванов", "+7 (123) 456-78-92");
        phoneBook.add("Кузнецов", "+7 (456) 789-01-23");
    }
}
