import static algorea.Robot.*;

class Main {
   public static void main(String[] args){
   
      haut();
      for (int v=1; v<=4; v++){
         for (int i=1; i<=8; i++){
         haut();
         }
         droite();
         for (int i=1; i<=8; i++){
         bas();
         }
         droite();
      }
      for (int i=1; i<=8; i++){
         haut();
         }
      droite();
      for (int i=1; i<=8; i++){
         bas();
      }
      bas();
      for (int i=1; i<=9; i++){
         gauche();
      }
   }
}