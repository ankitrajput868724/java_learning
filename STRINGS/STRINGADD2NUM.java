public class STRINGADD2NUM{

    public static void main(String[] args) {
String str = "H12@DSFD32dsfgf";
int sum = 0;
int n = 0;


for(int i=0 ; i<=str.length()-1 ; i++){
    if(str.charAt(i)>='0' && str.charAt(i)<='9'){
        n=(n*10)+str.charAt(i)-'0';
    }
    else if(n>0){
        sum+=n;
        n=0;
    }
}
if(n>0){sum+=n;}

System.out.println(sum);

    }


}