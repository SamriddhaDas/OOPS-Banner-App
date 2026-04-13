/**nuybyu
 * OOPSBannerApp UC7 - Store Character Pattern in a Class
 *
 * This use case extends UC6 by implementing a CharacterPatternMap class to encapsulate
 * character-to-pattern mappings. The application retrieves and displays the "OOPS"
 * banner using these mappings. This approach enhances code organization and modularity.
 *
 * @author Developer
 * @version 7.0
 */

public class UC7 {

    /**
     * CharacterPatternMap - Inner class for storing character-to-pattern mappings.
     * Encapsulates a single character and its corresponding ASCII art pattern.
     */
    static class CharacterPatternMap {
        private Character character;
        private String[] pattern;

        /**
         * Constructs a CharacterPatternMap with a character and its pattern.
         *
         * @param character the character to be mapped
         * @param pattern the ASCII art pattern represented as an array of strings
         */
        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Retrieves the mapped character.
         *
         * @return the character associated with this pattern map
         */
        public Character getCharacter() {
            return character;
        }

        /**
         * Retrieves the ASCII art pattern.
         *
         * @return the pattern array representing the character
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Creates and initializes CharacterPatternMap array for predefined characters.
     *
     * @return array of CharacterPatternMap objects containing character patterns
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        CharacterPatternMap[] characterPatternMap = new CharacterPatternMap[4];

        characterPatternMap[0] = new CharacterPatternMap('O', new String[] {
            " *** ",
            "** **",
            "** **",
            "** **",
            "** **",
            "** **",
            " *** "
        });

        characterPatternMap[1] = new CharacterPatternMap('P', new String[] {
            "***** ",
            "**  **",
            "**  **",
            "***** ",
            "**    ",
            "**    ",
            "**    "
        });

        characterPatternMap[2] = new CharacterPatternMap('S', new String[] {
            " *****",
            "**    ",
            "**    ",
            " *****",
            "    **",
            "    **",
            "***** "
        });

        characterPatternMap[3] = new CharacterPatternMap(' ', new String[] {
            "  ",
            "  ",
            "  ",
            "  ",
            "  ",
            "  ",
            "  "
        });

        return characterPatternMap;
    }

    /**
     * Retrieves the ASCII pattern for a given character.
     *
     * @param ch the character to look up
     * @param charMaps the array of CharacterPatternMap objects to search through
     * @return the pattern array for the given character, or space pattern if not found
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == Character.toUpperCase(ch)) {
                return map.getPattern();
            }
        }
        return getCharacterPattern(' ', charMaps);
    }

    /**
     * Prints a message as a banner using ASCII art patterns.
     *
     * @param message the message string to be displayed as a banner
     * @param charMaps the array of CharacterPatternMap objects containing available patterns
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        for (int line = 0; line < 7; line++) {
            StringBuilder output = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {
                String[] pattern = getCharacterPattern(message.charAt(i), charMaps);
                output.append(pattern[line]).append(" ");
            }

            System.out.println(output.toString());
        }
    }

    /**
     * Main method - Entry point for the banner display application.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}
