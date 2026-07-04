public class Vowels {
public static void main(String[] args) {



    String s = "Ankii raj";
    String str = "AEIOUaeiou";

    String res = "";

    for(int i=0 ; i<str.length(); i++){
char ch = str.charAt(i);
if(! s.contains(ch+""))
    {
res+=ch;
    }
    }
    System.out.println(res);
    
}
}