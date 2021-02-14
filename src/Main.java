import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Plus plus = new Plus();
        double resP = plus.computation(3,4,6,4,2);

        Minus minus = new Minus();
        double resM = minus.computation(6, 5,4,6,8,9);

        Multiplication multiplication = new Multiplication();
        double resMul = multiplication.computation(5, 7,6,8,9);

        Division division = new Division();
        double resDiv = division.computation(100, 10,2);


        double resultAll = plus.computation(resP, resM, resDiv, resMul);
        System.out.println(resultAll);

    }

}
