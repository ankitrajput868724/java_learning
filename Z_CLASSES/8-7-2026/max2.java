public class max2 {
public static void main(String[] args) {
String s = "aaabbbaabbbcderghnjhfvnmm";
int max1 = 0;
int max2=0;
char char1 = ' ';
char char2 = ' ';
while(s.length()>0){
char ch = s.charAt(0);
String str = s.replace(ch+"","");
int count = s.length()-str.length();
if(s.charAt(0)==' ')continue;
            if (count > max1) {
                // shift current max1 into max2
                max2 = max1;
                char2 = char1;
                max1 = count;
                char1 = ch;
            } else if (count > max2) {
                max2 = count;
                char2 = ch;
            }
            s = str;
        }
        System.out.println(max1 + "\t" + char1);
        System.out.println(max2 + "\t" + char2);
    }
}