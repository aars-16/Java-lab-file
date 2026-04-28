import java.util.Scanner;

class Array1D {
    int arr[] = new int[5];

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void output1() {
        System.out.print("Array elements (forward): ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void output2() {
        System.out.print("Array elements using for-each: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    void reverse() {
        System.out.print("Array in reverse: ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class Program7_Array {
    public static void main(String[] args) {

        Array1D obj = new Array1D();

        obj.input();
        obj.output1();
        obj.output2();
        obj.reverse();
    }
}