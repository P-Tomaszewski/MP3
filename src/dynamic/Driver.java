package dynamic;

import java.time.LocalDate;

import static dynamic.Reference.PERSON;
import static dynamic.Reference.SPEC_DRIVER;

public class Driver extends Person {
  public String lvl;
  public int trackHours;

  public Driver(String name, String lastName, LocalDate bornDate, String lvl, int trackHours) {
    super(name, lastName, bornDate);
    this.lvl = lvl;
    this.trackHours = trackHours;
    this.addLink(SPEC_DRIVER, PERSON, this);
  }

  public Driver(Person previousPerson, String lvl, int trackHours) {
    super(previousPerson.name, previousPerson.lastName, previousPerson.bornDate);
    this.lvl = lvl;
    this.trackHours = trackHours;
    this.addLink(SPEC_DRIVER, PERSON, this);
  }

  public String getLvl() {
    return lvl;
  }

  //Metoda polimorficzna
  public int getTrackHours() {
    return trackHours;
  }

  public void setLvl(String lvl) {
    this.lvl = lvl;
  }

  @Override
  public String toString() {
    return "Zawodnik: " +
            super.toString() +
            "Poziom zaawansowania: " + lvl;
  }
}