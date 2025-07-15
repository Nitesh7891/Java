//switch statement
import java.util.Scanner;
public class switchh {
   public static void main(String[] var0) {
      Scanner var2 = new Scanner(System.in);
      System.out.println("write day number:");
      int var1 = var2.nextInt();
      switch (var1) {
         case 1:
            System.out.println("Monday");
            break;
         case 2:
            System.out.println("Tuesday");
            break;
         case 3:
            System.out.println("Wednesday");
            break;
         case 4:
            System.out.println("Thursday");
            break;
         case 5:
            System.out.println("Friday");
            break;
         case 6:
            System.out.println("Saturday");
            break;
         case 7:
            System.out.println("Sunday");
            break;
         default:
            System.out.print("Invalid");
      }

   }
}


