package chapter.chapter7;

public class Test3 {
    int a, b;

    Test3(int i, int j) {
        a = i;
        b = j;
    }
    void meth(Test o) {
        o.a *= 2;
        o.b /= 2;
    }
}
class PassObjRe {
    public static void main(String[] args) {
        Test3 ob = new Test3(15, 20);
        System.out.println("ob.a и ob.b до вызова: " + ob.a + " " + ob.b);

        System.out.println("ob.a и ob.b после вызова: " + ob.a + " " + ob.b);
    }
}