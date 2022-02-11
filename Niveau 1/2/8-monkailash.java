import static algorea.Robot.*;

class Main {
   public static void main(String[] args){
      for (int i=1; i<=108; i++) {
         for(int j=1; j<=13; j++) {
            haut();
         }
         for(int j=1; j<=13; j++) {
            droite();
         }
         for(int j=1; j<=13; j++) {
            bas();
         }
         for(int j=1; j<=13; j++) {
            gauche();
         }
      }
   }
}