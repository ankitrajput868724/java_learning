public class three {
    public static void main(String[] args) {
        String s = "Hello World";
        char[] cc = s.toCharArray();

        for (int i = 0; i < cc.length; i++) {
            int count = 1; // start with integer 1

            // skip if already replaced with a digit
            if (cc[i] >= '0' && cc[i] <= '9') continue;

            for (int j = i + 1; j < cc.length; j++) {
                if (cc[i] == cc[j]) {
                    count++;
                    cc[j] = (char) ('0' + count); // replace duplicate with count
                }
            }

            if (count > 1) {
                cc[i] = '1'; // first occurrence becomes '1'
            }
        }

        System.out.println(new String(cc));
    }
}
