import algorea.Scanner;
import java.util.Arrays;
 
class Bac implements Comparable<Bac> {
   int identifiant, niveau;
   Bac(int identifiant, int niveau) {
      this.identifiant = identifiant;
      this.niveau = niveau;
   }
   public String toString() {
      return identifiant + " " + niveau;
   }
   public int compareTo(Bac autre) {
      if (niveau == autre.niveau) {
         return identifiant - autre.identifiant;
      } else {
         return niveau - autre.niveau;
      }
   }
}
 
class Main {
   static Scanner entrée = new Scanner(System.in);
   public static void main(String[] args) {
      int nbBacs = entrée.nextInt();
      Bac[] bacs = new Bac[nbBacs];
      for (int bac = 0; bac < nbBacs; bac++) {
         int identifiant = entrée.nextInt();
         int niveau = entrée.nextInt();
         bacs[bac] = new Bac(identifiant, niveau);
      }
      Arrays.sort(bacs);
      for (Bac bac: bacs) {
         System.out.println(bac);
      }
   }
}