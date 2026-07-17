public class BiggestSubstr {
    public static void main(String[] args) {

        String result = "";
    String s = "Malayalam";

System.out.println("THE ALL POSSIBLE SUBSTRINGS ARE BELOW :) ");

for(int i=0 ; i<s.length() ; i++){
    for(int j=i+3 ; j<s.length() ; j++)
    {
        String r =(s.substring(i,j));

    if ( r.length() > result.length() ) {
    result = r;
}




        

}}
System.out.println(result);
}
}