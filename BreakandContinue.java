public class BreakandContinue{
    public static void main(String[] args){
        for (int i=0; i<10; i++){
            if (i==5){
                break; //stops the loop when i=5
            }
            System.out.println(i);
        }
        for (int x=0; x<10; x++){
            if (x==5){
                continue; //skip 5 abnd print the rest
            }
            System.out.println(x);
        }
        
    }
}