package Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DeclarativeSort {
    public static void main(String[] args) {
        Integer[] numbers = {5, 2, 9, 1, 5, 6};

        // Преобразование массива в список
        List<Integer> numberList = Arrays.asList(numbers);

        // Сортировка в порядке убывания
        numberList.sort(Collections.reverseOrder());

        // Преобразование обратно в массив (если необходимо)
        Integer[] sortedNumbers = numberList.toArray(new Integer[0]);

        // Вывод отсортированного массива
        System.out.println("Отсортированный массив в порядке убывания:");
        for (int number : sortedNumbers) {
            System.out.print(number + " ");
        }
    }
}
