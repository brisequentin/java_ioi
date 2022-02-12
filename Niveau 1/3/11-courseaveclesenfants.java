import static algorea.Robot.*;
class Main {
   public static void main(String[] args) {
      for (int i=1; i<=10;i++){
         for(int v=1;v<=i;v++){
            droite();
         }
         ramasser();
         for(int v=1;v<=i;v++){
            gauche();
         }
         deposer();
      }
   }
}