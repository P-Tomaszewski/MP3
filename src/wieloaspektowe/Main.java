package wieloaspektowe;

import static java.time.LocalDate.now;

public class Main {
  public static void main (String... args) {
    wieloaspektowe.Boat boat = new wieloaspektowe.Boat(now(), DriveType.PETROL, 30,
            null, 3, 30000);
    wieloaspektowe.Car car = new wieloaspektowe.Car(now(), DriveType.ELECTRICITY, null,
            120, 5, 25000);

    System.out.println(boat);
    System.out.println(car);
    boat.addPetrol();
    //boat.chargeBattery();
  }
}
