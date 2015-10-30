import java.util.ArrayList;

public class PipeIII extends Pipe
{

  public PipeIII(int plastic,ArrayList<String> colours, Boolean insulated,
                    Boolean reinforced, Boolean chemicalResist,
                    double length,double outerDiameter)
  {
    super(plastic, colours, insulated,reinforced, chemicalResist, length, outerDiameter);
    valid();
  }

  public void valid() {
    if (insulated || reinforced || colours.size() == 2 || plastic > 1 || plastic < 6)
    {
      throw e;
    }
  }
}
