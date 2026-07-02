import java.util.Scanner;
public class SearchingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER STRING");
        String str = sc.nextLine();

        System.out.println("Enter the value you want to search :) ");
       char s = sc.next().charAt(0);
        for(int i=0 ; i<=str.length()-1 ; i++){
char c = str.charAt(i);

if(c == s){
    System.out.println("FOUND AT INDEX "+i);
}
else{System.out.println("Target not found :(");}
            {

            }


        }

    }
}
