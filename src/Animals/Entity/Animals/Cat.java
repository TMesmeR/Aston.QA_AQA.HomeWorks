package Animals.Entity.Animals;

public class Cat extends Animal {
    private boolean isFull;

    public Cat(String animalName) {
        super(animalName, 200, 0);
        isFull = false;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean isFull) {
        this.isFull = isFull;
    }
}
