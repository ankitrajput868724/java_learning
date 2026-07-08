public class AscendingString {
    public static void main (String[] args){
    String s = "ZzasdcvzxdeeZ";
    s = s.toLowerCase();
    char c[] = s.toCharArray();
    for(int i=0 ; i<c.length ; i++){
    for(int j=0 ; j<c.length-1-i ; j++){
    if(c[j] < c[j+1]){
    char temp = c[j];
    c[j]= c[j+1];
    c[j+1]= temp;
}
}
    }
    System.out.println((c));
        for(int i=0 ; i<c.length ; i++){
    for(int j=0 ; j<c.length-1-i ; j++){

    if(c[j] > c[j+1]){
    char temp = c[j];
    c[j]= c[j+1];
    c[j+1]= temp;
}
}
    }
System.out.println(c);
    }
}