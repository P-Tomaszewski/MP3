package Overlapping;

public class Player {
  private Person person;
  private String trackHours;

  public Player(Person person) throws Exception {
    if(person == null) {
      throw new Exception("Atrybut jest pusty");
    }
    this.person = person;
  }

  @Override
  public String toString() {
    return "Player{" +
            "person=" + person +
            '}';
  }


}
