/* Écrivez un programme qui affiche une table de multiplication allant jusqu'à 20 fois 20. */

class Main {
    public static void main(String[] args) {
       for (int i=1; i<=20; i++){
          for (int v=1; v<=20; v++){
             System.out.print(i*v+" ");
          }
          System.out.println();
       }
    }
 }