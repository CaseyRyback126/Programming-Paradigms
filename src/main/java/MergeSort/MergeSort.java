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
        int leftPtr = 0;
        int rightPtr = 0;
        int resultPtr = 0;

        while (leftPtr < left.length && rightPtr < right.length) {
            if (left[leftPtr] < right[rightPtr]) {
                result[resultPtr++] = left[leftPtr++];
            } else {
                result[resultPtr++] = right[rightPtr++];
            }
        }

        while (leftPtr < left.length) {
            result[resultPtr++] = left[leftPtr++];
        }

        while (rightPtr < right.length) {
            result[resultPtr++] = right[rightPtr++];
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
