public class CountofWords {


    public static void main(String[] args) {


        String s = "    JAVA IS    EASY";
        int count = 0;

        for(int i=0 ; i<=s.length()-2 ; i++){
        

                if(s.charAt(i) != ' ' && (i==0 || s.charAt(i-1) == ' '))
count++;}
    System.out.println(count);
}}


