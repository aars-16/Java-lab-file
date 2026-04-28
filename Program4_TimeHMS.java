import java.util.Scanner;

class Time {
    int hr, min, sec;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours: ");
        hr = sc.nextInt();
        System.out.print("Enter minutes: ");
        min = sc.nextInt();
        System.out.print("Enter seconds: ");
        sec = sc.nextInt();
    }

    Time add(Time t2) {
        Time result = new Time();

        result.sec = this.sec + t2.sec;
        result.min = this.min + t2.min + (result.sec / 60);
        result.sec = result.sec % 60;

        result.hr = this.hr + t2.hr + (result.min / 60);
        result.min = result.min % 60;

        return result;
    }

    void display() {
        System.out.println("Result: " + hr + " hr " + min + " min " + sec + " sec");
    }
}

public class Program4_TimeHMS {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time();

        System.out.println("Enter first time:");
        t1.input();

        System.out.println("Enter second time:");
        t2.input();

        Time result = t1.add(t2);
        result.display();
    }
}