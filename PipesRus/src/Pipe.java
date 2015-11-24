import java.util.ArrayList;

public abstract class Pipe{

  protected int plastic;
  protected int colours;
  protected Boolean insulated;
  protected Boolean reinforced;
  protected Boolean chemicalResist;
  protected double length, outerDiameter;
  protected int quantity = 1;

  public Pipe(int plastic, int colours, Boolean insulated, Boolean reinforced, Boolean chemicalResist, double length, double outerDiameter)
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

  /**
   * Valid is defined in subclasses as it includes rules specfic for each subclass
   */
  public abstract void valid() throws IllegalArgumentException;

  /**
   * Return quantity variable
   * @return quantity
   */
  public int getQuantity() {
    return quantity;
  }

  /**
   * ??
   * @return volume of materials in pipe
   */
  public double getVolume() {
    double lengthInches = length * 39.370; //convert length metres to inches
    double innerRadius = (outerDiameter * 0.9) /2; //inner diameter is always 90% of outer Diameter
    double outerRadius = outerDiameter /2;
    double totalVolume = Math.PI * (outerRadius * outerRadius) * lengthInches;
    double insideVolume = Math.PI * (innerRadius * innerRadius) * lengthInches;
    return totalVolume - insideVolume; //Get the edge volume
  }

  //
  public double cost()
  {
    double cost = getVolume(); //cost per cubic inch of plastic
    if(plastic==1) {cost = cost * 0.3;} // *******CHANGE TO SWITCH AND CASE******//
    else if(plastic==2) {cost*=0.32;}
    else if(plastic==3) {cost*=0.35;}
    else if(plastic==4) {cost*=0.40;}
    else if(plastic==5) {cost*=0.36;}
    double baseCost = cost;
    if(colours==1) { cost += baseCost*0.12; }
    else if(colours==2) { cost += baseCost*0.17; }
    if(insulated) { cost += baseCost*0.14; }
    if(reinforced) { cost += baseCost*0.15; }
    if(chemicalResist) { cost += baseCost*0.12; }
    return cost * quantity; //NEEDS CONVERT TO 2 DECMINAL PLACE ***************
  }

  // GETS and UPDATES
  public int getPlasticGrade() {
    return plastic;
  }

  public int getColours() {
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

  public void setQuantity(int newQuantity) {
    quantity = newQuantity;
  }
}
