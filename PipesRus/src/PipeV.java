/**
 * Implementation of abstract class Pipe
 * @author UP719079 & UP
 */
import java.util.ArrayList;

public class PipeV extends Pipe
{

  /**
   * Executes Pipe super constructor
   * This calls the valid method which can throw an exception
   * @param   int plastic grade
   * @param   int number of colours
   * @param   boolean inner insulated
   * @param   boolean reinforced
   * @param   boolean chemical resistant
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
    if (!insulated || !reinforced || plastic > 2 || plastic < 6 || colours == 2)
    {
      throw new IllegalArgumentException();
    }
  }
}
