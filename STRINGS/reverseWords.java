                //INPUT ----- "JAVA IS EASY"//
                //OUTPUT ----"AVAJ SI YSAE"//

                import java.util.Scanner;
public class reverseWords {
    public static void m1(String s){
String r="";
String rev="";

        for(int i=0; i<=s.length()-1 ; i++){
            char ch = s.charAt(i);

            if(ch!=' '){
        r = ch+r;
        // System.out.println(r);
            }


        else{
        rev+=r+" ";
        r="";
}}
        rev+=r;
    
System.out.println(rev);


        
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);


System.out.println("Enter A STRING :( ");
String s = sc.nextLine();

m1(s);

sc.close();
    }
}
