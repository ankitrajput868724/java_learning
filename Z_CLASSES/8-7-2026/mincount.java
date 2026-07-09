public class mincount {
    public static void main(String[] args) {

String s = "aabbcddd";
int min = s.length();

char minchar = ' ';



while(s.length()>0){
    char ch = s.charAt(0);

    String str = s.replace(ch+"" , "");
    int count = s.length()-str.length();
if(count<min){
    min = count;
    minchar = ch;
}
s = str;
}
System.out.println(minchar+"\t"+min);
}
}
