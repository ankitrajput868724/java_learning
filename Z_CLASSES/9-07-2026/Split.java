
public class Split {



    public static String m1(String s){
        String reverse = "";
        for(int i=s.length()-1 ; i>=0 ; i--){
            reverse+=s.charAt(i);


    }
return reverse;
    }
    public static void main(String[] args) {

        String s = "java is easy ";
        String[] str = s.split(" ");
// Arrays.toString(str) ;
System.out.println(str);

    for(int i=0 ; i<=str.length-1 ; i++){
System.out.println(m1(str[i]));
        }
    }
    
}
