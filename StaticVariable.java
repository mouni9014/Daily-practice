
class Mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand + " :" + price + " :" + name);
    }
}
public class StaticVariable {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1200;
        Mobile.name = "smartphone";
        obj1.name = "phone";

        obj1.show();
        obj2.show();
    }
}
