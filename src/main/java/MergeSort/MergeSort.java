package MergeSort;


import java.util.Arrays;

public class MergeSort {

    public static int[] sort(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        int mid = array.length / 2;

        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        System.arraycopy(array, 0, left, 0, mid);

        if (array.length - mid >= 0)
            System.arraycopy(array, mid, right, 0, array.length - mid);

        left = sort(left);
        right = sort(right);

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                result[resultIndex++] = left[leftIndex++];
            } else {
                result[resultIndex++] = right[rightIndex++];
            }
        }

        while (leftIndex < left.length) {
            result[resultIndex++] = left[leftIndex++];
        }

        while (rightIndex < right.length) {
            result[resultIndex++] = right[rightIndex++];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {10, 5, 3, -7, 59, -63, 21, -12, 8, 2};
        System.out.println(Arrays.toString(array));
        int[] sorted = MergeSort.sort(array);

        System.out.println(Arrays.toString(sorted));
    }
}
