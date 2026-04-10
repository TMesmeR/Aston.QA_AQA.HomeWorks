
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1. Вызов метода printThreeWords()
        // printThreeWords();

        // 2. Вызов метода checkSumSign()
        // checkSumSign();

        // 3. Вызов метода printColor()
        // printColor();

        // 4. Вызов метода compareNumbers()
        // compareNumbers();

        /* //5. Вызов метода isSumInRange()
         System.out.println(isSumInRange(5, 10));
         System.out.println(isSumInRange(1, 2));*/

        /* //6. Вызов метода checkNumAndPrint()
         checkNumAndPrint(5);
         checkNumAndPrint(-3);
         checkNumAndPrint(0);*/

        /* //7. Вызов метода isNegative()
         System.out.println(isNegative(-5));
         System.out.println(isNegative(3));
         System.out.println(isNegative(0));*/

        // 8. Вызов метода printStringMultipleTimes()
        // printStringMultipleTimes("Hello", 3);

        /* //9. Вызов метода isLeapYear()
         System.out.println(isLeapYear(2020));
         System.out.println(isLeapYear(2021));
         System.out.println(isLeapYear(1900));
         System.out.println(isLeapYear(2000));*/

        /* //10. Вызов метода invertBinaryArray()
         int[] invertedArray = invertBinaryArray();
         for (int num : invertedArray) {
             System.out.print(num + " ");
         }
         System.out.println();*/

        /* //11. Вызов метода fillArrayWithSequence()
         int[] sequenceArray = fillArrayWithSequence();
         for (int num : sequenceArray) {
             System.out.print(num + " ");
         }
         System.out.println();*/

        /* //12. Вызов метода doubleNumbersLessThanSix()
         int[] doubledArray = doubleNumbersLessThanSix();
         for (int num : doubledArray) {
             System.out.print(num + " ");
         }
         System.out.println();*/

        /* //13. Вызов метода setDiagonalToOnes()
         int[][] diagonalArray = setDiagonalToOnes(5);
         for (int i = 0; i < diagonalArray.length; i++) {
             for (int j = 0; j < diagonalArray[i].length; j++) {
                 System.out.print(diagonalArray[i][j] + " ");
             }
             System.out.println();
         }*/

        /* //14. Вызов метода createArrayWithDefaultValue()
         int[] defaultArray = createArrayWithDefaultValue(10, 7);
         for (int num : defaultArray) {
             System.out.print(num + " ");
         }
         System.out.println();*/
    }

    /*1. Создайте метод printThreeWords(), который при вызове должен
    отпечатать в столбец три слова: Orange, Banana, Apple*/
    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    /*2. Создайте метод checkSumSign(), в теле которого объявите две int
    переменные a и b, и инициализируйте их любыми значениями, которыми
    захотите. Далее метод должен просуммировать эти переменные, и если их
    сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”,
    в противном случае - “Сумма отрицательная”;*/
    static void checkSumSign() {
        int a = 15;
        int b = 20;
        if (a + b >= 0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");
    }

    /* 3. Создайте метод printColor() в теле которого задайте int переменную
     value и инициализируйте ее любым значением.
     Если value меньше 0(0 включительно), то в консоль метод должен
     вывести сообщение “Красный”, если лежит в пределах от 0 (0 исключительно)
     до 100 (100 включительно), то “Желтый”,
     если больше 100 (100 исключительно) - “Зеленый”;*/
    static void printColor() {
        int value = 10;
        if (value <= 0)
            System.out.println("Красный");
        else if (value > 0 && value <= 100)
            System.out.println("Желтый");
        else
            System.out.println("Зеленый");
    }

    /*4. Создайте метод compareNumbers(), в теле которого объявите две int
    переменные a и b, и инициализируйте их любыми значениями, которыми захотите.
    Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”,
    в противном случае “a < b”;*/
    static void compareNumbers() {
        int a = 1;
        int b = 2;
        if (a >= b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");
    }

    /*5. Напишите метод, принимающий на вход два целых числа и проверяющий,
    что их сумма лежит в пределах от 10 до 20 (включительно),
    если да – вернуть true, в противном случае – false.*/
    static boolean isSumInRange(int num1, int num2) {
        int sum = num1 + num2;
        return sum >= 10 && sum <= 20;
    }

    /* 6. Напишите метод, которому в качестве параметра передается целое число,
     метод должен напечатать в консоль, положительное ли число передали или
     отрицательное. Замечание: ноль считаем положительным числом.*/
    static void checkNumAndPrint(int num) {
        if (num >= 0)
            System.out.println("Число положительное");
        else
            System.out.println("Число отрицательное");
    }

    /*7. Напишите метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false
    если положительное.Замечание: ноль считаем положительным числом.*/
    static boolean isNegative(int num) {
        return num < 0;
    }

    /*8. Напишите метод, которому в качестве аргументов передается строка и число,
    метод должен отпечатать в консоль указанную строку, указанное количество раз;*/
    static void printStringMultipleTimes(String str, int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.println(str);
        }
    }

    /*9. Напишите метод, который определяет, является ли год високосным,
    и возвращает boolean (високосный - true, не високосный - false).
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом
        каждый 400-й – високосный.*/

    static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    /*10. Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия
    заменить 0 на 1, 1 на 0;*/
    static int[] invertBinaryArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] == 0 ? 1 : 0;
        }
        return array;
    }

    /*11. Задать пустой целочисленный массив длиной 100.
    помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;*/
    static int[] fillArrayWithSequence() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

   /* 12. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти
    по нему циклом, и числа меньшие 6 умножить на 2;*/

    static int[] doubleNumbersLessThanSix() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6)
                array[i] *= 2;
        }
        return array;
    }

    /*13. Создать квадратный двумерный целочисленный массив(
    количество строк и столбцов одинаковое), и с помощью цикла(-ов)
    заполнить его диагональные элементы единицами (можно только одну из
    диагоналей, если обе сложно). Определить элементы одной из
    диагоналей можно по следующему принципу: индексы таких элементов равны,
    то есть [0][0], [1][1], [2][2], ..., [n][n];*/
    static int[][] setDiagonalToOnes(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array.length - 1 - i] = 1;
        }
        return array;
    }

    /*14. Написать метод, принимающий на вход два аргумента: len и initialValue,
     и возвращающий одномерный массив типа int длиной len, каждая ячейка
     которого равна initialValue.*/
    static int[] createArrayWithDefaultValue(int len, int initialValue) {
        var array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}