public class ForLoop{
    public static void main(String[] args){
        //print integers less than 10 through a for loop
        for (int i=0; i<10; i++){
           System.out.println(i);
        }
        
        //For each loop
        //print each item in a list
        String[] Starkfamily ={"Ned Stark","Catelyn Stark","Robb Stark","John Snow","Sansa Stark","Arya Stark","Brandon Stark","Rickon Stark"};
        for (String x : Starkfamily){
            System.out.println(x);
        }
        
    }
}