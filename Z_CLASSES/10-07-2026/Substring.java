public class Substring {
public static boolean m1(String str){
String result = "";
for(int i=str.length()-1 ; i>=0 ; i--){
result+=str.charAt(i);

    }
if(result.equals(str))return true;
else return false;
}

    public static void main(String[] args) {
String result="";
String s = "malayalam";

for(int i=0 ; i<s.length() ; i++){
    for(int j=i+3 ; j<s.length() ; j++){
    if(m1(s.substring(i,j))){
        System.out.println(s.substring(i,j) );
    }
    }
}
}
}