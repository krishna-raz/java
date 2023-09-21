import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] ages) {
        int a[] = new int[5];

        System.out.println("Enter 5 number");
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            a[i] = sc.nextInt();
        }
        Arrays.sort(a); // iska use array ko sorting krne ke liye kiya jata he

        for (int i = 0; i < 5; i++) { // simple for
            System.out.print(a[i]);
        }

        System.out.println();

        for (int b : a) { // foreach loop
            System.out.print(b);
        }

    }

}
