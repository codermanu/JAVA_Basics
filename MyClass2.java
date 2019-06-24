class MyClass2 {
    public static void main(String[] args) {
        Student myObj3 = new Student();

        System.out.println("Name: " + myObj3.fname);
        System.out.println("Age: " + myObj3.age);
        System.out.println("Graduation Year: " + myObj3.graduationYear);
        myObj3.study(); // call abstract method
    }
}