package bigdecimals;

import java.math.BigDecimal;

public class HelloBigDecimal {



    public static void main(String[] args) {


        BigDecimal a = new BigDecimal("3");
        BigDecimal b = new BigDecimal("676743.78324");

        BigDecimal sum = a.add(b);
        BigDecimal subtract = a.subtract(b);
        BigDecimal multiply = a.multiply(b);
        BigDecimal divide = a.divide(b, 20, BigDecimal.ROUND_UP);

        System.out.println(divide);


        int compareResult = a.compareTo(b);
        System.out.println(compareResult);
        if (compareResult > 0) {
            System.out.println("a is bigger");
        } else if (compareResult < 0) {
            System.out.println("a is smaller");
        } else {
            System.out.println("they are equals");
        }

    }
}
