package dynamic;

import java.time.LocalDate;

import static dynamic.Reference.*;

public class Trainer extends Person {
  public String licensNumber;
  public int trackHours;

  public Trainer(String name, String lastName, LocalDate bornDate, String licensNumber, int trackHours) {
    super(name, lastName, bornDate);
    this.licensNumber = licensNumber;
    this.trackHours = trackHours;
    this.addLink(SPEC_TRAINER, PERSON, this);
  }

  public Trainer(Person previousPerson, String licensNumber, int trackHours) throws Exception {
    super(previousPerson.name, previousPerson.lastName, previousPerson.bornDate);
    this.licensNumber = licensNumber;
    this.trackHours = trackHours;
    if(previousPerson.areLinks(SPEC_DRIVER)){
      ObjectPlusPlus[] obj = previousPerson.getLinks(SPEC_DRIVER);
      ObjectPlusPlus obj1 = obj[0];
      previousPerson.removeLink(SPEC_DRIVER, CAR, obj1);
    }
    this.addLink(SPEC_TRAINER, PERSON, this);
  }

  public String getLicensNumber () {
    return licensNumber;
  }

  //Metoda polimorficzna
  public int getTrackHours() {
    return trackHours;
  }

  @Override
  public String toString() {
    return "Trener: " +
            super.toString() +
            "Numer licencji: " + licensNumber + " ";
  }
}
