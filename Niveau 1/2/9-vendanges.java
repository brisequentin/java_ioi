import static algorea.Robot.*;

class Main {
   public static void main(String[] args){
      for (int i=1; i<=20; i++){
         ramasser();
         for (int v=1; v<=15;v++){
            droite();
         }
         deposer();
         for (int v=1; v<=15;v++){
            gauche();
         }
      }
   }
}