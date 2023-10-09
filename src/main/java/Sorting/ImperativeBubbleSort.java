package Sorting;

public class ImperativeBubbleSort {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};

        // Вызов функции сортировки
        bubbleSortDescending(numbers);

        // Вывод отсортированного массива
        System.out.println("Отсортированный массив в порядке убывания:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void bubbleSortDescending(int[] arr) {
        int len = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < len; i++) {
                if (arr[i - 1] < arr[i]) {
                    // Обмен значениями, если текущий элемент меньше предыдущего
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
            // Уменьшаем размер обрабатываемой части массива на 1
            len--;
        } while (swapped);
    }
}
