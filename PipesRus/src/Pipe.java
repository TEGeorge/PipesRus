import java.util.ArrayList;

public class Pipe{

  protected int plastic; //could add minimum and max plastic? automatically format from super methods
  protected ArrayList<String> colours;
  protected Boolean insulated;
  protected Boolean reinforced;
  protected Boolean chemicalResist;
  protected double length, outerDiameter;
  protected IllegalArgumentException e = new IllegalArgumentException("Invalid Type");

  public Pipe(int plastic, ArrayList<String> colours, Boolean insulated, Boolean reinforced, Boolean chemicalResist, double length, double outerDiameter)
  {
    this.plastic = plastic;
    this.colours = colours;
    this.insulated = insulated;
    this.reinforced = reinforced;
    this.chemicalResist = chemicalResist;
    this.length = length;
    this.outerDiameter = outerDiameter;
    valid();
  }

  public void valid() {
    //defined in extended
  }

  public double getVolume() {
    double lengthInches = length * 39.370; //convert length metres to inches
    double innerRadius = (outerDiameter * 0.9) /2; //inner diameter is always 90% of outer Diameter
    double outerRadius = outerDiameter /2;
    double totalVolume = Math.PI * (outerRadius * outerRadius) * lengthInches;
    double insideVolume = Math.PI * (innerRadius * innerRadius) * lengthInches;
    return totalVolume - insideVolume; //Get the edge volume
  }

  public double getCost()
  {
    double cost = getVolume(); //cost per cubic inch of plastic
    if(plastic==1) {cost = cost * 0.3;} // *******CHANGE TO SWITCH AND CASE******//
    else if(plastic==2) {cost*=0.32;}
    else if(plastic==3) {cost*=0.35;}
    else if(plastic==4) {cost*=0.40;}
    else if(plastic==5) {cost*=0.36;}
    double baseCost = cost;
    if(colours.size()==1) { cost += baseCost*0.12; }
    else if(colours.size()==1) { cost += baseCost*0.17; }
    if(insulated) { cost += baseCost*0.14; }
    if(reinforced) { cost += baseCost*0.15; }
    if(chemicalResist) { cost += baseCost*0.12; }
    return cost; //NEEDS CONVERT TO 2 DECMINAL PLACE ***************
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

  public double getLength() {
    return length;
  }

  public double getOuterDiameter() {
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
