import algorea.Scanner;
import static java.lang.Math.*;
class Main
{
   public static void main(String[] args)
   {
      double vitesseSon = 340.29;
      Scanner entrée = new Scanner(System.in);     
      double tempsParcours = entrée.nextDouble();
      int distanceKilometres = (int)(round((tempsParcours * vitesseSon) / 1000));
      System.out.println(distanceKilometres);
   }
}