package Animals.Services;

import Animals.Entity.Animals.Animal;

public class ActionService {

    public void runAnimal(Animal animal, double distance) {

        if (isTrueDistance(distance))
            return;

        if (distance <= animal.getMaxRunDistance())
            System.out.println(animal.getAnimalName() + " пробежал(а) " + distance + " м.");
        else
            System.out.println(animal.getAnimalName() + " не может пробежать " + distance + " м."
                    + "\nМаксимум сколько может пробежать это " + animal.getMaxRunDistance() + " м.");
    }

    public void swimAnimal(Animal animal, double distance) {
        if (isTrueDistance(distance))
            return;

        if (animal.getMaxSwimDistance() == 0) {
            System.out.println(animal.getAnimalName() + " не умеет плавать");
            return;
        }

        if (distance <= animal.getMaxSwimDistance())
            System.out.println(animal.getAnimalName() + " проплыл(а) " + distance + " м.");
        else
            System.out.println(animal.getAnimalName() + " не может проплыть " + distance + " м."
                    + "\nМаксимум сколько может проплыть это " + animal.getMaxSwimDistance() + " м.");
    }


    private boolean isTrueDistance(double distance) {
        if (distance < 0) {
            System.out.println("эй, дистанция не может быть отрицательной или равной 0");
            return true;
        }
        return false;
    }

}
