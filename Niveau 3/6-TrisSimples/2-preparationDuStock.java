import algorea.Scanner;
class Main {
   public static void main(String[] args) {
      Scanner entrée = new Scanner(System.in);
      int nbBacsInitiaux = entrée.nextInt();
      int nbBacs = nbBacsInitiaux + entrée.nextInt();
      int polluants[] = new int[nbBacs];
      for (int polluant = 0; polluant < nbBacs; polluant++)
         polluants[polluant] = entrée.nextInt();
      for (int position = nbBacsInitiaux; position < nbBacs; position++)
      {
         int polluant = polluants[position];
         int bac = position;
         while ((bac > 0) && (polluants[bac-1] >= polluant))
         {
            polluants[bac] = polluants[bac-1];
            bac--;
         }
         polluants[bac] = polluant;
         System.out.printf("%d ", bac);
      }
      System.out.println();
      for (int polluant: polluants)
         System.out.printf("%d ", polluant);
   }
}