//abstract class
abstract class Persons {
    public String fname = "Ravindu";
    public int age = 23;

    public abstract void study();
}

class Student extends Persons {
    public int graduationYear = 2018;

    public void study() {
        System.out.println("Studying all day long");
    }
}