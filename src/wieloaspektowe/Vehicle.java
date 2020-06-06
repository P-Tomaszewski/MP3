package wieloaspektowe;

import wielodziedziczenie.ObjectPlusPlus;

import java.time.LocalDate;

public abstract class Vehicle extends ObjectPlusPlus {
  private LocalDate productionYear;
  private DriveType driveType;
  private Integer tankCapacity;
  private Integer batteryCapacity;


  public Vehicle(LocalDate productionYear, DriveType driveType, Integer tankCapacity, Integer batteryCapacity) {
    super();
    this.productionYear = productionYear;
    this.driveType = driveType;
    this.tankCapacity = tankCapacity;
    this.batteryCapacity = batteryCapacity;
  }

  //metoda abstrakcyjna
  public abstract void addPetrol();

  public abstract void chargeBattery();

  public DriveType getDriveType() {
    return driveType;
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    result.append("productionYear: " + productionYear + " ");
    result.append("driveType: " + driveType + " ");
    if(!(tankCapacity == null)) {
      result.append("tankCapacity: " + tankCapacity + " ");
    }
    if(!(batteryCapacity == null)) {
      result.append("batteryCapacity: " + batteryCapacity + " ");
    }
    return result.toString();
  }
}
