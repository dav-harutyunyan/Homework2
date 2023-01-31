package homework.homework8;

public class DynamicArrayDemo2 {
    public static void main(String[] args) {
        DynamicArray2 da = new DynamicArray2();
        da.add(7);
        da.add(21);
        da.add(55);
        da.add(23);
        da.add(454);
        da.print();
        System.out.println();
        System.out.println(da.getByIndex(9));
        da.deleteByIndex(9);
        da.print();
        System.out.println();
        da.set(9, 7);
        da.print();
        System.out.println();
        da.add(9, 4);
        da.print();
        System.out.println();
        System.out.println(da.exists(7));
        System.out.println(da.getIndexByValue(60));
    }
}
