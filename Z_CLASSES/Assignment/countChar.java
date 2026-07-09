                //COUNT REMOVING CHAR - '.' ,  ','   ,  '_'

public class countChar {
    public static void main(String[] args){
        String str = "aaAA.,_12@!";
int count=0;
String s = ".,_";

        for(int i=0 ; i<str.length() ; i++){
char ch = str.charAt(i);

if(!s.contains(ch+"")) count++;



        }
        System.out.println("THE COUNT IS :)  "+count);
    }
    
}
