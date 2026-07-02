public class UppertoLower{
    public static void main(String[] args) {

String s = "java";

char[]ch = s.toCharArray();



for(int i=0 ; i<s.length() ; i++){
    if(s.charAt(i)>='a' && s.charAt(i)<='z' )
        ch[i]-= 32;

    else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){ch[i]+=32;}


    
}
System.out.println(ch);


}
}