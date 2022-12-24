package homework.homework2;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99, 111};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println();
        System.out.println("Min : " + min);

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }

        }
        System.out.println("Max : " + max);
    }


}




