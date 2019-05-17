package util;
import java.util.Scanner;
public class Input {
    private Scanner scanner = new Scanner(System.in);

      public String getString(){
          System.out.println("Please enter a sentence");
          String myString = scanner.nextLine();
          return myString;
        }
        public Boolean yesNo(){
            System.out.println("Please enter yes or no");
            String y = scanner.next();
          if(y.equals("y") || y.equals("yes")){
              return true;
          } else {
              return false;
          }
        }
      public int getInt(int min, int max){
          System.out.printf("Please enter a number between %d and %d", min, max);
          int userNumber = Integer.parseInt(scanner.nextLine());
          if(userNumber > min && userNumber < max){
              return userNumber;
          } else {
              return getInt(min,max);
          }
      }
      public double getDouble(double min, double max){
          System.out.printf("Please enter a number between %f and %f", min, max);
          double userNumber = Double.parseDouble(scanner.nextLine());
          if(userNumber > min && userNumber < max){
              return userNumber;
          } else    {
              return getDouble(min,max);
          }
      }

}

