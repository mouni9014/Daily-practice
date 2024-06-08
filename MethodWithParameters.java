public class MethodWithParameters {
    int length;
    int breadth;
    void setDimensions (int l, int b){
   length = l;
    breadth = b;
   }
   int calculateArea() {
    return length * breadth;
   }
   public static void main(String[] args) {
    MethodWithParameters rectangle = new MethodWithParameters();
    rectangle.setDimensions(5, 5);
    int area = rectangle.calculateArea();
    System.out.println("Area: "+ area);
   }
}
