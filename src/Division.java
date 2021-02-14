public class Division extends Start {

    public double computation(int... division) {
        result = division[0];
        for (int i = 1; i < division.length; i++) {
            result = result / division[i];
        }
        System.out.println(result);
        return result;

    }
}
