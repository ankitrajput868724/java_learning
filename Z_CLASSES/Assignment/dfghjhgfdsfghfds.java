public class dfghjhgfdsfghfds {
public static void main(String[] args) {

int a=77;
int sum = 0;

while(a>9){
while(a>0){
int digit = a%10;
sum += digit;
a/=10;
}
sum=a;
a=0;
}
System.out.println(a);
}

}