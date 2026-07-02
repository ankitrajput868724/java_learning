public class Duplicate {
    public static void main(String[] args) {
        
        String orgstr = "aabbaaccddeeffaabbdgf";
        String resstr = "";

        for (int i = 0; i < orgstr.length(); i++) {
            char currentChar = orgstr.charAt(i);
            
            // Check if the character is already in the result string
            // indexOf returns -1 if the character is not found
            if (resstr.indexOf(currentChar) == -1) {
                resstr += currentChar;
            }
        }

        System.out.println(resstr); // Output: abcdef
    }
}


