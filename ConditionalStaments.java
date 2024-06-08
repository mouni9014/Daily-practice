import java.util.Scanner;

public class ConditionalStaments {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        if (a>0){
            System.out.println("positive number");
        }
        else if(a<0){
            System.out.println("Negative number");
        }
        else{
            System.out.println("ZERO");
        }
    }
}