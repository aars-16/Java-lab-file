import java.util.Scanner;

class Distance {
    int m, cm, mm;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter meters: ");
        m = sc.nextInt();
        System.out.print("Enter centimeters: ");
        cm = sc.nextInt();
        System.out.print("Enter millimeters: ");
        mm = sc.nextInt();
    }

    Distance add(Distance d2) {
        Distance result = new Distance();

        result.mm = this.mm + d2.mm;
        result.cm = this.cm + d2.cm + (result.mm / 10);
        result.mm = result.mm % 10;

        result.m = this.m + d2.m + (result.cm / 100);
        result.cm = result.cm % 100;

        return result;
    }

    void display() {
        System.out.println("Result: " + m + " m " + cm + " cm " + mm + " mm");
    }
}

public class Main {
    public static void main(String[] args) {
        Distance d1 = new Distance();
        Distance d2 = new Distance();

        System.out.println("Enter first distance:");
        d1.input();

        System.out.println("Enter second distance:");
        d2.input();

        Distance result = d1.add(d2);
        result.display();
    }
}