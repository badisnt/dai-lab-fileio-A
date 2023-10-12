package ch.heig.dai.lab.fileio.StefBianchet;

public class Transformer {

    private final String newName;
    private final int numWordsPerLine;

    /**
     * Constructor
     * Initialize the Transformer with the name to replace "Chuck Norris" with 
     * and the number of words per line to use when wrapping the text.
     * @param newName the name to replace "Chuck Norris" with
     * @param numWordsPerLine the number of words per line to use when wrapping the text
     */
    public Transformer(String newName, int numWordsPerLine) {
        this.newName = newName;
        this.numWordsPerLine = numWordsPerLine;
    }

    /**
     * Replace all occurrences of "Chuck Norris" with the name given in the constructor.
     * @param source the string to transform
     * @return the transformed string
     */
    public String replaceChuck(String source) {

        String oldName = "Chuck Norris";

        return source.replaceAll(oldName,newName);
    }

    /**
     * Capitalize the first letter of each word in the string.
     * @param source the string to transform
     * @return the transformed string
     */
    public String capitalizeWords(String source) {

        // https://www.geeksforgeeks.org/capitalise-the-first-and-last-character-of-each-word-in-a-string/
        // Create an equivalent char array
        // of given string
        char[] ch = source.toCharArray();
        for (int i = 0; i < ch.length; i++) {

            // k stores index of first character
            // and i is going to store index of last
            // character.
            int k = i;
            while (i < ch.length && ch[i] != ' ')
                i++;

            // Check if the character is a lowercase letter
            // If yes, then Capitalise
            ch[k] = (char)(ch[k] >= 'a' && ch[k] <= 'z'
                    ? ((int)ch[k] - 32)
                    : (int)ch[k]);
        }

        return new String(ch);
    }

    /**
     * Wrap the text so that there are at most numWordsPerLine words per line.
     * Number the lines starting at 1.
     * @param source the string to transform
     * @return the transformed string
     */
    public String wrapAndNumberLines(String source) {
        // TODO: Implement the method body here.
        // Use the StringBuilder class to build the result string.
        return "";
    }
}   