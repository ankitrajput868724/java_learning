import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
    String sum = "";
    String str = sc.nextLine();

        for(int i=str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
sum+=ch;
        }
        System.out.println(sum); 

    }
    }