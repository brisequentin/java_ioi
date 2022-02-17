import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int n = entree.nextInt();
      int positif = 0;
      int negatif = 0;
      int input;
      for (int i=1; i<=n; i++){
         input = entree.nextInt();
         if (input>0){
            positif += input;
         } else {
            negatif -= input;
         }
      }
      System.out.println(positif);
      System.out.println(negatif);
   }
}