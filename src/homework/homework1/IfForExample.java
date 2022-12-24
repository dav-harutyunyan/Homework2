package homework.homework1;

public class IfForExample {
    public static void main(String[] args) {
        int a, b;
        a = 60;
        b = 120;
        if (a < b) {
            System.out.println("max: " + b);
            for (a = 60; a <= 120; a++) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
        a = (char) a;
        b = (char) b;
        System.out.println('a');
        System.out.println('b');

        if (a == b) {
            System.out.println("a равно b");
        } else {
            System.out.println("a не равно b");

        }
    }
}