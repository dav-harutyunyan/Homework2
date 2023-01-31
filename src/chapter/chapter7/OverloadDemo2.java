package chapter.chapter7;

 public class OverloadDemo2 {
    void test() {
        System.out.println("Параметры отсутсвуют");
    }
    void test (int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }
    void test (double a) {
        System.out.println("Внутренное преобразование при вызове " + " test(double) a: " + a);
    }
}
class Overload2 {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        int i = 88;

        ob.test();
        ob.test(10, 20);
        ob.test(i);
        ob.test(123.2);
    }
}
