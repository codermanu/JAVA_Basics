public class Variables{
    public static void main(String[] args){
        String name = "Nadeesha"; //String variable
        System.out.println(name);
        int number = 10; //int variable
        System.out.println(number);
        float myFloatNum = 5.99f;
        System.out.println(myFloatNum);
        char myLetter = 'D';
        System.out.println(myLetter);
        boolean myBool = true;
        System.out.println(myBool);
        System.out.println("Hello "+name+" who is "+number+" years old.");

        //Combine two variables
        String firstName = "Nadeesha ";
        String lastName = "Karunarathne";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        //Print the sum of two numbers
        int a = 23;
        int b = 13;
        System.out.println(a+b);

        //declare more than one variable of the same type
        int x=3, y=6, z=9;
        System.out.println(x+y+z);
    }
}