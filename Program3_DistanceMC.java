import java.util.Scanner;

class Distance {
    int m, cm;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter meters: ");
        m = sc.nextInt();
        System.out.print("Enter centimeters: ");
        cm = sc.nextInt();
    }

    Distance add(Distance d2) {
        Distance result = new Distance();

        result.cm = this.cm + d2.cm;
        result.m = this.m + d2.m + (result.cm / 100);
        result.cm = result.cm % 100;

        return result;
    }

    void display() {
        System.out.println("Result: " + m + " m " + cm + " cm");
    }
}

public class Program3_DistanceMC {
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