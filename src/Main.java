import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Java Array Program For Array Rotation");
        System.out.println("Enter the number of elements in the array: ");
        n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();

        }
        System.out.println("Array Elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i] + " ");
        }


    }
}