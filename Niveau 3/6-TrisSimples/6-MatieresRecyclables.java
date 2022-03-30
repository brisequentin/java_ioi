import algorea.Scanner;
import java.util.Arrays;
class Main {
   public static void main(String[] args) {
      Scanner entrée = new Scanner(System.in);
      int nbNoms = entrée.nextInt();
      String[] noms = new String[nbNoms];
      for (int nom = 0; nom < nbNoms; nom++)
         noms[nom] = new String(entrée.next());
      Arrays.sort(noms);
      for (int nom  = 0; nom < nbNoms; nom++)
         System.out.println(noms[nom]);
   }
}