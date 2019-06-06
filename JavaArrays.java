import java.util.Arrays;

public class JavaArrays{
    public static void main(String[] args){
        String[] friends = {"Ravindu","Binuri", "Nilakshi","Harshi"};
        //Outputs a value in a certain index
        System.out.println(friends[1]); 

        //Change an item in the array
        friends[0]="Sevani";
        //Array is an object, so it has to be converted to string again to print it
        System.out.println(Arrays.toString(friends));

        //Print the length of the array
        System.out.println(friends.length);

        //Print the elements in the array through a for loop
        for (int i=0; i<friends.length; i++){
            System.out.println(friends[i]);
        }
        //Print the elements in the array through a for each loop
        for (String i : friends){
            System.out.println(i);
        }

        //Multidimensional Arrays
        int[][] age = {{23,24,25,34},{33,27,29}};
        int x = age[1][0];
        System.out.println(x);
        //print the elements in the multidimensional array
        for (int a = 0; a < age.length; ++a) {
            for(int b = 0; b < age[a].length; ++b) {
               System.out.println(age[a][b]);
            }
         }

    }
}