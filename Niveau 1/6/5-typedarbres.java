/*
le "Tinuviel" fait moins de 5 mètres de haut et ses feuilles sont composées de plus de 8 folioles
le "Calaelen" fait plus de 10 mètres de haut et ses feuilles sont composées de plus 10 folioles
le "Falarion" fait moins de 8 mètres de haut et ses feuilles sont composées de moins de 5 folioles
le "Dorthonion" fait plus de 12 mètres de haut et ses feuilles sont composées de moins de 7 folioles
Votre programme lira deux entiers, la hauteur et le nombre de folioles de l'arbre, et affichera le nom de l'arbre correspondant.
Toutes les inégalités sont à prendre au sens large, c'est-à-dire que "moins" signifie "moins ou égal" ou et "plus" signifie "plus ou égal". */

import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int a = entree.nextInt();
      int b = entree.nextInt();
     
      if (a<=5 && b>=8){
         System.out.println("Tinuviel");
      } else if ( a>=10 && b>=10){
         System.out.println("Calaelen");
      } else if ( a<= 8 && b<=5) {
         System.out.println("Falarion");
      } else if (a>=12 && b<=7){
         System.out.println("Dorthonion");
      }
      
   }
}