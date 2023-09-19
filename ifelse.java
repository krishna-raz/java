import java.util.Scanner;

class ifelse {
  

public static void main (String[] args){
    int marks;
    System.out.println("Enter your marks");
    Scanner mark = new Scanner(System.in);
    marks = mark.nextInt();
    if(marks>=60 && marks<=100){
        System.out.println("First Division");
    }
    else if(marks>=45 && marks<60){
        System.out.println("Second Division");
    }
    else if(marks>=33 && marks<45){
        System.out.println("Third Division");
    }
    else if(marks<33){
        System.out.println("Fail");
    }
    else{
        System.out.println("Invalid Marks");
    }
        
}

}