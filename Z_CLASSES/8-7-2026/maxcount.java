public class maxcount {
    public static void main(String[] args) {
        


        String s = "abbcccddddaaaaaaaaa";

        int max = 0;
        char maxchar = ' ';



        while(s.length()>0){
char ch = s.charAt(0);
String str = s.replace(ch+"","" );

int count = s.length()-str.length();


if(count>max){
    max = count;
    maxchar = ch;
}
s = str;

        }

        System.out.println(max +"\t" + maxchar);
    }

    
}
