import java.util.Random;
import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Размер массива: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(10);
            System.out.print(a[i] + " ");
        }

        System.out.print("\nЧто заменить: ");
        int oldVal = sc.nextInt();

        System.out.print("На что заменить: ");
        int newVal = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (a[i] == oldVal)
                a[i] = newVal;
        }

        System.out.println("Новый массив:");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
