import java.util.ArrayList;

public class Test{
  public static void main(String args []){
    try {
    PipeI test = new PipeI(1, new ArrayList<String>(), true, false, false, 0f, 0f);
    System.out.println("Shouldn't have executed");
    }
    catch (IllegalArgumentException e) {
      System.out.println("Caught it");
    }
  }
}
