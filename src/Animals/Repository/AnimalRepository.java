package Animals.Repository;

import Animals.Entity.Animals.Animal;
import Animals.Entity.Animals.Cat;
import Animals.Entity.Animals.Dog;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.NoSuchElementException;

public class AnimalRepository {
    private final ArrayList<Animal> animalArrayList;

    public AnimalRepository() {
        animalArrayList = new ArrayList<Animal>();
    }

    public void addAnimal(Animal animal) {
        animalArrayList.add(animal);
    }
    public void addAnimalRange(Animal... animals){
        Collections.addAll(animalArrayList,animals);
    }

    public Animal findByName(String animalName) {
        checkArrayAndName(animalName);
        return animalArrayList.stream()
                .filter(a -> a.getAnimalName().equals(animalName))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Животное не найдено"));
    }

    public void removeAnimalByName(String nameAnimal) {
        checkArrayAndName(nameAnimal);
        boolean removed = animalArrayList.removeIf(animal -> animal.getAnimalName().equals(nameAnimal));
        if (!removed)
            throw new IllegalArgumentException("Животное с именем '" + nameAnimal + "' не найдено");
        else
            System.out.println("Животное с именем '" + nameAnimal + "' удалено");
    }
    public  void  removeAllAnimals(){
        animalArrayList.clear();
    }

    public void updateAnimalNameByName(String oldName, String newName) {
        checkArrayAndName(oldName, newName);
        boolean found = false;
        for (Animal animal : animalArrayList) {
            if (animal.getAnimalName().equals(oldName)) {
                animal.setAnimalName(newName);
                System.out.println("Имя установлено");
                found = true;
                break;
            }
        }
        if (!found) {
            throw new NoSuchElementException("Животное с именем '" + oldName + "' не найдено");
        }
    }

    public int getCounterAllAnimal() {
        return animalArrayList.size();
    }

    public int getCounterAllDog() {
        return counterByClass(Dog.class);
    }

    public int getCounterAllCat() {
        return counterByClass(Cat.class);
    }

    public ArrayList<Cat> getAllCats() {
        if (animalArrayList.isEmpty())
            throw new IllegalStateException("Отсутствуют животные");

        ArrayList<Cat> result = new ArrayList<>();
        for (Animal animal : animalArrayList) {
            if (animal instanceof Cat) {
                result.add((Cat) animal);
            }
        }
        if (result.isEmpty())
            throw new IllegalStateException("Отсутствуют коты");
        return result;
    }

    private void checkArrayAndName(String name) {
        if (animalArrayList.isEmpty())
            throw new IllegalStateException("Список животных пуст");
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Новое имя не может быть пустым");
        }
    }

    private void checkArrayAndName(String oldName, String newName) {
        if (animalArrayList.isEmpty())
            throw new IllegalStateException("Список животных пуст");
        if (newName == null || newName.trim().isEmpty()) {
            throw new IllegalArgumentException("Новое имя не может быть пустым");
        }
        if (oldName == null || oldName.trim().isEmpty()) {
            throw new IllegalArgumentException("Старое имя не может быть пустым");
        }
    }

    private  <T extends Animal> int counterByClass(Class<T> animalClass) {
        return (int) animalArrayList.stream()
                .filter(animalClass::isInstance)
                .count();
    }
}
