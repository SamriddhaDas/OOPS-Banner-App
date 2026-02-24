public class UC6 {

    // Static method to build pattern for letter 'O'
    static String[] buildO() {
        return new String[] {
            " OOO ",
            "O   O",
            "O   O",
            "O   O",
            " OOO "
        };
    }

    // Static method to build pattern for letter 'P'
    static String[] buildP() {
        return new String[] {
            "PPP  ",
            "P  P ",
            "PPP  ",
            "P    ",
            "P    "
        };
    }

    // Static method to build pattern for letter 'S'
    static String[] buildS() {
        return new String[] {
            " SSS ",
            "S    ",
            " SSS ",
            "    S",
            " SSS "
        };
    }

    public static void main(String[] args) {

        // Build each character pattern using static methods
        String[] O = buildO();
        String[] P = buildP();
        String[] S = buildS();

        // Banner: O P S
        String[][] banner = { O, P, S };

        // Render banner line by line
        for (int line = 0; line < 5; line++) {
            StringBuilder sb = new StringBuilder();
            for (String[] ch : banner) {
                sb.append(ch[line]).append("  ");
            }
            System.out.println(sb.toString());
        }
    }
}