public class dcvdvdsfdf{
    public static void main(String[]args) {

        String s = "       java     is    eays  f  ";

        int count =0;
        for(int i=0;i<=s.length()-1;i++){
            // char ch  = s.charAt(i);

            if(s.charAt(i)!=' ' && (s.charAt(i)==s.length()-1 || s.charAt(i+1) ==' ')){
count++;
}}
System.out.println(count);
}}