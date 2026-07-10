public class PrintPalWords {



    public static String m1(String s){
        String reverse = "";
for(int i=s.length()-1 ; i>=0 ; i--){
reverse+=s.charAt(i);
}
return reverse;
    }

    public static void main(String[] args) {
        String s = "madam sir madam anthea";
        String[] str =s.split(" ");

        for(int i=0 ; i<=str.length-1 ; i++){
            // if(str[i] == m1(str[i]) ){
            //     System.out.println(str[i]);
            // }
            // System.out.println(" METHOD    "+m1(str[i]) );
            // System.out.println(" FOR    "+str[i] );

            if(str[i].equals(m1(str[i]) ) ) {System.out.println( str[i] );}
            
        }



    }
    
}
