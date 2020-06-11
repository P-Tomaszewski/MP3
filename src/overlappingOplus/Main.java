package overlappingOplus;

import java.time.LocalDate;

import static overlappingOplus.LevelOfAdvancement.ZAAWANSOWANY;

public class Main {
  public static void main(String... args) throws Exception {

    overlappingOplus.Person p = new overlappingOplus.Person("Arek", "Nowak",
            LocalDate.now(), ZAAWANSOWANY, 80);
    // overlappingOplus.Person k = new overlappingOplus.Person("Arek", "Nowak", LocalDate.now(), "Zaawansowany", 60);

    System.out.println(p);
    //polimorfizm metod, wyswietla ilosc godzin spedzonych na torze.
    System.out.println(p.getTrackHours());
    p.addTrainer(119203, 40);
    // System.out.println(p.getLicensNumber());
    System.out.println(p.getTrackHours());
    System.out.println(p);
  }
}
