public class UC3 {
    public static void main(String[] args) {

        // Letter O
        String o_line1 = String.join("", " ", "O", "O", "O", " ");
        String o_line2 = String.join("", "O", " ", " ", " ", "O");
        String o_line3 = String.join("", "O", " ", " ", " ", "O");
        String o_line4 = String.join("", "O", " ", " ", " ", "O");
        String o_line5 = String.join("", " ", "O", "O", "O", " ");

        // Letter P
        String p_line1 = String.join("", "P", "P", "P", " ", " ");
        String p_line2 = String.join("", "P", " ", " ", "P", " ");
        String p_line3 = String.join("", "P", "P", "P", " ", " ");
        String p_line4 = String.join("", "P", " ", " ", " ", " ");
        String p_line5 = String.join("", "P", " ", " ", " ", " ");

        // Letter S
        String s_line1 = String.join("", " ", "S", "S", "S", " ");
        String s_line2 = String.join("", "S", " ", " ", " ", " ");
        String s_line3 = String.join("", " ", "S", "S", "S", " ");
        String s_line4 = String.join("", " ", " ", " ", " ", "S");
        String s_line5 = String.join("", " ", "S", "S", "S", " ");

        // Print OOPS Banner
        System.out.println(String.join("  ", o_line1, o_line1, p_line1, s_line1));
        System.out.println(String.join("  ", o_line2, o_line2, p_line2, s_line2));
        System.out.println(String.join("  ", o_line3, o_line3, p_line3, s_line3));
        System.out.println(String.join("  ", o_line4, o_line4, p_line4, s_line4));
        System.out.println(String.join("  ", o_line5, o_line5, p_line5, s_line5));
    }
}