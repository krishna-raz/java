public class stringclass {
    public static void main(String[] args) {
        // length(); // length of the string
        // toLowerCase(); // is ka use lower case me krne ke liye hota hai
        // touperCase(); // is ka use upper case me krne ke liye hota hai
        // trim(); // is ka use space ko remove krne ke liye hota hai
        immutable(); // can't change the value of string
        immutable2(); // can change the value of string
        // isequle(); // is me copy by value pass hota hai
        // isequle1(); // is me copy by reference pass hota hai
        // isequle2();//

    }

    // length
    static void length() {
        String str1 = "Krishna";
        int len = str1.length();
        System.out.println("Length of the string is: " + len);

    }

    // toLowerCase()
    static void toLowerCase() {
        String str1 = "KRISHNA";
        String str2 = str1.toLowerCase();
        System.out.println("Lower case of the string is: " + str2);
    }

    // toUpperCase()
    static void touperCase() {
        String str1 = "krishna";
        String str2 = str1.toUpperCase();
        System.out.println("Upper case of the string is: " + str2);
    }

    // trim()
    static void trim() {
        String str1 = "   krishna   ";
        String str2 = str1.trim();
        System.out.println("Trim of the string is: " + str2);
    }

    // immutable()
    static void immutable() {
        String str1 = "krishna";
        str1.concat("Raj");// pass value in str1 but not change the value of str1
        System.out.println("Immutable of the string is: " + str1);
    }

    // immutable2()
    static void immutable2() {
        String str1= "krishna";
      String  str2 = str1.concat("Raj");// concate is use to add the value in str1 
        System.out.println("Immutable of the string is: " + str2);
    }

    // isequle() //is me str1 or str2 ka value same hai is liye ye equal hai
    static void isequle() {
        String str1 = "krishna";
        String str2 = "krishna";
        if (str1 == str2) {
            System.out.println("String is equal");
        } else {
            System.out.println("String is not equal");
        }
    }

    // isequle1() //is me str1 or str2 ka address same hai is liye ye equal nhi hai
    static void isequle1() {
        String str1 = "krishna";
        String str2 = new String("krishna");
        if (str1 == str2) {
            System.out.println("String is equal");
        } else {
            System.out.println("String is not equal");
        }

    }

    // isequle2() //is me str1 or str2 ka value same hai is liye ye equal hai
    static void isequle2() {
        String str1 = "krishna";
        String str2 = new String("krishna");
        if (str1.equals(str2)) {
            System.out.println("String is equal");
        } else {
            System.out.println("String is not equal");
        }

    }

}