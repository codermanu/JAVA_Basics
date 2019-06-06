public class TryandCatch {
    public static void main(String[] args) {
        try {
            int[] numbers = { 1, 2, 3, 4, 5 };
            System.out.println(numbers[10]);
        } catch (Exception e) {
            System.out.println("An error has occured");
        } finally {
            System.out.println("The try and catch is finished");
        }
    }
}