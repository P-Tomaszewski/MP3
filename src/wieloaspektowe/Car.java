package wieloaspektowe;

import java.time.LocalDate;

import static wieloaspektowe.DriveType.ELECTRICITY;
import static wieloaspektowe.DriveType.PETROL;

public class Car extends wieloaspektowe.Vehicle {
  int doors;
  double carPrice;


  public Car(LocalDate productionYear, DriveType driveType,Integer tankCapacity, Integer batteryCapacity, int doors, int carPrice) {
    super(productionYear, driveType, tankCapacity, batteryCapacity);
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
  public void addPetrol() {
    if(this.getDriveType().equals(PETROL)){
      System.out.println("Tankuje paliwo");
    } else {
      System.out.println("Nie jestes na paliwo");
    }
  }

  @Override
  public void chargeBattery() {
    if(this.getDriveType().equals(ELECTRICITY)){
      System.out.println("Ładuj akumulator");
    } else {
      System.out.println("Nie jestes elektryczny");
    }
  }

  @Override
  public String toString() {
    return "Car: " +
            super.toString() +
            " doors: " + doors +
            " carPrice: " + carPrice;
  }
}
