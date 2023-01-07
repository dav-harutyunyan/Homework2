package homework.homework4;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e',};
        char c = 'o';
        int a = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                a++;
                System.out.println(a);

            }
        }
        int i1 = chars.length / 2;
        int i2 = i1 - 1;
        System.out.println(chars[i2] + " " + chars[i1]);
        System.out.println();

        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o','l', 'y',};
        System.out.println(chars3[chars3.length - 1] == 'y' && chars3[chars3.length - 2] == 'l');
        System.out.println();

        char[] text = {' ',' ','b','a','r','e','v',' ',' '};
        for (int i = 0; i <text.length; i++) {
            if(text[i] != ' ');
            System.out.print(text[i] + " ");

        }

    }
}

