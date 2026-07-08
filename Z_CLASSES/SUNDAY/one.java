public class one{
    public static void main(String [] args){
        String s = "abacdcdeeff  zz";
        String r = "";
        int count=1;



        // for(int i=0 ; i<=s.length()-1 ; i++){
        //     if(! r.contains(s.charAt(i)+"")){
        //         r+=s.charAt(i);
        //         count++;
        //         System.out.println(s.charAt(i) + " OCCURE "+count);
        //         count=1;
        //     }
            
            
        // }
        // System.out.println(r);





        for(int i=0 ; i<=s.length()-1 ; i++){
            for(int j=1 ; j<r.length() ; j++){
                char ch = s.charAt(i);
                if(ch == '\u0000')continue;


                if(ch != s.charAt(j) && ch!='\u0000')
{
                r+=s.charAt(j);
            ch = ' ';
            count++;
        }




    }
    }
System.out.println(r);

    }
    }