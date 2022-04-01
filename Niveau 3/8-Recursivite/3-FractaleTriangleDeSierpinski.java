import algorea.Scanner;
class Main {
   public static void main(String[] args) {
      Scanner entrée = new Scanner(System.in);
      int taille = entrée.nextInt();
      char[][] image = new char[taille][taille];
      for (int ligne = 0; ligne < taille; ligne++)
         for (int colonne = 0; colonne < taille; colonne++)
            image[ligne][colonne] = ' ';
            
      remplirTriangle( image, taille, 0, 0 );
      
      for (char[] ligne : image)
      {
         for (char pixel : ligne)
            System.out.print(pixel);
         System.out.println();
      }
   }
   private static void remplirTriangle(char[][] image, int taille, int lig, int col) {
      if (taille == 1) {
         image[lig][col] = '#';
         return;
      }
      taille = taille / 2;
      remplirTriangle( image, taille, lig, col );
      remplirTriangle( image, taille, lig + taille, col );
      remplirTriangle( image, taille, lig, col + taille );
   }
}