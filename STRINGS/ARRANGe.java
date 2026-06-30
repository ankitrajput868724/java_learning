
public class ARRANGe {


                //PALINDROME PROGRAMME//
    public static boolean ispalindrome(String S)
    {
        int i=0;
        int j=S.length()-1;
    while(i<j){
        if (S.charAt(i) != S.charAt(j)) return false;
    
    i++;
    j--;
    }
    return true;
    }





    public static void main(String[]args){

        String s = "AN123456!@#$#asdvfg";
        String up = "";      int upp=0;
        String lc = "";         int lower=0;
        String Num = "";        int Number=0;
        String sp = "";             int special=0;

int sum=0;
        for(int i=0 ; i<=s.length()-1 ; i++){
char ch = s.charAt(i);
            if(ch>='A' && ch<='Z'){
        upp++;
        up+=ch;

            }
        else if(ch>='a' && ch<='z'){
                lower++;
                lc+=ch;

            }
        else  if(ch>='0' && ch<='9'){
                Number++;
                Num+=ch;
            }else{
                special++;
                sp+=ch;
            }
        }
    
        System.out.println("upper character count is "+upp+" upper xharacters are "+up);
        System.out.println("lowercase char count is "+lower+" lower case are "+lc);
        System.out.println("Numbers count is"+Number+" numbers are "+Num);
System.out.println("count is "+special+"Special char are "+sp);

String str = up+lc+Num+sp;
        System.out.println("The ARRANGMENT LOOK LIKE THIS"+str);



        for(int i=0 ; i<=s.length()-1 ; i++){
            char ch = s.charAt(i);
            if(ch>='0' && ch<='9'){

                int digit = ch-'0';
                sum+=digit;

            
            }
        }

        System.out.println(sum);


        System.out.println("GIVEN STRING is pal or not  :) "+ispalindrome(s));
    

    }
    
}
