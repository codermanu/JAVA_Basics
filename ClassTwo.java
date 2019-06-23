public class ClassTwo {
    final int y = 25;

    public static void main(String[] args) {
        ClassOne Object1 = new ClassOne();
        System.out.println(Object1.x);
        ClassTwo Object2 = new ClassTwo();
        System.out.println(Object2.y);
        ClassTwo Object3 = new ClassTwo();
        // Object3.y = 40; cannot assign a value to a final variable
        System.out.println(Object3.y);
        System.out.println(Object2.y);

    }
}