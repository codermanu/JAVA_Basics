public class TypeCasting{
    public static void main(String[] args){
        //Widening Cast
        int myInt = 10;
        double myDouble = myInt; // Automatic casting: int to double
    
        System.out.println(myInt);      // Outputs 10
        System.out.println(myDouble);   // Outputs 10.0

        //Narrowing Cast
        double myDouble1 = 13.34;
        int myInt1 = (int) myDouble1;
        System.out.println(myDouble1);
        System.out.println(myInt1);
    }
}