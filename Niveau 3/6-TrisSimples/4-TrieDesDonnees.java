import algorea.Scanner;
import java.util.Arrays;
class Main {
   public static void main(String[] args) {
      Scanner entrée = new Scanner(System.in);
      int nbValeurs = entrée.nextInt();
      int[] valeurs = new int[nbValeurs];
      for (int valeur = 0; valeur < nbValeurs; valeur++)
         valeurs[valeur] = entrée.nextInt();
      Arrays.sort(valeurs);
      for (int valeur : valeurs)
         System.out.print(valeur+" ");
   }
}