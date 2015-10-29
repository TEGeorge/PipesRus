import java.util.ArrayList;

public class Test{
  public static void main(String args []){
    try {
    PipeI test = new PipeI(3, new ArrayList<String>(), false, false, false, 2, 3);
    System.out.println("Successfully created PipeI");
    System.out.println("cost " + test.getCost());
    System.out.println("volume " + test.getVolume());
    }
    catch (IllegalArgumentException pipeI) {
      System.out.println("Invalid PipeI");
      try {
        PipeII test = new PipeII(2, new ArrayList<String>(), false, false, false, 0f, 0f);
        System.out.println("Successfully created pipeII");
      }
      catch (IllegalArgumentException pipeII) {
        System.out.println("Invalid PipeII");
      }
    }
  }
}
