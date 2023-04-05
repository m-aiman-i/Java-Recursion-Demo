public class RecursiveDemo {
    public static void main(String[] args) { // Main method declaration
        int result = factorial (8);
        System.out.println("Result = " + result);
    } // End of Main method

    public static int factorial (int n) { // Recursive method
        if ((n == 1) || (n == 0)) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }
} // End of class
