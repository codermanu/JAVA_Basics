public class Static_Void {
    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // Main method
    public static void main(String[] args) {
        myStaticMethod();
        // myPublicMethod();

        Static_Void myobject = new Static_Void();
        myobject.myPublicMethod();
    }
}