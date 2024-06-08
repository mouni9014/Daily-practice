import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
         int num = scan.nextInt();
         int factorial = 1;
         /*int i =1;
         while(i <= num){
             factorial = factorial * i;
            i++;
         }
         System.out.println(factorial);*/
          for (int i =1; i<= num; i++){
            factorial *= i;
            System.out.println(factorial);
          }
    }
    
}
