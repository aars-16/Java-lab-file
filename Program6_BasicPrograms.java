class Program {

    void factorial() {
        int n = 5, fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of 5 = " + fact);
    }

    void armstrong() {
        int num = 153, temp = num, sum = 0, r;

        while (num > 0) {
            r = num % 10;
            sum += r * r * r;
            num /= 10;
        }

        if (sum == temp)
            System.out.println(temp + " is an Armstrong number");
        else
            System.out.println(temp + " is not an Armstrong number");
    }

    void palindrome() {
        int num = 121, temp = num, rev = 0, r;

        while (num > 0) {
            r = num % 10;
            rev = rev * 10 + r;
            num /= 10;
        }

        if (rev == temp)
            System.out.println(temp + " is a Palindrome");
        else
            System.out.println(temp + " is not a Palindrome");
    }

    void fibonacci() {
        int a = 0, b = 1, c;

        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    void pattern() {
        System.out.println("Pattern:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class Program6_BasicPrograms {
    public static void main(String[] args) {

        Program obj = new Program();

        obj.factorial();
        obj.armstrong();
        obj.palindrome();
        obj.fibonacci();
        obj.pattern();
    }
}