import java.util.ArrayList;

public class PipeIV extends Pipe
{

  public PipeIV(int plastic,ArrayList<String> colours, Boolean insulated,
                    Boolean reinforced, Boolean chemicalResist,
                    double length,double outerDiameter)
  {
    super(plastic, colours, insulated,reinforced, chemicalResist, length, outerDiameter);
    valid();
  }

  public void valid() {
    if (!insulated || reinforced || plastic > 1 || plastic < 6 || colours.size() == 2)
    {
      throw e;
    }
  }
}
