import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a>=b && a>=c){
            System.out.println("A is largest number");
        }
     else if(b>=a && b>=c){
        System.out.println("B is largest number");

     }  
     else{
        System.out.println("C is largest number");
     } 
    }
}
