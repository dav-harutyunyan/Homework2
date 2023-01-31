package homework.homework9;

public class BraceChecker {
    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack st = new Stack();
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    st.push(text.charAt(i));
                    break;
                case ')':
                    char a = st.pop();
                    if (a != '(') {
                        System.out.print("Error: opened " + a + " but closed ) at " + i);
                    }
                    break;
                case ']':
                    char b = st.pop();
                    if (b != '[') {
                        System.out.print("Error: opened " + b + " but closed ] at " + i);
                    }
                    break;
                case '}':
                    char c = st.pop();
                    if (c != '{') {
                        System.out.print("Error: opened " + c + " but closed } at " + i);
                    }
                    break;
            }
        }
        //  for (int i = 0; i < ; i++) {

        //  }
    }
}

