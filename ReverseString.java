public class ReverseString {
    public static void main(String[] args) {
        
        String input = "Hello";
        String reversedString = "";
        for(int i = input.length()-1; i>=0; i--){
            reversedString  += input.charAt(i);
        }
        System.out.println(reversedString);
    }
    
}
