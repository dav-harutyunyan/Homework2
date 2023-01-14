package homework.homework6;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] arrey = {2, 5, 8, 10, 88, 22, 11, 66, 12, 30, 6, 4, 3,};
        ArrayUtil au = new ArrayUtil();
        au.maxarrey(arrey);
        au.minarrey(arrey);
        au.zuyg(arrey);
        System.out.println();
        au.kent(arrey);
        System.out.println();
        au.zuygiqanak(arrey);
        au.kentiqanak(arrey);
    }
}
