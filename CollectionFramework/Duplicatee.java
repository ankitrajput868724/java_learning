public class Duplicatee {

    public static void main(String [] args){


        String s = "Hello World";
        char ch[] = s.toCharArray();


        for(int i=0 ; i<s.length() ; i++){
            char count = '1';
            for(int j=i+1 ; j<s.length() ; j++){

//             if(ch[i]>='0' && ch[j]<='9'){continue;}

                
                if(ch[i] == ch[j]){
            
            count++;
            ch[j] = count;

                }
                if(count !='1'){
                    ch[i] = '1';
                }
            }
           
        }
        System.out.println(ch);
    }
    
}
