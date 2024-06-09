class Animal{
    public void eat(){
        System.out.println("This animal eats food");
    }
public void sleep (){
    System.out.println("this animal sleeps");
}


    }
class Dog extends Animal{
    public void bark(){
        System.out.println("the dog barks");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();
    }
}
