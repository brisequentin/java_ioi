import algorea.Scanner;
import java.util.Arrays;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int n = entree.nextInt();
      
      int[] tab = new int[n];
      for (int i=0; i<n; i++){
        tab[i] = entree.nextInt(); 
      }
      Arrays.sort(tab);
         
      
      if (n%2==0){
         double moy = tab[(n/2)-1] + tab[(n/2)];
         
         moy /= 2;
         System.out.println(moy);
         
      } else { 
         System.out.println(tab[(n/2)+1]);
      }
      
   }
}