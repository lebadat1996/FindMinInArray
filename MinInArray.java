package MinArray;

import java.util.Scanner;

public class MinInArray {
    public static int[] InputArray(int n, Scanner scanner) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int value : arr) {
            System.out.print(value + " ");
        }
        return arr;
    }

    public static int FindMinInArray(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("\nmin = " + min);
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = scanner.nextInt();
        int[] arr = InputArray(n, scanner);

        FindMinInArray(arr);
    }
}
