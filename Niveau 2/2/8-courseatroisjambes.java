import algorea.Scanner;
import java.util.Arrays;


class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int n = entree.nextInt();
      int[] tab = new int[n];
      for(int i=0; i<n; i++){
         tab[i] = entree.nextInt();
      }
      Arrays.sort(tab);
      for(int i=0; i<n/2; i++){
         System.out.println(tab[i]+" "+tab[n-i-1]); 
      }
   }
   
}