import java.util.Scanner;

class Matrix {
    int a[][] = new int[3][3];
    int b[][] = new int[3][3];
    int result[][] = new int[3][3];

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }
    }

    void addition() {
        System.out.println("Addition of matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = a[i][j] + b[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    void transpose() {
        System.out.println("Transpose of Matrix A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }

    void sumRows() {
        System.out.println("Sum of rows (Matrix A):");
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += a[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + sum);
        }
    }

    void sumColumns() {
        System.out.println("Sum of columns (Matrix A):");
        for (int j = 0; j < 3; j++) {
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                sum += a[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + sum);
        }
    }

    void sumDiagonal() {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += a[i][i];
        }
        System.out.println("Sum of diagonal elements: " + sum);
    }
}

public class Program8_Matrix {
    public static void main(String[] args) {

        Matrix obj = new Matrix();

        obj.input();
        obj.addition();
        obj.transpose();
        obj.sumRows();
        obj.sumColumns();
        obj.sumDiagonal();
    }
}