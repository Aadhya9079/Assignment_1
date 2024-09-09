import java.util.*;

public class Number_Summer{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            ConsecutiveSums(number);
        }
     }

     public static void ConsecutiveSums(int number) {
         boolean found = false;

         for (int k = 2; k * (k - 1) / 2 < number; k++) {
             int numerator = number - k * (k - 1) / 2;

             if (numerator % k == 0) {
                 int a = numerator / k;

                 if (a > 0) {
                     printConsecutiveNumbers(a, k);
                     found = true;
                 }
             }
         }

         if (!found) {
             System.out.println(number + " cannot be expressed as the sum of two or more consecutive natural numbers.");
         }
     }

     public static void printConsecutiveNumbers(int start, int count) {
         System.out.print("Sum = " + count + " consecutive numbers: ");
         for (int i = 0; i < count; i++) {
             System.out.print((start + i));
             if (i < count - 1) {
                 System.out.print(" + ");
             }
         }
         System.out.println();
     }
 }