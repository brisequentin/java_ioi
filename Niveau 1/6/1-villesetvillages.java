import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int nbInt = entree.nextInt();
      int nbVille = 0;
      for (int i=1; i<=nbInt; i++){
         if (entree.nextInt() > 10000){
            nbVille += 1;
         }
      }
      System.out.println(nbVille);
   }
}