public class five {

public static void main(String[] args) {
        int n = 5;  // number of rows

        for (int i = 1; i <= n; i++) {
            // print spaces for centering
            for (int s = 1; s <= n - i; s++) {
                System.out.print("\t");
            }


            // print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"\t");
            }

            //print decreasing numbers
            // for (int j = i - 1; j >= 1; j--) {
            //     System.out.print(j+"\t");
            // }
            System.out.println();
        }
    }
}

    

