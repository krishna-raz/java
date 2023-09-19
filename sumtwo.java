package java;
import java.util.Scanner; // import only Scanner class from java.util package 
// import java.util.*; // import all classes from java.util package

public class sumtwo {
    // Global variables

    public static void main(String[] args) {
        int a, b, c; // local variables
        System.out.println("Enter two integers to calculate their sum ");
        Scanner s = new Scanner(System.in); // s is an object of Scanner class
        a = s.nextInt();// s.nextInt() reads an integer from the keyboard
        b = s.nextInt();
        c = a + b;
        System.out.println("Sum of entered integers = " + c);

    }

}
