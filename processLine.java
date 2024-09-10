public class processLine {
    public static void main(String[] args) {
        String line = "   hello";
        String newLine = processLine(line);
        System.out.println(newLine);
    }

    private static String processLine(String line) {
        if (line == null || line.isEmpty()) { // empty line
            return line;
        }
    
        char[] chars = line.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isAlphabetic(chars[i])) { // Capitalize the first alphabetic character found in the word
                chars[i] = Character.toUpperCase(chars[i]);
                break;
            }
        }
    
        return new String(chars);
    }
    
}
