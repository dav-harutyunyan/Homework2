package homework.homework8;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();

        da.add(2);
        da.add(56);
        da.add(90);
        da.add(34);
        da.print();
        System.out.println();
        System.out.println(da.getByIndex(2));
        da.deleteByIndex(7);
        da.print();
        System.out.println();
        da.set(7, 3);
        da.print();
        System.out.println();
        da.add(7, 3);
        da.print();
        System.out.println();
        System.out.println(da.exists(2));
        da.print();
        System.out.println();
        da.getIndexByValue(2);
        da.print();
    }
}