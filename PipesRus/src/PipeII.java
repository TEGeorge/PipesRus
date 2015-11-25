/**
 *
 * @Author
 */

import java.util.ArrayList;

public class PipeII extends Pipe
{
  /**
   * [PipeII description]
   * @param   [description]
   * @param   [description]
   * @param   [description]
   * @param   [description]
   * @param   [description]
   * @param   [description]
   * @param   [description]
   * @return  [description]
   */
  public PipeII(int plastic,int colours, Boolean insulated,
                    Boolean reinforced, Boolean chemicalResist,
                    double length,double outerDiameter)
  {
    super(plastic, colours, insulated,reinforced, chemicalResist, length, outerDiameter);
    valid();
  }

  /**
   * [valid description]
   */
  protected void valid() throws IllegalArgumentException{
    if (insulated || reinforced || plastic > 4 || plastic < 2 || colours != 1)
    {
      throw new IllegalArgumentException();
    }
  }
}
