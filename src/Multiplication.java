public class Multiplication extends Start {


    public double computation(double... multiplication) {
        result = 1;

        for (int i = 0; i < multiplication.length; i++) {
            result = result * multiplication[i];
        }
        System.out.println(result);
        return result;

    }
}
