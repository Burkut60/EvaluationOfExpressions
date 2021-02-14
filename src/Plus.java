public class Plus extends Start {


    public double computation(double... plus) {
        result = 1;

        for (int i = 0; i < plus.length; i++){
           result  = result + plus[i];
        }
        System.out.println(result);
        return result;
    }
}
