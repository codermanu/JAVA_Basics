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
        //Locate where My occurs
        System.out.println(name.indexOf("My"));  
        /*Java counts positions from zero.
        0 is the first position in a string, 1 is the second, 2 is the third ...*/
        
        //Add strings(Concatenation)
        String address = "I live in Paradise";
        System.out.println(name+" "+"and"+" "+address);
        System.out.println(name.concat(" ").concat(address));

        //Using special characters
        String team = "We are team \"Stark\"";
        System.out.println(team);
        





    }
}