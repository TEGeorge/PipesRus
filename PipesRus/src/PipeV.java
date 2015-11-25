import java.util.ArrayList;

public class PipeV extends Pipe
{

  public PipeV(int plastic,int colours, Boolean insulated,
                    Boolean reinforced, Boolean chemicalResist,
                    double length,double outerDiameter)
  {
    super(plastic, colours, insulated,reinforced, chemicalResist, length, outerDiameter);
    valid();
  }

  protected void valid() throws IllegalArgumentException{
    if (!insulated || !reinforced || plastic > 2 || plastic < 6 || colours == 2)
    {
      throw new IllegalArgumentException();
    }
  }
}
