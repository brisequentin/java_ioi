import algorea.Scanner;
import static java.lang.Math.*;
class Main
{
   public static void main(String[] args)
   {
      Scanner entrée = new Scanner(System.in);
      double taxeActuelle = entrée.nextDouble();
      double taxeFuture = entrée.nextDouble();
      double prixLégume = entrée.nextDouble();
       
      double nouveauPrix =
         prixLégume / ( 1 + taxeActuelle / 100) * (1 + taxeFuture / 100);
      nouveauPrix = (double)round(nouveauPrix * 100) / 100;
      System.out.println(nouveauPrix);
   }
}