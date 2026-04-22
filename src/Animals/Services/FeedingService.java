package Animals.Services;

import Animals.Entity.Animals.Cat;
import Animals.Entity.Feeding.Bowl;

import java.util.ArrayList;

public class FeedingService {
    public void addFoodToBowl(Bowl bowl, int amount) {
        if (amount <= 0) {
            System.out.println("Нельзя добавить " + amount + " еды. Нужно положительное число");
            return;
        }

        bowl.setCountFood(bowl.getCountFood() + amount);
        System.out.println("В миску добавлено " + amount + " еды");
        System.out.println("Теперь в миске: " + bowl.getCountFood() + " еды");
    }

    public void feedCat(Cat cat, Bowl bowl, int eatAmount) {
        if (cat.isFull()) {
            System.out.println(cat.getAnimalName() + " уже сыт(а) и не хочет есть");
            return;
        }

        if (eatAmount <= 0) {
            System.out.println(cat.getAnimalName() + " не может съесть " + eatAmount + " еды");
            return;
        }

        if (bowl.getCountFood() >= eatAmount) {
            System.out.println(cat.getAnimalName() + " съел(а) " + eatAmount + "еды. И насытился(лась)");
            bowl.setCountFood(bowl.getCountFood() - eatAmount);
            cat.setFull(true);
            System.out.println("Осталось: " + bowl.getCountFood() + " еды.");
        } else {
            System.out.println(cat.getAnimalName() + " хочет съесть " + eatAmount + " еды,");
            System.out.println("но в миске только " + bowl.getCountFood() + " еды. Кот остался голодным.");
        }
    }

    public void feedAllCats(ArrayList<Cat> cats, Bowl bowl, int eatAmount){
        if (cats == null || cats.isEmpty()) {
            System.out.println("Нет котов для кормления");
            return;
        }

        System.out.println("\nНачинаем кормление " + cats.size() + " котов...");
        System.out.println("В миске: " + bowl.getCountFood() + " еды\n");

        for (Cat cat : cats) {
            feedCat(cat, bowl, eatAmount);
        }
        printHungerInfo(cats);
    }

    public void printHungerInfo(ArrayList<Cat> cats) {
        System.out.println("\nИнформация о сытости котов:");
        for (Cat cat : cats) {
            String status = cat.isFull() ? "Сыт(а)" : "Голоден(а)";
            System.out.println("   " + cat.getAnimalName() + " => " + status);
        }
    }
}
