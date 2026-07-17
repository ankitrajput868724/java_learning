public class secondmax {
    public static void main(String[] args) {
        String s = "abbcccdddd";
int m1 = 0;
int m2 = 0;
char ch1 = ' ';
char ch2 = ' ';


for(int i=0 ; i<s.length() ; i++){
char c1 =  s.charAt(i) ;
if(c1==' ')continue;
    int count = 1;
    for(int j=i+1 ; j<s.length() ; j++){
        char c2 =  s.charAt(j) ;
        if(c1==c2){
            count++;
            c2=' ';
            m1 = count;
            ch1 = c1;
        }

    }
System.out.println(m1+"\t" +ch1);
}
}
}