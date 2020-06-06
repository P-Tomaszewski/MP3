package wielodziedziczenie;

import java.time.LocalDate;

public class CarBoat extends Car implements IBoat {
  double boatPrice;
  int turbine;

  public CarBoat(LocalDate productionYear, int doors, double carPrice, double boatPrice, int turbine) {
    super(productionYear, doors, carPrice);
    this.boatPrice = boatPrice;
    this.turbine = turbine;
  }

  //implementacja metod z interfejsu.
  @Override
  public double getBoatPrice() {
    return boatPrice;
  }

  @Override
  public double getPrice() {
    return super.getPrice() + this.getBoatPrice();
  }

  public int getTurbine() {
    return turbine;
  }

  @Override
  public String toString() {
    return "CarBoat: " +
            "turbine: " + turbine + " " +
            "CarBoatPrice: " + getPrice() + " " +
            "doors: " + doors;
  }
}
