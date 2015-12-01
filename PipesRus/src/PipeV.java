/**
 * Implementation of abstract class Pipe
 * @author UP719079 & UP723503
 */
import java.util.ArrayList;

public class PipeV extends Pipe
{

  /**
   * Executes Pipe super constructor
   * This calls the valid method which can throw an exception
   * @param   int plastic grade (valid: 3-5)
   * @param   int number of colours (valid: 2)
   * @param   boolean inner insulated (valid: true)
   * @param   boolean outer reinforcement (valid: true)
   * @param   boolean chemical resistant (valid: true/false)
   * @param   double pipe length
   * @param   double outer diameter
   */
  public PipeV(int plastic,int colours, Boolean insulated,
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
    if (!insulated || !reinforced || plastic < 3 || plastic > 5 || colours != 2)
    {
      throw new IllegalArgumentException();
    }
  }
}
