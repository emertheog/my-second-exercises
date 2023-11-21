class single {
  protected String brand = "Ford";        // single class  attribute
  public void honk() {                    // single method
    System.out.println("Tuut, tuut!");
  }
}

class Car extends single {
  private String modelName = "Mustang";    // Car attribute
  public static void main(String[] args) {

    // Create a myCar object
    Car myCar = new Car();

    // Call the honk() method (from the single class) on the myCar object
    myCar.honk();

    // Display the value of the brand attribute (from the single class) and the value of the modelName from the Car class
    System.out.println(myCar.brand + " " + myCar.modelName);
  }
}