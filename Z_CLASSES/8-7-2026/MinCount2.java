public class MinCount2 {

    public static void main(String[]args){
        String s = "aabbc";

        int min1 = s.length();
        int min2 = 0;
        char minchar1 = ' ';
        char minchar2 = ' ';



        while(s.length()>0){

            char ch = s.charAt(0);
String st = s.replace(ch+"" , "");
int count = s.length()-st.length();

if(count<min1){
    min2 = min1;
    min1 = ch;
    minchar2 = minchar1;
    minchar1 = ch;
}
else if(count < min2 && count!=min1){
    min2 = count;
    minchar2 = ch;


}st = s;
        }
        System.out.println(minchar2 +"   :)  "+min2);
    }
    
}