import java.util.HashMap;
import java.util.Map;

public class OOPSBannerAppUC8 {

    /**
     * Utility Method to Create Character Pattern Map
     */
    public static Map<Character, String[]> createCharacterPatterns() {

        Map<Character, String[]> patterns = new HashMap<>();

        patterns.put('O', new String[]{
                " ******** ",
                " *      * ",
                " *      * ",
                " *      * ",
                " *      * ",
                " *      * ",
                " ******** "
        });

        patterns.put('P', new String[]{
                " ******   ",
                " *    *   ",
                " *    *   ",
                " ******   ",
                " *        ",
                " *        ",
                " *        "
        });

        patterns.put('S', new String[]{
                " ******   ",
                " *        ",
                " *        ",
                " ******   ",
                "      *   ",
                "      *   ",
                " ******   "
        });

        return patterns;
    }

    /**
     * Utility Method to Render Banner
     */
    public static void renderBanner(String message, Map<Character, String[]> patterns) {

        int height = 7;

        StringBuilder[] banner = new StringBuilder[height];

        for (int i = 0; i < height; i++) {
            banner[i] = new StringBuilder();
        }

        for (char ch : message.toCharArray()) {

            String[] pattern = patterns.get(ch);

            for (int i = 0; i < height; i++) {
                banner[i].append(pattern[i]).append("   ");
            }
        }

        for (StringBuilder line : banner) {
            System.out.println(line);
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        String message = "OOPS";

        Map<Character, String[]> patterns = createCharacterPatterns();

        renderBanner(message, patterns);
    }
}