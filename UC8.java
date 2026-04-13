/**
 * OOPSBannerApp UC8 - Use Map for Character Patterns and Render via Function
 *
 * This use case extends UC7 by utilizing the Java Collections Framework
 * such as the HashMap to manage character patterns in a more flexible
 * and efficient manner. The application retrieves and displays the "OOPS"
 * banner using these mappings.
 *
 * @author Developer
 * @version 8.0
 */

import java.util.HashMap;

public class UC8 {

    /**
     * Creates a HashMap containing ASCII art patterns for supported characters.
     *
     * @return a HashMap where keys are characters and values are String arrays
     *         representing the ASCII art pattern lines for each character
     */
    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<Character, String[]>();

        charMap.put('O', new String[] {
            " *** ",
            "** **",
            "** **",
            "** **",
            "** **",
            "** **",
            " *** "
        });

        charMap.put('P', new String[] {
            "***** ",
            "**  **",
            "**  **",
            "***** ",
            "**    ",
            "**    ",
            "**    "
        });

        charMap.put('S', new String[] {
            " *****",
            "**    ",
            "**    ",
            " *****",
            "    **",
            "    **",
            "***** "
        });

        charMap.put(' ', new String[] {
            "  ",
            "  ",
            "  ",
            "  ",
            "  ",
            "  ",
            "  "
        });

        return charMap;
    }

    /**
     * Displays a banner message using the provided character map.
     *
     * @param message the message string to display as a banner
     * @param charMap a HashMap containing character patterns
     */
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        int patternHeight = charMap.get('O').length;

        for (int line = 0; line < patternHeight; line++) {
            StringBuilder sb = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = charMap.get(Character.toUpperCase(ch));

                if (pattern == null) {
                    pattern = charMap.get(' ');
                }

                sb.append(pattern[line]).append(" ");
            }

            System.out.println(sb.toString());
        }
    }

    /**
     * Main method - Entry point of the application.
     *
     * @param args command-line arguments (not used in this application)
     */
    public static void main(String[] args) {
        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, charMap);
    }
}
