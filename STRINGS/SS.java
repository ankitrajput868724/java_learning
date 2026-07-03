//MOSTLY BASICS I HAD COVERED IN THIS SS CLASS OF STRINGS USING   [CHARAT METHOD AND  .TOCHARARRAY METHOD 
//       I WILL CREATE SS1 FOR REMANING BASICS  OF STRINGSSSSSSSSSSSSAS...........:)          ]

public class SS{
public static void main(String[] args){

String s = "ankit singh shekhawat";   String s1 = s;


char ch[] = s.toCharArray();          char ch2[] = s.toCharArray();         char ch3[] = s.toCharArray();
    // System.out.println(ch);

for(int i=0 ; i<=s.length()-1 ; i++){

if(ch[i]!=' ' &&(i==s.length()-1 || ch[i+1] == ' ')){

ch[i]-=32;
}}

System.out.println("IN THIS I MADE THE LAST CHARACTER BIGGER :)  ");
System.out.println( ch);


System.out.println("------------------------------------------------------------------------");


for(int i=0 ; i<=s1.length()-1 ; i++){
    if(ch2[i]!=' '&&(i==0 || ch2[i-1]==' '))
        {
            ch2[i]-=32;
        }

}

System.out.println("IN THIS I AM MAKING THE FIRST CHARACTER BIGGER :(  ");
System.out.println(ch2);


System.out.println("-----------------------------------------------------------------------------------");

for(int i=0 ; i<s.length()-1 ; i++){

if(ch3[i]=='a'|| ch3[i] == 'e' || ch3[i] =='i'|| ch3[i] == 'o' ||ch3[i]=='u' ||
ch3[i]=='A'|| ch3[i] == 'E' || ch3[i] =='I'|| ch3[i] == 'O' ||ch3[i]=='U')
{ch3[i] = '_';}
}

System.out.println("MAKING THE VOWELS _");
System.out.println(ch3);


System.out.println("---------------------------------------------------------------");


String str = "abbcaa";char ch4[] = str.toCharArray();

for(int i=0 ; i<=str.length()-1 ; i++){
if(ch4[i]!=' ' && (i==str.length()-1 ||ch4[i] == ch4[i+1])){
    ch4[i+1] =' ';
}
}
System.out.println(" REPLACING consecutivellyyy 2-2 repeating characters into empty space  :)  ");
System.out.println(ch4);




}
}