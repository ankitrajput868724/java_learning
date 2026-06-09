import java.util.Scanner;

public class Countvowels {
    public static void main(String []args){
    int vowelcount=0;
    int spacecount=0;


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String :-- ");
        String str = sc.nextLine();
        String target = "AEIOUaeiou";
            boolean flag = false;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);

            if(target.indexOf(c) !=-1){
                flag=true;
                vowelcount++;
                
            
            }if(c == ' '){
                spacecount++;
            }
        }

                
            if( flag == true){
                
                System.out.println("vowels count is "+vowelcount);
                System.out.println("Space count is "+spacecount);

            }
            else{System.out.println("not");}
            }
        }
    
    

