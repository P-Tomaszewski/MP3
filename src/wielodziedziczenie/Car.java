package wielodziedziczenie;

import java.time.LocalDate;

public class Car extends Vehicle {
  int doors;
  double carPrice;


  public Car(LocalDate productionYear, int doors,  double carPrice) {
    super(productionYear);
    this.doors = doors;
    this.carPrice = carPrice;
  }

  public int getDoors() {
    return doors;
  }

  public void setDoors(int doors) {
    this.doors = doors;
  }


  public double getCarPrice() {
    return carPrice;
  }

  public void setCarPrice(int carPrice) {
    this.carPrice = carPrice;
  }

  @Override
  public String toString() {
    return "Car: " +
            super.toString() +
            "doors: " + doors +
            " carPrice: " + carPrice;
  }
  //metoda abstrakcyjna
  @Override
  public double getPrice() {
    return getCarPrice();
  }
}
