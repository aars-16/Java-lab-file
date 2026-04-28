import java.util.Scanner;

class Arithmetic {
    int a, b;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
    }

    void add() {
        System.out.println("Addition: " + (a + b));
    }

    void sub() {
        System.out.println("Subtraction: " + (a - b));
    }

    void mul() {
        System.out.println("Multiplication: " + (a * b));
    }

    void div() {
        if (b != 0)
            System.out.println("Division: " + (a / b));
        else
            System.out.println("Division not possible");
    }
}

public class Main {
    public static void main(String[] args) {
        Arithmetic obj = new Arithmetic();
        obj.input();
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
    }
}