/*
Votre programme devra déterminer puis afficher le nombre de maisons qui se trouvent dans la zone de recherche. Si une maison est exactement sur le bord de la zone, elle doit ête comptée.
*/
import algorea.Scanner;
class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int xmin = entree.nextInt();
      int xmax = entree.nextInt();
      int ymin = entree.nextInt();
      int ymax = entree.nextInt();
      
      int n = entree.nextInt();
      
      int x;
      int y;
      
      int compteur = 0;
      
      for (int i=1; i<=n; i++){
         x = entree.nextInt();
         y = entree.nextInt();
         
         if ( (xmin<=x && x<=xmax) && (ymin<=y && y<=ymax) ){
            compteur += 1;
         } 
      }
      System.out.println(compteur);
   }
}