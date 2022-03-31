import algorea.Scanner;
class Main {
   private static final int nbCartes = 1000*1000 + 1;
   public static void main(String[] args) {
      Scanner clavier = new Scanner(System.in);
      int nbClients = clavier.nextInt();
      boolean déjàVenu[] = new boolean[nbCartes];
      for (int carte = 0; carte < nbCartes; carte++)
         déjàVenu[carte] = false;
      for (int entrée = 0; entrée < nbClients; entrée++)
      {
         int carte = clavier.nextInt();
         if (déjàVenu[carte])
         {
            System.out.println(carte);
            System.exit(0);
         }
         else
            déjàVenu[carte] = true;
      }
      System.out.println(-1);
   }
}