public class BasicClass {
    String name;
    int age;
    void displayDetails(){
        System.out.println("name " + name);
        System.out.println("age " + age);
    }
    public static void main(String[] args) {
        BasicClass obj = new BasicClass();
        obj.name = "Hello";
        obj.age = 23;
        obj.displayDetails();
    }
}
