public class CharacterCount {
    public static void main(String[] args) {
        String a = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";

        int l = 0, sp = 0, n = 0, o = 0;

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);

            if (Character.isLetter(c))
                l++;
            else if (Character.isDigit(c))
                n++;
            else if (c == ' ')
                sp++;
            else
                o++;
        }

        System.out.println("letter: " + l);
        System.out.println("space: " + sp);
        System.out.println("number: " + n);
        System.out.println("other: " + o);
    }
}