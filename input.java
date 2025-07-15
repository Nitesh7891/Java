//for taking input
import java.util.Scanner;
class input {
    public static void printNumber(Scanner sc) {
        System.out.println("provide input");
 int num=sc.nextInt();
   System.out.println(num);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     printNumber(sc);
}
}