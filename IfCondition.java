public class IfCondition{
    public static void main(String[] args) {
      int age = 30;
      if (age < 28) {
        System.out.println("You are suitable for the job.");
      } else if (age < 20) {
        System.out.println("You are too young for the job, try in the future.");
      }  else {
        System.out.println("You are too old for the job, We are sorry!.");
      }

      int marks =75;
      
          String result = (marks < 80) ? "Failed." : "Passed.";
          System.out.println(result);
      

    }
  }
  