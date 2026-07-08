public class Taketwo {
public static void main(String[] args) {
String s = "java is easy";
String result = "";
String r = "";



for(int i=s.length()-1 ; i>=0; i--){

    char ch = s.charAt(i);

    if(ch!=' '){r = ch+r;}
else{
    result = result+r+" ";
    r = "";
}
}
System.out.println(result+r);

}
}