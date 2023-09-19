import java.util.Scanner;

public class for_loop {

    public static void main(String[] args) {
        int i, a;
        System.out.println("Enter a number");
        Scanner num = new Scanner(System.in);
        a = num.nextInt();

        for (i = 1; i <= 10; i++) {
            System.out.println(a + " * " + i + " = " + a * i);
        }
    }
}
