public class BigStringPal {


public static Boolean ispal(String a){
    String reverse = "";
    for(int i= a.length()-1 ; i>=0 ; i--){
        reverse += a.charAt(i);

    }
    if(reverse.equals(a))
    return true;
else return false;
    }

public static void main(String[] args) {
        String result = "";
    String s = "Malayalam";
System.out.println("THE ALL POSSIBLE SUBSTRINGS ARE BELOW :) ");
for(int i=0 ; i<s.length() ; i++){
    for(int j=i+3 ; j<s.length() ; j++)
    {
        String r =(s.substring(i,j));
        if(ispal(r)){


    if ( r.length() > result.length() ) {
    result = r;}
}
}}
System.out.println(result);
}
}