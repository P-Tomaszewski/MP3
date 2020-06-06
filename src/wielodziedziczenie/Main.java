package wielodziedziczenie;

import java.time.LocalDate;

public class Main {
  public static void main (String... args) throws Exception {

    Car c = new Car(LocalDate.now(), 5, 25000);
    Boat b = new Boat(LocalDate.now(), 3, 30000);
    CarBoat carBoat = new CarBoat(LocalDate.now(), 5, 25000, 30000, 3);

    System.out.println(c.getPrice() + "zł");
    System.out.println(b.getPrice() + "zł");
    System.out.println(carBoat.getPrice() + "zł");

    System.out.println(c);
    System.out.println(b);
    System.out.println(carBoat);



  }
}
