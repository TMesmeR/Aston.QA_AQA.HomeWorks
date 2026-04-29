import PhoneDirectory.PhoneDirectory;
import Students.RepoStudent;
import Students.Student;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        RepoStudent repoStudent = new RepoStudent();

        System.out.println("===Список студентов=== ");
        for (var stud : repoStudent.getStudents()) {
            System.out.println(stud.getName());
        }
        System.out.println("\n===Отчисление студентов===\n");
        if (repoStudent.removeStudentsByGPA(3.0)) {
            System.out.println("Все Студенты с результатом ниже 3.0 были отчислены");
            System.out.println("Оставшиеся студенты:");
            for (var stud : repoStudent.getStudents()) {
                System.out.println(stud.getName() + ". Номер курса: " + stud.getCourseNumber());
            }
        } else
            System.out.println("Не удалось отчислить");

        System.out.println("\n===Перевод студентов===\n");
        System.out.println("Количество студентов повышенных на курс " + repoStudent.promoteStudentsByGPA(3.0));
        System.out.println("Новый курсы студентов:");
        for (var stud : repoStudent.getStudents()) {
            System.out.println(stud.getName() + ". Номер курса: " + stud.getCourseNumber());
        }

        //Новый лист студентов + указание студентов на курсе
        var newListStudent = new HashSet<Student>(InitialList.setStudents());
        System.out.println("\n===Новые студенты + список новых студентов на 2 курсе===\n");
        repoStudent.printStudents(newListStudent, 2);

        //Задание 2
        System.out.println("\n===Задание 2===\n");
        PhoneDirectory phoneBook = new PhoneDirectory();
        InitialList.initialBook(phoneBook);
        System.out.println("===Поиск номеров по Фамилии Иванов===\n");
        printPhones(phoneBook, "Иванов");
        System.out.println("\n===Поиск номеров по Фамилии вне списка===\n");
        printPhones(phoneBook, "Вавилов");
    }

    private static void printPhones(PhoneDirectory phoneBook, String lastName) {
        var phones = phoneBook.get(lastName);
        if (phones.isEmpty()) {
            System.out.println("Фамилия \"" + lastName + "\" не найдена");
        } else {
            System.out.println("Телефон(ы) для \"" + lastName + "\": " + phones);
        }
    }


}


