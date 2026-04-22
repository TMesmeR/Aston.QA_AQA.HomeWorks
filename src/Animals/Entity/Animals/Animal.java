package Animals.Entity.Animals;

public abstract class Animal {
    String animalName;
    double maxRunDistance;
    double maxSwimDistance;

    public Animal(String animalName, double maxRunDistance, double maxSwimDistance) {
        this.animalName = animalName;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    public String getAnimalName() {
        return animalName;
    }
    public double getMaxRunDistance(){return maxRunDistance;}
    public double getMaxSwimDistance(){return maxSwimDistance;}

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }
}
