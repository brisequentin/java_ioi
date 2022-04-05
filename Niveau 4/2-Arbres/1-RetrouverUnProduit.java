import algorea.Scanner;
import java.util.*;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int n = entree.nextInt();
      int[] tab = new int[n];
      for (int i=0; i<n; i++){
         tab[i] = entree.nextInt();
      }
      n = entree.nextInt();
      for (int i=0; i<n; i++){
         int val = entree.nextInt();
         List myList = new ArrayList();
         while(tab[val-1] != 0){
            myList.add(val);
            val = tab[val-1];
         }
         myList.add(val);
         for (int v = myList.size()-1; v >= 0; v--){
            System.out.print(myList.get(v)+" ");
         }
         System.out.println();
      }
   }
}