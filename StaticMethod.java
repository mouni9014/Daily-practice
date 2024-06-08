public class StaticMethod {
    public static int add(int a, int b){
        return a + b;
    }
        public static int multiply(int a, int b){
            return a * b;
        }
        public static void main(String[] args) {
            int sum = StaticMethod.add(5,3);
         int product = StaticMethod.multiply(3,5);

         System.out.println(sum);
         System.out.println(product);
        }
           
        }

    

