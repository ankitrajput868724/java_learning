public class two {

    public static void main(String[] args) {
    
        
        String s = "java";
        String str = "";
    

        for(int i =0; i<s.length()-1 ; i++){
            char ch1 = s.charAt(i);
            int count = 1;
            for(int j=i+1 ; j<s.length() ; j++){
        
            char ch2 = s.charAt(j);
if(ch2 == '\u0000')continue;
            if(ch1 == ch2){
                ch2 ='\u0000';
                count++;
            }
            }
                    if(count==1){
                str+=ch1;
        
            }



        }
System.out.println(str);
    }}