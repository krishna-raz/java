package java;
class second {
    int a = 10;
   static int f = 10;
    double b = 21.7;

    public static void main(String[] args) {

        int c = 12;
        System.out.println(f); //use of static
        
        second obj = new second();
        System.out.println(obj.a);//use of object
        System.out.println(obj.b);
        System.out.println(c);
        System.out.println(obj.a + " " + obj.b + " " + c);

    }

}
