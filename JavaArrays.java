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
    }
}