package chapter.chapter7;

public class VarArgs2 {
    static void VaTest(String msg, int... v) {
        System.out.print(msg + v.length + " Содержимое: ");

        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        VaTest("Один параметр переменной длины: ", 10);
        VaTest("три параметра переменной длины: ", 1, 2, 3);
        VaTest("Без параметров переменной длины: ");
    }
}
