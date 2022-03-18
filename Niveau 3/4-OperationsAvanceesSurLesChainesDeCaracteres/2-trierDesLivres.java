import algorea.Scanner;
import java.util.Arrays;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int n = entree.nextInt();
      String[] livres = new String[n];
      for (int i=0; i<n; i++){
         livres[i] = entree.nextLine();
      }
      Arrays.sort(livres);
      for (int i=0; i<n; i++){
         System.out.println(livres[i]);
      }
   }
}