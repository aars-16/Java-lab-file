import mypackage.*;

public class Program17_Main {
    public static void main(String[] args) {

        Add a = new Add();
        Sub s = new Sub();
        Mul m = new Mul();
        Div d = new Div();
        Square sq = new Square();

        System.out.println("Add: " + a.calc(10, 5));
        System.out.println("Sub: " + s.calc(10, 5));
        System.out.println("Mul: " + m.calc(10, 5));
        System.out.println("Div: " + d.calc(10, 5));
        System.out.println("Square: " + sq.calc(5));
    }
}