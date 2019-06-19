public class JavaMethodsifelse {
    static void CheckAge(int age) {
        if (age < 18) {
            System.out.println("Access denied");
        } else {
            System.out.println("Access granted");
        }
    }

    public static void main(String args[]) {
        CheckAge(24);
    }
}