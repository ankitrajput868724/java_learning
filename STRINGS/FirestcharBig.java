                //JAVA PROGRAM TO CONVERT FIRST LETTER IS BIG     I/P = "java is easy"
                //                                                o/p = "Java Is Easy"


public class FirestcharBig {
    public static void main(String[] args) {
        
        String s = "java is easy";
        char ch[] = s.toCharArray();


        for(int i=0 ; i<=s.length()-1 ; i++){
                        //HERE WE ARE FATCHING THE CHARACTERS //
                        //IF THE CHARACTER IS BETWEEN (A - Z) AND BEFORE IT THERE IS A SPACE IT IS FETCHED//
            if( ch[i]!=' ' &&(i==0 || ch[i-1]==' ')){
                if(ch[i]>='a' && ch[i]<='z'){
                    ch[i]-=32;

                }
            }
        }



        System.out.println(ch);
    }
    
}
