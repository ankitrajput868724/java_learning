public class six {


    public static void main(String[] args) {
        int n = 5;  // number of rows for the top half

        // upper pyramid
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print("\t");
            }
            // increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"\t");
            }
            // decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
        
        // lower inverted pyramid
        for (int i = n - 1; i >= 1; i--) {
            // spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print("\t");
            }
            // increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"\t");
            }
            // decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}
