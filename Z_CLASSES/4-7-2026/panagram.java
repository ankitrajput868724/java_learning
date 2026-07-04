public class panagram {

public static void main(String[]args ){
System.out.println(  inpanagram("a quick brown fox jumps over the lazy dog"));

}


    public static boolean inpanagram(String s){
        s = s.toLowerCase();
        if(s.length()<26){return false ; }


        for(char c='a' ; c<='z' ; c++)
        {
    if(!s.contains(c+"")){return false;}

    }
    return true;
}}