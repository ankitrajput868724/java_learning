public class toupper {
public static void main(String[] args) {


    String s = "JAVA is easy ";

    char ch[] = s.toCharArray();




for(int i=0 ; i<=s.length()-1 ; i++){

if(ch[i]>='a' && ch[i]<='z'){
ch[i]-=32;

}
else if(ch[i]>='A' && ch[i]<='Z'){ch[i]+=32;}
    }   System.out.println(ch);
}

}
