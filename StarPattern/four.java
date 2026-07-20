public class four {
    public static void main(String[] args) {
        
        int n = 5;
int sp=n-1;
int st=1;
        for(int i=1 ; i<=n ; i++){

    for(int j=sp ; j>=1 ; j--){ System.out.print("  ");
    }
for(int k=1 ; k<=st/2+1 ;k++ ){
    // System.out.print("* ");

    // if(k==st||k==1 ||i==n )
    System.out.print(k+" ");
// else{System.out.print("  ");}

}
 for (int j = i - 1; j >= 1; j--) {
            System.out.print(j+" ");

}


System.out.println();
sp--;
st+=2;
    }

//     int ssp=1;
//     int sst = n*2-3;
// for(int i=1 ; i<=n ; i++){

//     for(int j=1 ; j<=ssp ; j++){System.out.print("  ");}
//     for(int k=1 ; k<=sst ; k++){
//         { System.out.print(k+" ");}

//         // System.out.print(k+" ");
//     }
//     System.out.println();
//     ssp++;
//     sst-=2;
// }
}
}