import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 6, 7};
        insertionSort(arr);
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            System.out.print("Lần " + i + " nguồn: ");
            Subarray(arr, j + 1, n - 1);
            System.out.print(" đích: ");
            Subarray(arr, 0, j);
            System.out.println();

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;

                System.out.print("Lần " + i + " nguồn: ");
                Subarray(arr, j + 2, i);
                System.out.print(" đích: ");
                Subarray(arr, 0, j + 1);
                System.out.println(" -> Di chuyển phần tử " + key + " đến vị trí " + (j + 2) + " (về sau " + (i - j - 1) + " lần)");

                System.out.print("Lần " + (i + 1) + " nguồn: ");
                Subarray(arr, j + 2, i + 1);
                System.out.print(" đích: ");
                Subarray(arr, 0, j + 1);
                System.out.println();
            }
            arr[j + 1] = key;
        }
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void Subarray(int[] arr, int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
