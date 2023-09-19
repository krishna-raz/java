import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        int i = 1;
        int a;
        System.out.println(" using while loop"); // while loop ka use jab krte hai jab hme nhi pta ho ki kitni bar loop chalna hai 
        System.out.println("Enter a number:  ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        while (i <= 10) {
            System.out.println(a + "X" + i + "=" + a * i);
            i++;
        }
    }
}
