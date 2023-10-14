package MultiplicationTable;

import java.util.Scanner;

/**
 * В этом коде использована процедурная парадигма программирования.
 * Процедурное программирование описывает программы как последовательность операций,
 * которые изменяют состояние данных.
 * Процедурное программирование обычно удобно для простых задач,
 * где требуется последовательное выполнение действий.
 * Также используется структурная парадигма, потому что
 * в данном решении использован цикл `for` для перебора чисел от 1 до n.
 * Внутри вложенного цикла `for` происходит умножение чисел и вывод на экран.
 * Структурная парадигма подходит для решения данной задачи,
 * так как она позволяет организовать код в виде последовательности операций.
 */

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        multiplicationTable(n);
    }

    public static void multiplicationTable(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.println(i + " * " + j + " = " + result);
            }
            System.out.println();
        }
    }
}
