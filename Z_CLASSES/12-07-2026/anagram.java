public class anagram {

    public static boolean m1(String a , String b){

        char ch = a.charAt(0);
        if(a.length()!=b.length())return false;
if(a.length()==0 && b.length()==0)return true;
        a = a.replace(ch+"" , "");
        b = b.replace(ch+"" , "");

        

        return m1(a,b);
    }

    public static void main(String[] args) {
String s = "silent and listen to me";
String r = "";
String[] str = s.split(" ");


for(int i=0 ; i<str.length ; i++){
    for(int j=i+1 ; j<str.length ; j++){
System.out.println(m1(str[i] , str[j]));

    }
}

}}