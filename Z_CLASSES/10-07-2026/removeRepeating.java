public class removeRepeating {

public static void main(String[] args) {

    String s = "java is very very easy java";
    String[] str = s.split(" ");

String result = "";

    for(int i=0 ; i<str.length ; i++){
        if(str[i].equals("") )continue;
        int count = 1;


        for(int j=i+1 ; j<str.length ; j++){

            if(str[i].equals(str[j])){
                str[j]="";
                count++;

}       


}
if(count==1){
    System.out.println(str[i]);
    // result+=str[i];
}
// System.out.println(result);

}
}
}
