import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập độ dài chuỗi: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Các phần tử chuỗi:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Sort(arr);

        System.out.print("KQ : ");
        printArray(arr);

        scanner.close();
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void Sort(int[] arr) {
        int n = arr.length;
        int dem = 1;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    System.out.print("Kết quả lần " + (dem++) + " hoán vị " + j + " vs " + (j + 1) + " là hoán vị hv[" + arr[j] + "," + arr[j + 1] + "]");
                    System.out.print(" kết quả ");
                    printArray(arr);
                }
            }
        }
    }
}