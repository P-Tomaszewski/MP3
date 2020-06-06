package dynamic;

import java.time.LocalDate;

import static dynamic.Reference.CAR;
import static dynamic.Reference.SPEC_DRIVER;

public class Main {
  public static void main (String... args) throws Exception {
   Person person = new Driver("Arek", "Nowak", LocalDate.now(), "Zaawansowany", 9);
   Car car = new Car("WWS123");
   person.addLink(SPEC_DRIVER, CAR, car);


   System.out.println(person);
   car.showLinks(CAR, System.out);
   person = new Trainer(person, "123123", 30);
   System.out.println(person);

//   car.showLinks("Car", System.out); // Błąd poniewaz rola zostaje usunieta wraz z przejsciem kierowcy na trenera.

  }
}
