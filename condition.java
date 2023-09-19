import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
       
        int a;
        System.out.print("Enter Your Password: ");
        Scanner obj=new Scanner(System.in); //obj is an object of Scanner class
        a=obj.nextInt();
        if(a==1234){
            System.out.println("Welcome to the System");
        }
        else{
            System.out.println("Wrong Password");
        }

    }
    
}
