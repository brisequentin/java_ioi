import algorea.Scanner;
class Main
{
   static int[][] nombresCarré;
   static int tailleGrille;
   
   public static void main(String[] args)
   {
      Scanner entrée = new Scanner(System.in);
      tailleGrille = entrée.nextInt();
      nombresCarré = new int[tailleGrille][tailleGrille];
      for (int ligne = 0; ligne < tailleGrille; ligne++)
         for (int colonne = 0; colonne < tailleGrille; colonne++)
            nombresCarré[ligne][colonne] = entrée.nextInt();
      if (tousNombresPrésents() && totauxCorrects())
         System.out.println("yes");
      else
         System.out.println("no");
   }
   
   static int totalPourDirection(int linDepart, int colDepart, int deltaLin, int deltaCol)
   {
      int lin = linDepart, col = colDepart, total = 0;
      
      for (int position = 0; position < tailleGrille; position++)
      {
         total += nombresCarré[lin][col];
         lin += deltaLin;
         col += deltaCol;
      }
      return total;
   }
   
   static boolean totauxCorrects()
   {
      int total = totalPourDirection(0, 0, 1, 1);
      
      if (totalPourDirection(0, tailleGrille - 1, 1, -1) != total)
         return false;
      
      for (int ligne = 0; ligne < tailleGrille; ligne++)
         if (totalPourDirection(ligne, 0, 0, 1) != total)
            return false;
      
      for (int colonne = 0; colonne < tailleGrille; colonne++)
         if (totalPourDirection(0, colonne, 1, 0) != total)
            return false;
      return true;
   }
   
   static boolean tousNombresPrésents()
   {
      int maxVal = tailleGrille * tailleGrille + 1;
      boolean[] présents = new boolean[maxVal];
      
      for (int nombre = 0; nombre < maxVal; nombre++)
         présents[nombre] = false;
      for (int ligne = 0; ligne < tailleGrille; ligne++)
         for (int colonne = 0; colonne < tailleGrille; colonne++)
         {
            int nombre = nombresCarré[ligne][colonne];
            if ((nombre <= 0) || (nombre >= maxVal) || présents[nombre])
               return false;
            présents[nombre] = true;
         }
      return true;
   }
}