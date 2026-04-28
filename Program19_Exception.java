public class Program19_Exception {

    public static void main(String[] args) {

        // Array Index Out of Bounds Exception
        try {
            int arr[] = {1, 2, 3, 4, 5};
            System.out.println("Accessing 10th element: " + arr[10]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds!");
        }

        // Arithmetic Exception
        try {
            int a = 10, b = 0;
            int c = a / b;
            System.out.println("Result: " + c);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }

        System.out.println("Program continues after handling exceptions.");
    }
}