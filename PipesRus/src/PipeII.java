/**
 * Implementation of abstract class Pipe
 * @author UP719079 & UP
 */
import java.util.ArrayList;

public class PipeII extends Pipe
{
  /**
   * Executes Pipe super constructor
   * This calls the valid method which can throw an exception
   * @param   int plastic grade (valid: 2 - 4)
   * @param   int number of colours (valid: 1)
   * @param   boolean inner insulated (valid: false)
   * @param   boolean outer reinforcement (valid: false)
   * @param   boolean chemical resistant (valid: true/false)
   * @param   double pipe length
   * @param   double outer diameter
   */
  public PipeII(int plastic,int colours, Boolean insulated,
                    Boolean reinforced, Boolean chemicalResist,
                    double length,double outerDiameter)
  {
    super(plastic, colours, insulated,reinforced, chemicalResist, length, outerDiameter);
    valid();
  }

  /**
   * checks that all constructor parameters are legal
   * if not an exception is thrown that must be caught when creating the object
   */
  protected void valid() throws IllegalArgumentException{
    if (insulated || reinforced || plastic > 4 || plastic < 2 || colours != 1)
    {
      throw new IllegalArgumentException();
    }
  }
}
