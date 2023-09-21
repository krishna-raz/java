public class opreater {
    public static void main(String[] args) {
        int a=4, b=61, c=9;
        if (a>b && a>c) {
            System.out.println("a is greater");
        } else if (b>a && b>c) {
            System.out.println("b is greater");
        } else {
            System.out.println("c is greater");
        }
        //is me 3 bar condition ka use kiye he or time complexity 3n he


        //or 
        if (a>b) {
            if (a>c) {
                System.out.println("a is greater");
            } else {
                System.out.println("c is greater");
            }
        } else {
            if (b>c) {
                System.out.println("b is greater");
            } else {
                System.out.println("c is greater");
            }
        }
        //is me 2*2 bar condition ka use kiye he or time complexity 2n*n he

        int d=(a>b)?(a>c?a:c):(b>c?c:b);
        System.out.println(d);  // ternari opraeter ka use kiya he or time complexity 1 he

    }

}