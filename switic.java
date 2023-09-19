import java.util.Scanner;

public class switic {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("enter two number");
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("Choose an option");
        System.out.println("enter 1 for add");
        System.out.println("enter 2 for sub");
        System.out.println("enter 3 for mul");
        System.out.println("enter 4 for div");
        a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("addition is " + (b + c));
                break;
            case 2:
                System.out.println("subtraction is " + (b - c));
                break;
            case 3:
                System.out.println("multiplication is " + (b * c));
                break;
            case 4:
                System.out.println("division is " + (b / c));
                break;
            default:
                System.out.println("invalid input");
        }
    }

}
