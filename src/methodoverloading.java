public class methodoverloading {
    // Method with integer parameter
    public static void display(int num) {
        System.out.println("Method with integer: " + num);
    }

    // Method with char parameter
    public static void display(char ch) {
        System.out.println("Method with char: " + ch);
    }

    // Method with boolean parameter
    public static void display(boolean bool) {
        System.out.println("Method with boolean: " + bool);
    }

    public static void main(String[] args) {
        display(10);
        display('a');
        display(true);
    }
}


