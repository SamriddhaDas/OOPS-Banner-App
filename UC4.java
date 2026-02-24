public class UC4 {

    public static void main(String[] args) {

        // -------------------------------------------------------
        // Step 1: Build reusable pattern pieces using String.join()
        // -------------------------------------------------------

        // Horizontal bar: *****
        String fullBar  = String.join("", "*", "*", "*", "*", "*");

        // Sides only: *   *
        String sideBar  = String.join("", "*", "   ", "*");

        // Right only:     *
        String rightBar = String.join("", "    ", "*");

        // Left only:  *
        String leftBar  = String.join("", "*", "    ");

        // Bottom bar for J: *   *
        String jBottom  = String.join("", "*", "  ", "*");

        // -------------------------------------------------------
        // Step 2: Store all banner lines in a String array
        // -------------------------------------------------------

        String[] bannerLines = {

            // Top border
            "============================================",
            "       WELCOME TO THE JAVA BANNER APP      ",
            "============================================",
            "",

            // Letter J
            "  *****   *****   *   *   *****  ",
            "    *       *     *   *   *   *  ",
            "    *       *     *****   *   *  ",
            "    *       *     *   *   *   *  ",
            "    *     *****   *   *   *****  ",
            "",

            // Label row
            "   J       A      V   A           ",
            "",

            // Bottom border
            "============================================",
            "  UC4: Array & Loops - Banner App Complete ",
            "============================================",

        };

        // -------------------------------------------------------
        // Step 3: Use enhanced for-loop to print all banner lines
        // -------------------------------------------------------

        for (String line : bannerLines) {
            System.out.println(line);
        }

        // -------------------------------------------------------
        // Step 4: Demonstrate String.join() building letter blocks
        // -------------------------------------------------------

        System.out.println();
        System.out.println("--- Detailed Letter Display using String Array + String.join() ---");
        System.out.println();

        // Letter J pattern stored using String.join() for each row
        String[] letterJ = {
            String.join("", "  ", fullBar),       //   *****
            String.join("", "    ", "*"),          //       *
            String.join("", "    ", "*"),          //       *
            String.join("", "*", "   ", "*"),      //   *   *
            String.join("", " ", "***")            //    ***
        };

        // Letter A pattern
        String[] letterA = {
            String.join("", "  ", "*"),            //    *
            String.join("", " ", "*", " ", "*"),   //   * *
            String.join("", fullBar),              //   *****
            String.join("", "*", "   ", "*"),      //   *   *
            String.join("", "*", "   ", "*")       //   *   *
        };

        // Letter V pattern
        String[] letterV = {
            String.join("", "*", "   ", "*"),      //   *   *
            String.join("", "*", "   ", "*"),      //   *   *
            String.join("", "*", "   ", "*"),      //   *   *
            String.join("", " ", "*", " ", "*"),   //    * *
            String.join("", "  ", "*")             //     *
        };

        // Print Letter J
        System.out.println("Letter J:");
        for (String row : letterJ) {
            System.out.println("  " + row);
        }

        System.out.println();

        // Print Letter A
        System.out.println("Letter A:");
        for (String row : letterA) {
            System.out.println("  " + row);
        }

        System.out.println();

        // Print Letter V
        System.out.println("Letter V:");
        for (String row : letterV) {
            System.out.println("  " + row);
        }

        System.out.println();

        // Print Letter A again (reusing same array - demonstrates reusability)
        System.out.println("Letter A (reused - demonstrating reusability):");
        for (String row : letterA) {
            System.out.println("  " + row);
        }

        System.out.println();
        System.out.println("========================================");
        System.out.println("UC4 Complete!");
        System.out.println("Concepts Used:");
        System.out.println("  1. String Array     - to store banner lines");
        System.out.println("  2. String.join()    - to build character patterns");
        System.out.println("  3. Enhanced for-loop - to print without repetition");
        System.out.println("========================================");
    }
}