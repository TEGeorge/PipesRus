import java.util.ArrayList;

public class PipeI extends Pipe
{

  public PipeI(int plastic,ArrayList<String> colours, Boolean insulated,
                    Boolean reinforced, Boolean chemicalResist,
                    float length,float outerDiameter)
  {
    super(plastic, colours, insulated,reinforced, chemicalResist, length, outerDiameter);
    if (insulated || reinforced || plastic > 3 || colours.size() > 0)
    {
      throw e;
    }
  }
}
