package org.example.lesson1;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
            System.out.println(isSumBetween10And20(5, 15)); // true
            System.out.println(isSumBetween10And20(7, 15)); // false
            System.out.println(isSumBetween10And20(2, 6)); // false

            System.out.println(isPositive(5)); // true
            System.out.println(isPositive(-3)); // false

            System.out.println(printStringSum("abcd", 5)); // abcdabcdabcdabcdabcd

            System.out.println(isLeapYear(1988));

            System.out.println(createArray(10, 5));
    }
    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        if ((a + b) > 10 & (a + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }
    private static boolean isPositive(int x) {
    // проверить, что х положительное
            if (x > 0) {
                return true;
            } else {
                return false;
            }

    }
//    result = 0;
    private static String printStringSum(String source, int repeate) {
         // напечатать строку source repeat раз
//         for (int i = 0; i < repeat; i++) {
            var result = source.repeat(repeate);
            return result;
         }
    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        // год является високосным, если он делится на 4, но не делится на 100, но делится на 400
        if (year % 4 == 0 & year % 100 != 0 & year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static int[] createArray(int len, int initialValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        System.out.println(Arrays.toString(array));
    return array;
    }
}