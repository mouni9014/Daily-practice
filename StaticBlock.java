


class Mobile{

    String brand;
    int price;
    static String name;

    public Mobile(){
        brand ="";
        price =200;
       System.out.println("in constructor");
    }

    static{
        name ="phone";
        System.out.println("in static block");

    }

    public void show(){
        System.out.println(brand + " :" + price + " :" + name);
    }
}
public class StaticBlock {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "smartphone";

    Mobile obj2 = new Mobile();
}
}