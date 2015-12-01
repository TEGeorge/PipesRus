/**
 * Implementation of abstract class Pipe
 * @author UP719079 & UP
 */
import java.util.ArrayList;

public class PipeI extends Pipe
{

  /**
   * Executes Pipe super constructor
   * This calls the valid method which can throw an exception
   * @param   int plastic grade (valid: 1-3)
   * @param   int number of colours (valid: 0)
   * @param   boolean inner insulated (valid: false)
   * @param   boolean outer reinforcement (valid: false)
   * @param   boolean chemical resistant (valid: true/false)
   * @param   double pipe length
   * @param   double outer diameter
   */
  public PipeI(int plastic, int colours, Boolean insulated,
                    Boolean reinforced, Boolean chemicalResist,
                    double length,double outerDiameter)
  {
    super(plastic, colours, insulated,reinforced, chemicalResist, length, outerDiameter);
  }

  /**
   * checks that all constructor parameters are legal
   * if not an exception is thrown that must be caught when creating the object
   */
  protected void valid() throws IllegalArgumentException{
    if (insulated || reinforced || plastic > 3 || plastic < 1 || colours!=0)
    {
      throw new IllegalArgumentException();
    }
  }
}
