import algorea.Scanner;
class Main {
   public static void main(String[] args) {
      Scanner entrée = new Scanner(System.in);
      int nombre = entrée.nextInt();
      int nbCrochets = entrée.nextInt();
      encadrer(nombre,nbCrochets);
   }
   private static void encadrer(int nombre, int nbCrochets) {
      if (nbCrochets == 0) {
         System.out.print(nombre);
         return;
      }
      System.out.print("[");
      encadrer(nombre,nbCrochets-1);
      System.out.print("]");
   }
}