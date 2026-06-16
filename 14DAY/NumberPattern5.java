import java.util.Scanner;
public class NumberPattern5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

for(int i=1 ; i<=n ; i++){
    if(i==1){
        for(int j=1 ; j<=n ; j++){
            System.out.print(j+"\t");}
        }else{
            for(int j=((i-1)*(n))+1 ; j<=n*i ; j++){System.out.print(j+"\t");}
        }
        System.out.println();

}


}
}