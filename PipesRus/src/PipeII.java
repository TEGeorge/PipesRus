import java.util.ArrayList;

public class PipeII extends Pipe
{

  public PipeII(int plastic,ArrayList<String> colours, Boolean insulated,
                    Boolean reinforced, Boolean chemicalResist,
                    double length,double outerDiameter)
  {
    super(plastic, colours, insulated,reinforced, chemicalResist, length, outerDiameter);
    valid();
  }

  public void valid() {
    if (insulated || reinforced || plastic > 4 || plastic < 2 || colours.size() != 1)
    {
      throw e;
    }
  }
}
