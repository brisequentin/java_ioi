import algorea.Scanner;
class Main {
   public static void main(String[] args) {
      Scanner entrée = new Scanner(System.in);
      int début = entrée.nextInt();
      int fin = entrée.nextInt();
      afficherNombreEntre( début, fin );
      }
   private static void afficherNombreEntre(int début, int fin) {
      System.out.print( début );
      if (début == fin)
      {
         System.out.println();
         return;
      }
      System.out.print( " " );
      afficherNombreEntre( début + 1, fin );
   }
}