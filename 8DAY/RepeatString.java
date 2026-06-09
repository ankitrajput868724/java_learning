import java.util.Scanner;
public class RepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count =0;
        String s = sc.nextLine();

        String str = "";
        int cou= 0;

        for(int i=0; i<s.length(); i++ ){
            char c = s.charAt(i);
            for(int j=i+1; j<s.length(); j++){
                char d = s.charAt(j);

                if(c == d){
                    // System.out.println("Repeating at Index "+i+" "+j);
                    cou++;
                    
                    
                }
            System.out.println("repeating char = "+c+" repeated "+cou+" times");

            }
        
        }

    }
    }
    

