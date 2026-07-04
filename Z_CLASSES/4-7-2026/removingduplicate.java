public class removingduplicate {


    public static void main(String[] args) {
    String s = "aabbaaccddeeff";
    String str = "";



    for(int i=0;i<=s.length()-1 ; i++){
char ch = s.charAt(i);
        if(!str.contains(ch+"")){

                str+=ch;

        }
    }
    System.out.println(str);
    }}
