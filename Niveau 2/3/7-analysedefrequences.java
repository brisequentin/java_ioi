import algorea.Scanner;

class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int nLigne = entree.nextInt();
      int nMot = entree.nextInt();
      
      int[] tab = new int[101];
      
      for (int i=0; i<nLigne; i++){
         for(int y=0; y<nMot; y++){
            int len = entree.next().length();
            tab[len] += 1;
         }
      }
      for(int i=0; i<101; i++){
         if(tab[i] != 0){
            System.out.println(i+" : "+tab[i]);
         }
      }
   }
}