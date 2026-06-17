import java.util.*;
public class NumberPattern6 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
int n = s.nextInt();
        for(int i=1 ; i<=n ; i++){
if(i%2 !=0){
    for(int j= ((i-1)*n)+1 ; j<=n*i ; j++){System.out.print(j+"\t");}
}
else{
    for(int j=n*i ; j>n*i-n ; j--){System.out.print(j+"\t");}
}System.out.println();

        }

    }
}

