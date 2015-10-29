import java.util.ArrayList;
import java.util.Scanner;

public class Test{

  static int plastic; //Static because I cannot refrence in main without
  static ArrayList<String> colours;
  static Boolean insulated, reinforced, chemicalResist;
  static double length, outerDiameter;

  public static void main(String args []){
    Scanner read = new Scanner(System.in);
    System.out.println("Enter a plastic grade between 1-5 : ");
    plastic = read.nextInt();
    System.out.println("Enter number of colours : ");
    int n = read.nextInt();
    colours = new ArrayList<String>();
    if (n==1) { colours.add("1"); }
    else { colours.add("1"); colours.add("2"); }
    System.out.println("True or false for insulation : ");
    insulated = read.nextBoolean();
    System.out.println("True or false for reinforced : ");
    reinforced = read.nextBoolean();
    System.out.println("True or false for chemicalResist : ");
    chemicalResist = read.nextBoolean();
    System.out.println("Enter length of pipe in metres : ");
    length = read.nextDouble();
    System.out.println("Enter outer diameter of pipe in inches : ");
    outerDiameter = read.nextDouble();
    createPipes();
  }

  public static void createPipes()
  {
    try {
    PipeI test = new PipeI(plastic, colours, insulated, reinforced, chemicalResist, length, outerDiameter);
    System.out.println("made pipeI " + test.getVolume() + " & " + test.getCost());
    }
    catch (IllegalArgumentException pipeI) {
      System.out.println("Invalid PipeI");
      try {
        PipeII test = new PipeII(plastic, colours, insulated, reinforced, chemicalResist, length, outerDiameter);
        System.out.println("made pipeII " + test.getVolume() + " & " + test.getCost());
      }
      catch (IllegalArgumentException pipeII) {
        System.out.println("Invalid PipeII");
      }
    }
  }
}
