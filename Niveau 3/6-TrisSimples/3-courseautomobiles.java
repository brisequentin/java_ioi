import algorea.Scanner;
import java.util.ArrayList;
class Depassement {
   int autoDepassee, autoQuiDepasse;
}
class Main {
   static final int NB_MAX_AUTOS = 1000;
   static Scanner entrée = new Scanner(System.in);
   public static void main(String[] args) {
      int nbAutos = entrée.nextInt();
      int[] idAutos = new int[nbAutos];
      for (int rang = 0; rang < nbAutos; rang++) {
         idAutos[rang] = entrée.nextInt();
      }
      ArrayList<Depassement> depassements = new ArrayList<Depassement>();
      for (int iPassage = 0; iPassage < nbAutos; iPassage++) {
         for (int rang = 1; rang < nbAutos; rang++) {
            if (idAutos[rang - 1] > idAutos[rang]) {
               Depassement depass = new Depassement();
               depass.autoDepassee = idAutos[rang - 1];
               depass.autoQuiDepasse = idAutos[rang];
               idAutos[rang - 1] = depass.autoQuiDepasse;
               idAutos[rang] = depass.autoDepassee;
               depassements.add(depass);
            }
         }
      }
      System.out.println(depassements.size());
      for (Depassement depass: depassements) {
         System.out.println(depass.autoDepassee + " " + depass.autoQuiDepasse);
      }
   }
}