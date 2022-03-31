import algorea.Scanner;
class Main {
   public static void main(String[] args) {
      Scanner entrée = new Scanner(System.in);
      int nbProduits = entrée.nextInt();
      int quantités[] = new int[nbProduits];
      for (int produit = 0; produit < nbProduits; produit++)
         quantités[produit] = entrée.nextInt();
      int nbQuestions = entrée.nextInt();
      for (int question = 0; question < nbQuestions; question++)
      {
         int produit = entrée.nextInt();
         int opération = entrée.nextInt();
         quantités[produit - 1] += opération;
      }
      for (int quantité: quantités)
         System.out.print(quantité+" ");
   }
}