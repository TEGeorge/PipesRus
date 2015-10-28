import java.util.ArrayList;

public class Pipe{

  protected int plastic; //could add minimum and max plastic? automatically format from super methods
  protected ArrayList<String> colours;
  protected Boolean insulated;
  protected Boolean reinforced;
  protected Boolean chemicalResist;
  protected float length, outerDiameter;
  protected IllegalArgumentException e = new IllegalArgumentException("Invalid Type");

  public Pipe(int plastic, ArrayList<String> colours, Boolean insulated, Boolean reinforced, Boolean chemicalResist,float length,float outerDiameter)
  {
    this.plastic = plastic;
    this.colours = colours;
    this.insulated = insulated;
    this.reinforced = reinforced;
    this.chemicalResist = chemicalResist;
    this.length = length;
    this.outerDiameter = outerDiameter;
  }

  public float volume() {
    return 0.00f;
  }

  public float cost()
  {
    return 0.00f;
  }

  // GETS and UPDATES
  public int getPlasticGrade() {
    return plastic;
  }

  public ArrayList<String> getColours() {
    return colours;
  }

  public Boolean getInsulated() {
    return insulated;
  }

  public Boolean getReinforced() {
    return reinforced;
  }

  public Boolean getChemicalResist() {
    return chemicalResist;
  }

  public float getLength() {
    return length;
  }

  public float getOuterDiameter() {
    return outerDiameter;
  }

  //******** NEEDS VALIDATION IF PERFORMING UPDATES *******************//

  public void updatePlasticGrade(int update) {
    plastic = update;
  }

  public void updateColours(ArrayList<String> update) {
    colours = update;
  }

  public void updateInsulation(Boolean update) {
    insulated = update;
  }

  public void updateReinforced(Boolean update) {
    reinforced = update;
  }

  public void updateChemicalResist(Boolean update) {
    chemicalResist = update;
  }

  public void updateLength(Float update) {
    length = update;
  }

  public void updateOuterDiameter(Float update) {
    outerDiameter = update;
  }
}
