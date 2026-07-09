import java.util.Scanner;
public class rangechar {

    public static void main(String[] args) {
String s ="JAAADEV";

Scanner sc = new Scanner(System.in);
int st = sc.nextInt();
int end = sc.nextInt();
String str = "";

if(st  == end && (st>s.length() || end>s.length()) )System.out.println("INVALID");


for(int i=st ; i<s.length() ; i++){

if(i>=end)continue;
else str+=s.charAt(i);

}





System.out.println(str);
    }
    
}
