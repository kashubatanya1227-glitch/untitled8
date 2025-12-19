import java.util.Random;
import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Размер массива: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(100);
            System.out.print(a[i] + " ");
        }

        System.out.print("\n1 — возрастание, 2 — убывание: ");
        int choice = sc.nextInt();

        boolean ok = true;

        for (int i = 0; i < n - 1; i++) {
            if (choice == 1 && a[i] > a[i + 1])
                ok = false;
            if (choice == 2 && a[i] < a[i + 1])
                ok = false;
        }

        if (ok)
            System.out.println("Условие выполняется");
        else
            System.out.println("Условие не выполняется");
    }
}