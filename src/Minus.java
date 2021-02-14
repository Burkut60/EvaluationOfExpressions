public class Minus extends Start {


    public double computation(double... minus) {

        result = minus[0];
        for (int i = 1; i <  minus.length; i++) {

            result = result - minus[i];
        }
        System.out.println(result);
        return result;
    }
}
