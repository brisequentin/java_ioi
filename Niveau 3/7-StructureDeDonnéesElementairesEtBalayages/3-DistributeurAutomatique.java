import algorea.Scanner;
class Main {
   public static void main(String[] args) {
      final int MAX_PRODUITS = 1000;
      int produits[] = new int[MAX_PRODUITS];
      
      Scanner entrée = new Scanner(System.in);     
      int nbOperations = entrée.nextInt();
      
      int posExtract = 0, posInsert = 0;
      for (int operation = 0; operation < nbOperations; operation++)
      {
         int quantité = entrée.nextInt();
         int date = entrée.nextInt();
         if (quantité > 0)
         {
            for (int produit = 0; produit < quantité; produit++)
            {
               produits[posInsert] = date;
               posInsert = (posInsert + 1) % MAX_PRODUITS;
            }
         }
         else
            posExtract = (posExtract - quantité) % MAX_PRODUITS;
      }
      int dateMin = produits[posExtract];
      posExtract = (posExtract + 1) % MAX_PRODUITS;
      while (posExtract != posInsert)
      {
         dateMin = Math.min(dateMin, produits[posExtract]);
         posExtract = (posExtract + 1) % MAX_PRODUITS;
      }
      System.out.println(dateMin);
   }
}