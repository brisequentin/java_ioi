import algorea.Scanner;
import static java.lang.Math.*;
class Main {
   static Scanner entrée = new Scanner(System.in);
   static double distance(double x1, double y1, double x2, double y2) {
      return sqrt(pow(x1 - x2, 2) + pow(y1 - y2, 2));
   }
   public static void main(String[] args) {
      double x1 = entrée.nextDouble();
      double y1 = entrée.nextDouble();
      double x2 = entrée.nextDouble();
      double y2 = entrée.nextDouble();
      System.out.println(distance(x1, y1, x2, y2));
   }
}