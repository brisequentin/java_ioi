import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int nbInt = entree.nextInt();
      int maxKm= entree.nextInt();
      for (int i=1; i<=nbInt-1; i++){
         int test = entree.nextInt();
         if (maxKm<test){
            maxKm = test;
         }
      }
      System.out.println(maxKm);
   }
}
