public class OOPSBannerAppUC7 {

    /**
     * Inner Static Class to store character and pattern
     */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        /**
         * Constructor
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to get pattern for character
     */
    public static String[] getCharacterPattern(char ch) {

        CharacterPatternMap[] patterns = {

            new CharacterPatternMap('O', new String[]{
                    " ******** ",
                    " *      * ",
                    " *      * ",
                    " *      * ",
                    " *      * ",
                    " *      * ",
                    " ******** "
            }),

            new CharacterPatternMap('P', new String[]{
                    " ******   ",
                    " *    *   ",
                    " *    *   ",
                    " ******   ",
                    " *        ",
                    " *        ",
                    " *        "
            }),

            new CharacterPatternMap('S', new String[]{
                    " ******   ",
                    " *        ",
                    " *        ",
                    " ******   ",
                    "      *   ",
                    "      *   ",
                    " ******   "
            })
        };

        for (CharacterPatternMap cp : patterns) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }

        return new String[7];
    }

    public static void main(String[] args) {

        String word = "OOPS";

        StringBuilder[] banner = new StringBuilder[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = new StringBuilder();
        }

        for (char ch : word.toCharArray()) {

            String[] pattern = getCharacterPattern(ch);

            for (int i = 0; i < 7; i++) {
                banner[i].append(pattern[i]).append("   ");
            }
        }

        for (StringBuilder line : banner) {
            System.out.println(line);
        }
    }
}