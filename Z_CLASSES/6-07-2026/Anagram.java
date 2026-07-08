public class Anagram {

    public static void main(String[] args) {
        
        String s1 = "listrn";
        String s2 = "silent";


        while (true) {
if(s1.length() != s2.length())  System.out.println("NOT ANAGRAM");
if(s1.length()==0 && s2.length()==0) System.out.println("ANAGRAM ");
    char ch = s1.charAt(0);

s1 = s1.replace(ch+"", "");
s2 = s2.replace(ch+"", "");

        }



}}