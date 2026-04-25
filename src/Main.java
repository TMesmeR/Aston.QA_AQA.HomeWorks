import Exceptions.MyArrayDataException;
import Exceptions.MyArraySizeException;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ТЕСТ 1: Корректный массив ===");
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = sumArray(validArray);
            System.out.println("Сумма элементов: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("\n=== ТЕСТ 2: Неправильный размер ===");
        String[][] wrongSizeArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}
        };

        try {
            int result = sumArray(wrongSizeArray);
            System.out.println("Сумма элементов: " + result);
        } catch (MyArraySizeException e) {
            System.out.println("Поймано MyArraySizeException: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Поймано MyArrayDataException: " + e.getMessage());
        }

        System.out.println("\n=== ТЕСТ 3: Некорректные данные ===");
        String[][] invalidDataArray = {
                {"1", "2", "3", "4"},
                {"5", "шесть", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = sumArray(invalidDataArray);
            System.out.println("Сумма элементов: " + result);
        } catch (MyArraySizeException e) {
            System.out.println("Поймано MyArraySizeException: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Поймано MyArrayDataException: " + e.getMessage());
        }

        System.out.println("\n=== Задание 4: ArrayIndexOutOfBoundsException ===");

        try {
            String[][] testArray = new String[4][4];
            String value = testArray[4][0];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Перехвачено ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static  int sumArray (String [][] array) throws MyArraySizeException, MyArrayDataException{
        int sum =0;
        if (array.length != 4)
            throw new MyArraySizeException("Количество строк не равно: 4." +
                    "Получено: " + array.length);

        for (int i = 0; i < array.length; i++)
        {
            if (array[i].length != 4)
                throw new MyArraySizeException("Количество столбцов  строке" + i + "не равно: 4." +
                        "Получено: " + array[i].length);
        }

       for (int i = 0; i < array.length; i++){
           for (int j = 0; j < array[i].length; j++){
               try {
                   sum += Integer.parseInt(array[i][j]);
               }
               catch (NumberFormatException e) {
                   throw new MyArrayDataException("Ошибка преобразования данных", i, j);
               }
           }
       }
       return sum;
    }
}