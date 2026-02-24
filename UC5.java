import java.util.Collections;

public class UC5 {

    public static void main(String[] args) {

        // UC5: Array declaration + initialization in a SINGLE statement
        // String.join("", Collections.nCopies(n, ch)) repeats character ch n times
        String[] bannerLines = {

            // Line 1: Top border (40 stars)
            String.join("", Collections.nCopies(40, "*")),

            // Line 2: Empty padded line
            "*" + String.join("", Collections.nCopies(38, " ")) + "*",

            // Line 3: Welcome message centered in 40 chars
            "*" + String.join("", Collections.nCopies(11, " "))
                + "WELCOME TO OOPS"
                + String.join("", Collections.nCopies(12, " ")) + "*",

            // Line 4: Sub-title centered in 40 chars
            "*" + String.join("", Collections.nCopies(7, " "))
                + "Java Banner Application"
                + String.join("", Collections.nCopies(8, " ")) + "*",

            // Line 5: Empty padded line
            "*" + String.join("", Collections.nCopies(38, " ")) + "*",

            // Line 6: Empty padded line
            "*" + String.join("", Collections.nCopies(38, " ")) + "*",

            // Line 7: Bottom border (40 stars)
            String.join("", Collections.nCopies(40, "*"))
        };

        // Enhanced for loop: iterate through each line and print it
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}