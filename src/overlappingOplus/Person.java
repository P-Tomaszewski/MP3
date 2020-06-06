package overlappingOplus;

import java.time.LocalDate;

import static overlappingOplus.Reference.*;

public class Person extends ObjectPlusPlus {
  private String name;
  private String lastName;
  private LocalDate bornDate;

  public Person(String name, String lastName, LocalDate bornDate) {
    super();
    this.name = name;
    this.lastName = lastName;
    this.bornDate = bornDate;

  }

  //osoba bedaca kierowca
  public Person(String name, String lastName, LocalDate bornDate, String lvl, int trackHours) {
    super();
    this.name = name;
    this.lastName = lastName;
    this.bornDate = bornDate;
    addDriver(lvl, trackHours);

  }
  //osoba bedaca trenerem
  public Person(String name, String lastName, LocalDate bornDate, int licensNumber, int trackHours) {
    super();
    this.name = name;
    this.lastName = lastName;
    this.bornDate = bornDate;
    addTrainer(licensNumber, trackHours);

  }

  //Metoda polimorficzna wyswietla godziny spedzone na torze jako kierowca/trener.
  public int getTrackHours() throws Exception {
    int trackHours = 0;
    if(this.areLinks(Reference.SPEC_DRIVER)){
      ObjectPlus[] obj = this.getLinks(SPEC_DRIVER);
      trackHours += ((Driver) obj[0]).getTrackHours();
    }
    if(this.areLinks(Reference.SPEC_TRAINER)){
      ObjectPlus[] obj = this.getLinks(Reference.SPEC_TRAINER);
      trackHours += ((Trainer) obj[0]).getTrackHours();
    }
    return trackHours;
  }

  //tworzącej obiekt-część opisujący kierowce oraz powiązanie w ramach kompozycji.
  public void addDriver(String lvl, int trackHours){
   Driver d = new Driver(lvl, trackHours);
   this.addLink(SPEC_DRIVER, PERSON, d);
  }

  public void addTrainer(int licensNumber, int trackHours){
    Trainer d = new Trainer(licensNumber, trackHours);
    this.addLink(SPEC_TRAINER, PERSON, d);
  }

  //Pobranie poziomu dla kierowcy jesli nim nie jest to blad.
  public String getDriverLvl() throws Exception{
    try {
      ObjectPlusPlus[] obj =
              this.getLinks(SPEC_DRIVER);
      return ((Driver) obj[0]).getLvl();
    } catch(Exception e){
      throw new Exception("Obiekt nie jest kierowca!");
    }
  }

  public int getLicensNumber() throws Exception{
    try {
      ObjectPlusPlus[] obj =
              this.getLinks(SPEC_TRAINER);
      return ((Trainer) obj[0]).getLicensNumber();
    } catch(Exception e){
      throw new Exception("Obiekt nie jest Trenerem!");
    }
  }

  public class Driver extends ObjectPlusPlus {
    public String name;
    public String lastName;
    public String lvl;
    public int trackHours;


    public String getLastName() {
      return lastName;
    }

    public String getName() {
      return name;
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

    private Driver(String lvl, int trackHours) {
      super();
      this.lvl = lvl;
      this.trackHours = trackHours;
    }

    public String toString() {
      StringBuilder result = new StringBuilder();
      result.append("Imie i nazwisko: " + getName() + " " + getLastName());
      return result.toString();
    }
  }

  public class Trainer extends ObjectPlusPlus {
    public String name;
    public String lastName;
    public int licensNumber;
    public int trackHours;


    public String getLastName() {
      return lastName;
    }

    public String getName() {
      return name;
    }

    public int getLicensNumber () {
      return licensNumber;
    }

    //Metoda polimorficzna
    public int getTrackHours() {
      return trackHours;
    }

    private Trainer(int licensNumber, int trackHours) {
      super();
      this.licensNumber = licensNumber;
      this.trackHours = trackHours;
    }

    public String toString() {
      StringBuilder result = new StringBuilder();
      result.append("Imie i nazwisko: " + getName() + " " + getLastName());
      return result.toString();
    }
  }


  public String toString() {
    StringBuilder result = new StringBuilder();
    result.append("Imie: : " + name + " ");
    result.append("Nazwisko: " + lastName+ " ");
    result.append("Data urodzenia: " + bornDate+ " ");
    if(this.areLinks(overlappingOplus.Reference.SPEC_TRAINER)){
      result.append("Rola: Trener ");
    }
    if(this.areLinks(overlappingOplus.Reference.SPEC_DRIVER)){
      result.append("Rola: Kierowca");
    }
    return result.toString();
  }

}