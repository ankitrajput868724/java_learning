public class reverse1 {

    public static String m1(String s){
    String reverse="";
for(int i=0 ; i<s.length()  ;i++){
reverse  = s.charAt(i)+reverse;
}
    return reverse;     }
    public static void main(String[] args) {
        String s = "java is easy";
        String[] str =s.split(" ");
        String r = "";

        for(int i=0 ; i<str.length ; i++){
        System.out.print(m1(str[i])+" ");
            

        }

    }
    
}