public class TypeCasting{
    public static void main(String[] args){
        //Widening Cast
        int myInt = 10;
        double myDouble = myInt; // Automatic casting: int to double
    
        System.out.println(myInt);      // Outputs 10
        System.out.println(myDouble);   // Outputs 10.0
    }
}