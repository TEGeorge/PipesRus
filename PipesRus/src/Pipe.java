/**
 * Abstract class Pipe
 * @author UP719079 & UP723503
 */

import java.util.ArrayList;

public abstract class Pipe{

  protected int plastic;
  protected int colours;
  protected Boolean insulated;
  protected Boolean reinforced;
  protected Boolean chemicalResist;
  protected double length, outerDiameter;
  protected int quantity = 1;

  /**
   * Abstract class Pipe
   * Calculates cost and volume
   * Valid method is executed in constructor
   * @param   int plastic grade
   * @param   int number of colours
   * @param   boolean inner insulated
   * @param   boolean reinforced
   * @param   boolean chemical resistant
   * @param   double pipe length
   * @param   double outer diameter
   */
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
   * Valid is a abstract method defined in subclasses
   * It will throw an exception if Pipe is not valid
   */
  protected abstract void valid() throws IllegalArgumentException;

  /**
   * Return quantity int
   * @return int quantity
   */
  public int getQuantity() {
    return quantity;
  }

  /**
   * Return volume double
   * @return double volume
   */
  public double getVolume() {
    double lengthInches = length * 39.370; //convert length metres to inches
    double innerRadius = (outerDiameter * 0.9) /2; //inner diameter is always 90% of outer Diameter
    double outerRadius = outerDiameter /2;
    double totalVolume = Math.PI * (outerRadius * outerRadius) * lengthInches;
    double insideVolume = Math.PI * (innerRadius * innerRadius) * lengthInches;
    return totalVolume - insideVolume; //Get the edge volume
  }

  /**
   * Calculate total cost of the pipe based upon specfications
   * @return double cost
   */
  public double cost()
  {
    double cost = getVolume(); //cost per cubic inch of plastic
    switch (plastic) {
      case 1:
        cost *= 0.3;
        break;
      case 2:
        cost *= 0.32;
        break;
      case 3:
        cost *= 0.35;
        break;
      case 4:
        cost *= 0.40;
        break;
      case 5:
        cost *= 0.46;
        break;
    }
    double baseCost = cost;
    //Extra costs
    if(colours==1) { cost += baseCost*0.12; }
    else if(colours==2) { cost += baseCost*0.17; }
    if(insulated) { cost += baseCost*0.14; }
    if(reinforced) { cost += baseCost*0.15; }
    if(chemicalResist) { cost += baseCost*0.12; }
    return cost * quantity;
  }

  /**
   * Get Plastic Grade
   * @return int plastic
   */
  public int getPlasticGrade() {
    return plastic;
  }

  /**
   * Get amount of colours
   * @return int colours
   */
  public int getColours() {
    return colours;
  }

  /**
   * Is pipe inner insulated
   * @return boolean inner insulated
   */
  public Boolean getInsulated() {
    return insulated;
  }

  /**
   * Is pipe outer reinforcement
   * @return boolean outer reinforcement
   */
  public Boolean getReinforced() {
    return reinforced;
  }

  /**
   * Is pipe chemical resistant
   * @return boolean chemical resistant
   */
  public Boolean getChemicalResist() {
    return chemicalResist;
  }

  /**
   * Get pipe length
   * @return int length
   */
  public double getLength() {
    return length;
  }

  /**
   * Get outer diameter
   * @return int outer diameter
   */
  public double getOuterDiameter() {
    return outerDiameter;
  }

  /**
   * Update quantity
   * @param int new quantity
   */
  public void setQuantity(int newQuantity) {
    quantity = newQuantity;
  }
}
