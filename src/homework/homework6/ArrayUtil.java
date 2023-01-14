package homework.homework6;

public class ArrayUtil {
    void maxarrey(int[] arrey) {
        int maximum = arrey[0];
        for (int i = 0; i < arrey.length; i++) {
            if (arrey[i] > maximum) {
                maximum = arrey[i];

            }

        }
        System.out.println(maximum);
    }

    void minarrey(int[] arrey) {
        int minimum = arrey[0];
        for (int i = 0; i < arrey.length; i++) {
            if (arrey[i] < minimum)
            minimum = arrey[i];

        }
        System.out.println(minimum);
    }

    void zuyg(int[] arrey) {
        int zuyg = arrey[0];
        for (int i = 0; i < arrey.length; i++) {
            if (arrey[i] % 2 == 0) {
                zuyg = arrey[i];
                System.out.print(zuyg + " ");

            }
        }
    }

        void kent ( int[] arrey){
            int kent = arrey[0];
            for (int i = 0; i < arrey.length; i++) {
                if (arrey[i] % 2 != 0) {
                    kent = arrey[i];
                    System.out.print(kent + " ");

                }
            }
        }

        void zuygiqanak (int[] arrey) {
        int qanak = 0;
            for (int i = 0; i < arrey.length; i++) {
                if(arrey[i] % 2 == 0){
                    qanak++;

                }

            }
            System.out.println(qanak);
        }

        void kentiqanak (int [] arrey) {
        int qanak = 0;
        for (int i = 0; i < arrey.length; i++) {
            if(arrey[i] % 2 != 0){
                qanak++;
            }

        }
            System.out.println(qanak);
    }
    }
