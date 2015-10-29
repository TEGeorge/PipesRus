import java.util.ArrayList;

public class PipeI extends Pipe
{

  public PipeI(int plastic,ArrayList<String> colours, Boolean insulated,
                    Boolean reinforced, Boolean chemicalResist,
                    double length,double outerDiameter)
  {
    super(plastic, colours, insulated,reinforced, chemicalResist, length, outerDiameter);
  }

  public void valid() {
    if (insulated || reinforced || plastic > 3 || plastic < 1 || !colours.isEmpty())
    {
      throw e;
    }
  }
}
