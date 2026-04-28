import mypackage2.Add;
import mypackage2.subpackage.Square;

public class Program18_Main {
    public static void main(String[] args) {

        Add a = new Add();
        Square s = new Square();

        System.out.println("Addition: " + a.calc(10, 5));
        System.out.println("Square: " + s.calc(4));
    }
}