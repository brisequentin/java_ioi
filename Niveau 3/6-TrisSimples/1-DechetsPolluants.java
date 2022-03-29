import algorea.Scanner;
class Main {
   public static void main(String[] args) {
      Scanner entrée = new Scanner(System.in);
      int nbBacs = entrée.nextInt();
      int capaciteCamion = entrée.nextInt();
      int bacs[] = new int[nbBacs];
      for (int bac = 0; bac < nbBacs; bac++)
         bacs[bac] = entrée.nextInt();
      for (int polluant = 0; polluant < capaciteCamion; polluant++)
      {
         int posMax = 0;
         for (int bac = 1; bac < nbBacs; bac++)
            if (bacs[posMax] < bacs[bac])
               posMax = bac;
         System.out.print(bacs[posMax]+" ");
         bacs[posMax] = bacs[nbBacs-1];
         nbBacs--;
      }
      System.out.println();
   }
}