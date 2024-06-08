public class ConstructorInitialization {
    String carBrand;
    String carModel;
    ConstructorInitialization(String brandName, String modelName){
        carBrand = brandName ;
         carModel= modelName ;
    }
    void displayCarInfo() {
        System.out.println("Brand: " + carBrand);
        System.out.println("model: "+ carModel);
    }
    public static void main(String[] args) {
        ConstructorInitialization car = new ConstructorInitialization("Toyota", "Carmy");
        car.displayCarInfo();
    }
}