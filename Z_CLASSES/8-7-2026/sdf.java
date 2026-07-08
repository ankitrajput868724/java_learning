public class sdf {
    public static void main(String [] args){

        String s = "aaabbccddee";
        char[] ch = s.toCharArray();
String result  = "";


        for(int i=0 ; i<=s.length()-1 ; i++){
            // if(ch[i] == (ch[i+1] )){
            //     result+=ch[i];
            for(int j=i ; j<s.length() ; j++){
                if(ch[i] =='\u0000' && ch[j] == '\u0000')continue;
                if(ch[i] == ch[j]){
                    ch[j] = '\u0000';
                    result+=ch[i];
}
}
}
System.out.println(result);
}
}