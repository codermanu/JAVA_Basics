public class Person {
    String fname = "Nadeesha";
    String lname = "Karunarathne";
    int age = 24;

    public static void main(String[] args) {
        Person Object1 = new Person();
        System.out.println("My name is " + Object1.fname + " " + Object1.lname);
        System.out.println("I am " + Object1.age + " years old");
    }
}