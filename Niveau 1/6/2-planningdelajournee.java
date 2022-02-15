import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int pos = entree.nextInt();
      int nbInt = entree.nextInt();
      int nbVille = 0;
      for (int i=1; i<=nbInt; i++){
         int test = entree.nextInt();
         if ((pos-50<=test && test<=pos)  ||  (pos <= test && test<= pos+50)){
            nbVille += 1;
         }
      }
      System.out.println(nbVille);
   }
}
