public class RemovingextraSPACE {
    public static void main(String[] args) {

        String s = "    Ankit     Singh     Shekhawat             ";
boolean b = false;
        String result = "";
        for(int i=0 ; i<=s.length()-1 ; i++){

            char ch = s.charAt(i);
            if(ch !=' '){
        result+=ch;
    b=false;
            }
            else{
                if(!b){
                    result+=" ";
                    b=true;
                }
            }



        }
result = result.trim();
System.out.println(result);
}
}