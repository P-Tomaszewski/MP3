package dynamic;

import java.time.LocalDate;

public abstract class Person extends ObjectPlusPlus {
  protected String name;
  protected String lastName;
  protected LocalDate bornDate;


  public Person(String name, String lastName, LocalDate bornDate) {
    super();
    this.name = name;
    this.lastName = lastName;
    this.bornDate = bornDate;
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    result.append("Imie: " + name + " ");
    result.append("Nazwisko: " + lastName + " ");
    result.append("DataUrodzenia: " + bornDate + " ");

    return result.toString();
  }


//  public String toString() {
//    StringBuilder result = new StringBuilder();
//    result.append("Imie: : " + name + " ");
//    result.append("Nazwisko: " + lastName+ " ");
//    result.append("Data urodzenia: " + bornDate+ " ");
//    if(this.areLinks(Reference.SPEC_TRAINER)){
//      result.append("Rola: Trener ");
//    }
//    if(this.areLinks(Reference.SPEC_DRIVER)){
//      result.append("Rola: Kierowca");
//    }
//    return result.toString();
//  }

}