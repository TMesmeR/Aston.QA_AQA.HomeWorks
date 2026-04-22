import Animals.Entity.Animals.Animal;
import Animals.View.AnimalMainView;
import GeoPaintShape.GeoPaintShapeMainView;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnimalMainView amv = new AnimalMainView();
        GeoPaintShapeMainView gpsmv = new GeoPaintShapeMainView();
        Scanner in = new Scanner(System.in);
        int pick = 0;

        while (true) {
            System.out.println("\n===========================\n");
            System.out.println("Выберите домашнее задание: ");
            System.out.println("1 - Животные.");
            System.out.println("2 - Фигуры.");
            System.out.println("3 - Выход");

            if (in.hasNextInt()) {
                pick = in.nextInt();
                switch (pick) {
                    case 1:
                        System.out.println("\n===========================\n");
                        amv.printView();
                        break;
                    case 2:
                        System.out.println("\n===========================\n");
                        gpsmv.printView();
                        break;
                    case 3:
                        in.close();
                        return;
                    default:
                        break;
                }
            }
            else {
                System.out.println("Введите число...целое...из предложенных вариантов...а не то что вы там ввели");
                in.next();
            }
        }
    }
}