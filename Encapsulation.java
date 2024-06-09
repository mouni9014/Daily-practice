 class Person{
    private String name;
    private int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;

    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age > 0){
            this.age= age;
        }

    }
    public void displayDetails(){
        System.out.println("Name: " + name + "  Age: " + age);
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Person obj = new Person("mounika", 23);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());

        obj.setName("Ammulu");

        obj.setAge(23);
        obj.displayDetails();
    }
    
}
