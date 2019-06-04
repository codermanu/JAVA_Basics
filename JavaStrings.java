public class JavaStrings{
    public static void main(String[] args){
        String name = "My name is Nadeesha Madhushani";
        System.out.println(name);
        //Prints the length of the given text
        System.out.println("The length of the text given is "+name.length());

        //Use Uppercase method to convert the text to uppercase
        System.out.println(name.toUpperCase());

        //Use lowercase method to convert the text to lowercase
        System.out.println(name.toLowerCase());
        
        //Locate where Nadeesha occurs
        System.out.println(name.indexOf("Nadeesha"));
        System.out.println(name.indexOf("My"));



    }
}