import algorea.Scanner;
class Main {
   public static void main(String[] args) {
      Scanner entrée = new Scanner(System.in);
      int nbDisques = entrée.nextInt();
      déplacerDisques( nbDisques, 1, 2, 3 );
      }
   private static void déplacerDisques(int nbDisques, int début, int autre, int fin) {
      if (nbDisques != 0)
      {
         nbDisques--;
         déplacerDisques( nbDisques, début, fin, autre );
         System.out.println( début + " -> " + fin );
         déplacerDisques( nbDisques, autre, début, fin );
      }
   }
}