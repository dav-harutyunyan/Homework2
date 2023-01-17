package homework.homework7;

public class CalculatorDemo {

    public static void main(String[] args) {
        Calculator cl = new Calculator();
        System.out.println(cl.plus(20,24));
        System.out.println(cl.minus(0,4));
        System.out.println(cl.divide(78,  0 ));
        System.out.println(cl.multiply(65, 90));

        }
    }
