package chapter.chapter6;

public class Box4Demo {
    public static void main(String[] args) {
        Box4 mybox1 = new Box4();
        Box4 mybox2 = new Box4();
        double vol;

        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);

        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);


    }
}
