
import java.io.IOException;
import static java.lang.Character.isLowerCase;
import static java.lang.Character.isWhitespace;
class Main {
   static char[][] échiquier;
   
   /**
    * @param args
    * @throws IOException
    */
   public static void main(String[] args) throws IOException {
      échiquier = new char[8][8];
      for (int ligne = 0; ligne < 8; ligne++)
         for (int colonne = 0; colonne < 8; colonne++)
            échiquier[ligne][colonne] = lire_caractere();
      
      int mvts[][] = {{-2,-1},{-2,+1},{-1,-2},{-1,+2},{+1,-2},{+1,+2},{+2,-1},{+2,+1}};
      
      for (int ligne = 0; ligne < 8; ligne++)
         for (int colonne = 0; colonne < 8; colonne++)
            if (échiquier[ligne][colonne] == 'C')
               for (int mvt = 0; mvt < 8; mvt++)
                  if (isLowerCase( pièce(ligne + mvts[mvt][0], colonne + mvts[mvt][1]) ))
                  {
                     System.out.println("yes");
                     return;
                  }
      System.out.println("no");
   }
   private static char pièce(int ligne, int colonne) {
      if ((ligne < 0) || (ligne >= 8) || (colonne < 0) || (colonne >= 8))
         return ' ';
      return échiquier[ligne][colonne];
   }
   private static char lire_caractere() throws IOException {
      char caractere = (char) System.in.read();
      while (isWhitespace(caractere))
         caractere = (char) System.in.read();
      return caractere;
   }
}