import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int n = entree.nextInt();
      ligneCaractères('X', n);
      ligneCaractères('#', n);
      ligneCaractères('i', n);
   }
   
   static void ligneCaractères(char caractère, int longueur) {
      for (int iCol = 0; iCol < longueur; iCol = iCol + 1) {
         System.out.print(caractère);
      }
      System.out.println();
   }

}