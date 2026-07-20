public class onn2 {
public static void main(String[] args) {

        int n = 5; // number of columns
        int num = 1; // starting number

        for (int i = 1; i <= n; i++) {

            

            if (i % 2 != 0) { // odd row → left to right
                for (int j = 1; j <= n; j++) {
                
                    System.out.print(num + "\t");
                    num++;
                }
            } else { // even row → right to left





                int end = num + n - 1; // last number of this row
                for (int j = end; j >= num; j--) {

                    
                    System.out.print(j + "\t");}
                
                num = end + 1; // move counter forward
            }
            System.out.println();
        }
    }
}