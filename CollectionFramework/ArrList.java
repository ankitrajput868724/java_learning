import java.util.ArrayList;
public class ArrList {

    public static void main(String[]args){

                        //ARRAY BASICS //

    //     int arr[] = new int[3];
    //     System.out.println(arr.length);

    // System.out.println(arr[0] = 1);
    //     System.out.println( arr[0] = 2);
    // System.out.println(arr[0] = 3);
    // System.out.println( arr[0] = 4);
    // System.out.println( arr[0] = 5);
    
            // INITILIZING ARRAY LIST   //

        
        ArrayList<Integer> list = new ArrayList<>();


        //ADDING ELEMENT//
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        list.add(90);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);


                //CREATING ANOTHER LIST//
        ArrayList<Integer> list2 = new ArrayList<>();
list2.add(100);
list2.add(101);
list2.add(20);
//ADDING ALL VALUES OF   LIST2   TO LIST
list.addAll(list2);
System.out.println(list);
System.out.println(list2);



                //REMOVING ELEMENTSS  //
        list.removeAll(list2);
        System.out.println(list);

                    //SIZE OF LIST//
        System.out.println(list2.size());


        //REMOVING ALL ELEMENTS OF LIST 2//

            list2.clear();  //clear method
            System.out.println(list2.size());
            System.out.println(list2);
}
}
