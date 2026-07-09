public class permutations {
public static void perm(String s , int start , int end){

    if(start == end){System.out.println(s);
        return;
    }
    for(int i=start ; i<=end ; i++){
        String s1 = Swap(s , start , i);
        perm(s1 , start+1 , end);

    }}
public static String Swap(String s , int i, int j){
    char[] ch = s.toCharArray();
    char temp = ch[i];
    ch[i] = ch[j];
    ch[j] = temp;

return new String(ch);
}



public static void main(String[] args) {
    String s = "abc";
    perm(s , 0 , s.length()-1);

}


}
