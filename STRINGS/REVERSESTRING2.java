public class REVERSESTRING2 {


    public static void m1(String s){


        String r = "";
        String rev = "";

        for(int i=s.length()-1 ; i>=0 ; i--){
            char ch = s.charAt(i);


            if(ch !=' '){
                r = ch+r;
                

            }   else{
                rev =rev+r+" ";
                r = "";
            }
        }
System.out.println(rev+r);
    }

    public static void main(String[] args){

m1("JAVA IS EASY");
    }
    
}
