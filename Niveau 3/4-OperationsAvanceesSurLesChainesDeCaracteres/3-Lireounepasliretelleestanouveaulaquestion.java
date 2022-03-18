import algorea.Scanner;
import java.util.Arrays;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int n = entree.nextInt();
      String[] livres = new String[n];
      String[] livres2 = new String[n];
      
      for (int i=0; i<n; i++){
         String var = entree.nextLine();
         livres[i] = var;
         livres2[i] = var;
      }
      Arrays.sort(livres2);
      int indexTri = 0;
      int indexNor = 0;

      for (int i=0; i<n; i++){
         indexNor = Arrays.asList(livres2).indexOf(livres[i]);
         
         if (indexNor>=indexTri){
            System.out.println(livres[i]);
            indexTri = indexNor;
         }
      }
   }
}