public class maaaaxxx2 {
    public static void main(String[] args) {
        

        String s = "aabbbcccc";
        int max = 0;
        char maxch =' ';

        for(int i=0 ; i<=s.length()-1 ; i++){
char ch = s.charAt(i);
String str =s.replace(ch+"" , "");
int count = s.length()-str.length();

if(count>max){
    max = count;
    maxch = ch;

}


        }
        System.out.println(max+"   "+maxch);
    }
    
}
