interface Animal{
    void eat();
}
interface Pet{
    void Play();
}
class Dog implements Animal, Pet{
    public void eat(){
        System.out.println("the dog eat food");
    }
    public void play(){
        System.out.println("the dog plays with a ball");
    }
    public void bark(){
        System.out.println("the dog barks");
    }
}
public class MultipleInhertance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        
        dog.bark();
    }
    
}
