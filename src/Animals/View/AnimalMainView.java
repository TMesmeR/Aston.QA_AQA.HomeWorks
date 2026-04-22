package Animals.View;

import Animals.Entity.Animals.Cat;
import Animals.Entity.Animals.Dog;
import Animals.Entity.Feeding.Bowl;
import Animals.Repository.AnimalRepository;
import Animals.Services.ActionService;
import Animals.Services.FeedingService;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalMainView {
    AnimalRepository repository;
    ActionService actionService;
    FeedingService feedingService;


    Cat catBarsic;
    Cat catMurka;
    Cat catSnejok;
    Dog dogBobik;
    Bowl bowl;

    public AnimalMainView() {
        repository = new AnimalRepository();
        actionService = new ActionService();
        feedingService = new FeedingService();

        catBarsic = new Cat("Барсик");
        catMurka = new Cat("Мурка");
        catSnejok = new Cat("Снежок");
        dogBobik = new Dog("Бобик");
        bowl = new Bowl();
    }

    public void printView() {
        repository.addAnimalRange(catBarsic, catMurka, catSnejok, dogBobik);
        Scanner in = new Scanner(System.in);
        int pick =0;

        while (true) {
            System.out.println("\n===========================\n");
            System.out.println("Выберите действия: ");
            System.out.println("1 - Забег.");
            System.out.println("2 - Кормление котов.");
            System.out.println("3 - Статистика");
            System.out.println("4 - Выход");

            if (in.hasNextInt()) {
                pick = in.nextInt();
                switch (pick) {
                    case 1:
                        System.out.println("\n===========================\n");
                        run();
                        break;
                    case 2:
                        System.out.println("\n===========================\n");
                        feed();
                        break;
                    case 3:
                        System.out.println("\n===========================\n");
                        statistics();
                        break;
                    case 4:
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

    private void run (){
        System.out.println("Забеги:");
        actionService.runAnimal(catBarsic,150);
        actionService.runAnimal(dogBobik, 600);
        actionService.swimAnimal(catSnejok, 5);
        actionService.swimAnimal(dogBobik,5);
    }
    private void feed(){
        System.out.println("\nКормление:");
        ArrayList<Cat> cats = repository.getAllCats();

        for (var cat:cats){ //обнуление голода котов
            cat.setFull(false);
        }
        bowl.setCountFood(30);

        System.out.println("\n=== Первая попытка ===");
        feedingService.feedAllCats(cats,bowl,15);

        System.out.println("\n=== Добавляем еду ===");
        feedingService.addFoodToBowl(bowl, 20);

        System.out.println("\n=== Вторая попытка ===");
        feedingService.feedAllCats(cats, bowl, 10);
    }

    private void statistics(){
        System.out.println("\n=== Статистика ===");
        System.out.println("Всего животных: " + repository.getCounterAllAnimal());
        System.out.println("Котов: " + repository.getCounterAllCat());
        System.out.println("Собак: " + repository.getCounterAllDog());
    }
}

