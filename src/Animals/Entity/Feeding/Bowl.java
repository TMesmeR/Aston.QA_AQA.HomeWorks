package Animals.Entity.Feeding;

public class Bowl {

    private int countFood;

    public Bowl(){
        countFood =0;
    }

    public int getCountFood() {
        if (countFood<0) {
            System.out.println("ААааа..невероятно, но в миске оказалось отрицательное количество еды.\n" +
                    "Будем тогда считать что еды было 0");
            countFood =0;
        }
        return countFood;
    }

    public void setCountFood(int value) {
        if(value <0){
            System.out.println("Нельзя установить то чего нет...Введите положительное целое число или 0");
            return;
        }
        countFood = value;
    }
}
