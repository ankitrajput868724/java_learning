public class repeat2 {
        public static void main(String[] args) {
        


String s = "BOSSSSSS";
char []ch  =s.toCharArray();


for(int i=0 ; i<=ch.length-2 ;i++ ){

    // if(ch[i+1] == ch.length-1)continue;
    
    if( ch[i] ==ch[i+1])
        ch[i+1] = '@';
    
}
System.out.println(ch);
// for(int i=0 ; i<ch.length ; i++){
//     if(ch[i] == ' ') continue;
//     for(int j =i+1 ; j<ch.length ; j++){
//         if(ch[i] ==ch[j]){
//             ch[j] = '_';}
    
//     }
    // System.out.print(ch[i]);
}
    }