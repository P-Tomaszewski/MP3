package wielodziedziczenie;

import java.time.LocalDate;

public abstract class Vehicle extends ObjectPlusPlus {
  private LocalDate productionYear;

  public Vehicle(LocalDate productionYear) {
    super();
    this.productionYear = productionYear;
  }
  //metoda abstrakcyjna
public abstract double getPrice();

  @Override
  public String toString() {
    return "Vehicle[" +
            "productionYear: " + productionYear +
            "] ";
  }
}
