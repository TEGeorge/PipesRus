import java.util.ArrayList;

public class PipeIV extends Pipe
{

  public PipeIV(int plastic,int colours, Boolean insulated,
                    Boolean reinforced, Boolean chemicalResist,
                    double length,double outerDiameter)
  {
    super(plastic, colours, insulated,reinforced, chemicalResist, length, outerDiameter);
    valid();
  }

  public void valid() throws IllegalArgumentException{
    if (!insulated || reinforced || plastic > 1 || plastic < 6 || colours == 2)
    {
      throw new IllegalArgumentException();
    }
  }
}
