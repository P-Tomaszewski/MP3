package wieloaspektowe;
import java.time.LocalDate;

import static wieloaspektowe.DriveType.ELECTRICITY;
import static wieloaspektowe.DriveType.PETROL;

public class Boat extends wieloaspektowe.Vehicle {
   int turbine;
   double boatPrice;

  public Boat(LocalDate productionYear, DriveType driveType,Integer tankCapacity, Integer batteryCapacity, int turbine, int boatPrice) {
    super(productionYear, driveType, tankCapacity, batteryCapacity);
    this.turbine = turbine;
    this.boatPrice = boatPrice;
  }

  public int getTurbine() {
    return turbine;
  }

  public void setTurbine(int turbine) {
    this.turbine = turbine;
  }


  public double getBoatPrice() {
    return boatPrice;
  }

  public void setBoatPrice(int boatPrice) {
    this.boatPrice = boatPrice;
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
    return "Boat: " +
            super.toString() +
            "turbine: " + turbine +
            " boatPrice: " + boatPrice;
  }
}
