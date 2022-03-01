
import algorea.Scanner;
import static java.lang.Math.*;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int n = entree.nextInt();
      double p = entree.nextDouble();
      
      double pop = (floor(n*(1+(p/100))));

      System.out.println((int) pop);
      
   }
}
