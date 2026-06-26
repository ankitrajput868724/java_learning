
import java.util.Scanner;
public class assss{






public static void main(String[]args){
	
	Scanner sc = new Scanner(System.in);
	
//String str = "a";
String str = sc.nextLine();

boolean b = false;
for(int i=1 ; i<str.length() ; i++){

char c = str.charAt(i);


if(c == '1'||c=='2' ||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'||c=='0')
{
    b=true;
}



}

if(b == true){System.out.println("numbers");}
else { System.out.println("Characters ");}

}
}