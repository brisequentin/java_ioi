import static algorea.Robot.*;

class Main {
   public static void main(String[] args) {
   
      for (int loop = 1; loop <= 2; loop = loop + 1) {
         gauche();
      }
      System.out.println("Bonjour, laissez-moi vous aider");
      ramasser();
      for (int loop = 1; loop <= 32; loop = loop + 1) {
         droite();
      }
      deposer();
   }
}