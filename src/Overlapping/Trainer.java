package Overlapping;

public class Trainer {
  private Person person;

  public Trainer(Person person) throws Exception {
    if(person == null) {
      throw new Exception("Atrybut jest pusty");
    }
    this.person = person;
  }}
