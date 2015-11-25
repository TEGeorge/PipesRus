import java.util.ArrayList;

public class PipeI extends Pipe
{

  public PipeI(int plastic, int colours, Boolean insulated,
                    Boolean reinforced, Boolean chemicalResist,
                    double length,double outerDiameter)
  {
    super(plastic, colours, insulated,reinforced, chemicalResist, length, outerDiameter);
  }

  protected void valid() throws IllegalArgumentException{
    if (insulated || reinforced || plastic > 3 || plastic < 1 || colours!=0)
    {
      throw new IllegalArgumentException();
    }
  }
}
