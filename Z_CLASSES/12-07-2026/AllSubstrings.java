public class AllSubstrings {
public static void main(String[] args) {
String s = "Malayalam";


// String result = s.substring(0 , 5);

// System.out.println(result);

System.out.println("THE ALL POSSIBLE SUBSTRINGS ARE BELOW :) ");
for(int i=0 ; i<s.length() ; i++){
    for(int j=i+3 ; j<s.length() ; j++)
    {
        System.out.println(s.substring(i , j));
    }
}
}
}