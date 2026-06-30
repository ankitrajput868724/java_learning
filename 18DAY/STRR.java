public class STRR{
    public static void main(String[]args){

        String s1 = "JAVADEV";
        // char c = {'A','E','I','O','U'};
        String s2 = "AEIOUaeiou";

    int c = 0;

    for(int i=0 ; i<s1.length() ; i++){
        for (int j=0 ; j<s2.length() ; j++){
            if(s1.charAt(i) != s2.charAt(j)){
            c++;
            }
        }


    }
    System.out.println(c);
    }
}