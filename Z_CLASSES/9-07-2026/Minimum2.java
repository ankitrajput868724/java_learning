public class Minimum2 {
    public static void main(String[] args) {
    String s = "abbcccdddd";
    int min1 = s.length();
    int min2 = s.length();
    char minchar1 = ' ';
    char minchar2 = ' ';


while(s.length()>0){
    char ch = s.charAt(0);
    String s1 = s.replace(ch+"","");
    int count = s.length() - s1.length();

    if(count<min1){
        min2=min1;
        min1=count;
        minchar2 = minchar1;
        minchar1 = ch;
    }

    else if(count < min2 &&count!=min1){
        min2 = count;
        minchar2 = ch;

    }s=s1;
}


System.out.println(min2 +"  "+minchar2);
System.out.println(min1+"    "+minchar1);


    }
}
