package Overlapping;


import java.time.LocalDate;
import java.util.EnumSet;

public class Person {
  private String name;
  private String lastName;
  private LocalDate bornDate;
  private Player player;
  private Trainer trainer;

  private EnumSet<Reference> references;

  public Person(String name, String lastName, LocalDate bornDate,  EnumSet<Reference> references) {
    super();
    this.name = name;
    this.lastName = lastName;
    this.bornDate = bornDate;
    this.references = references;
  }

//  private void assignRoles(EnumSet<Reference> references) throws Exception {
//    references.forEach(e -> {
//      if(Reference.PLAYER.toString().equals(e.name())) {
//        try {
//          this.player = new Player(this);
//        } catch(Exception e1) {
//          e1.printStackTrace();
//        }
//      }
//      if(Reference.TRAINER.toString().equals(e.name())) {
//        try {
//          this.trainer = new Trainer(this);
//        } catch(Exception e1) {
//          e1.printStackTrace();
//        }
//      }
//    });
//  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public LocalDate getBornDate() {
    return bornDate;
  }

  public void setBornDate(LocalDate bornDate) {
    this.bornDate = bornDate;
  }

  @Override
  public String toString() {
    return "Person{" +
            ", name='" + name + '\'' +
            ", lastName='" + lastName + '\'' +
            ", bornDate=" + bornDate + '\'' +
            ", role = " + references.toString() + '\'' +
            '}';
  }

}