public class Takeone{

    public static void main(String[] args){
        String s = "java is easy";
        String result = "";
        String r="";
        for(int i=0 ; i<s.length() ; i++){
char ch = s.charAt(i);
if(ch !=' '){
    r=ch+r;
}
else{
    result = result+r+' ';
    r = "";
}
            }
            System.out.println(result+r);
        }
    }
