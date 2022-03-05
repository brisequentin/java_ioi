import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int n = entree.nextInt();
      
      double[] tab = new double[n];
      double cumul = 0;
      
      for (int i=0; i<n; i++){
         tab[i] = entree.nextDouble();
         cumul += tab[i];
      }
      for (int i=0; i<n; i++){
         System.out.println( (cumul/n) - tab[i]);

      }
      
      
   }
}