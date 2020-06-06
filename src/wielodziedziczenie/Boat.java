package wielodziedziczenie;

import java.time.LocalDate;

public class Boat extends Vehicle {
   int turbine;
   double boatPrice;

  public Boat(LocalDate productionYear, int turbine, int boatPrice) {
    super(productionYear);
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
  public String toString() {
    return "Boat: " +
            super.toString() +
            "turbine: " + turbine +
            " boatPrice: " + boatPrice;
  }
  //metoda abstrakcyjna
  @Override
  public double getPrice() {
    return getBoatPrice();
  }
}
