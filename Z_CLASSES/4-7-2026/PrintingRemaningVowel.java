public class PrintingRemaningVowel {
public static void main(String[] args){

String s = "Ankit Singh Shekhawat";
String str = "AEIOUaeiou";
String result = "";


for(int i=0 ; i<str.length() ; i++){

    char ch = str.charAt(i);

    if(!s.contains(ch+"")){
    result+=ch;
}
}

    System.out.println("REMANING VOWELS IN THIS SEQUENCE ARE   :) "+result);
}
}