import algorea.Scanner;
import java.util.Collections;


class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      char[] s = entree.nextLine().toUpperCase().toCharArray();
      double[] i = new double[26];
      
      for (char c : s){
         if ( Character.isLetter(c) ){
            i[(int)(c)-65] += 1;
         }
      }  

      int nblettre = 0;
      
      for (double d : i){
         nblettre += d;
      }  
      for (double d : i){
         System.out.println(d/nblettre);
      } 
      
   }
}