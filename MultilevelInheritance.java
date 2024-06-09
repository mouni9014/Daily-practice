class Animal{
    public void eat(){
        System.out.println("this animal eats food");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("this animal barks");
    }
}
class Puppy extends Dog{
    public void sleep(){
        System.out.println("this animal sleeps at night");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Puppy obj = new Puppy();
        obj.eat();
        obj.bark();
        obj.sleep();
    }
}
